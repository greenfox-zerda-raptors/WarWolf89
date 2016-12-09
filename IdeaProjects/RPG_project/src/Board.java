import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Board extends JPanel implements KeyListener {

    private Random rand = new Random();
    private GameCharacter myHero = new Hero(0, 0);
    private Area map = new Area();
    private ArrayList<GameCharacter> list = new ArrayList<>();

    public Board() {
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
        addKeyListener(this);
        setFocusable(true);
        enemyAddMethod(map);
    }

    @Override
    public void paint(Graphics graphics) {
        map.draw(graphics);
        myHero.draw(graphics);
        for (GameCharacter gameCharacter : list) {
            gameCharacter.draw(graphics);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: {
                myHero.moveHeroUp(map);
                myHero.modifyGameObjectImage("images/hero-up.png");
                break;
            }
            case KeyEvent.VK_DOWN: {
                myHero.moveHeroDown(map);
                myHero.modifyGameObjectImage("images/hero-down.png");
                break;
            }
            case KeyEvent.VK_RIGHT: {
                myHero.moveHeroRight(map);
                myHero.modifyGameObjectImage("images/hero-right.png");
                break;
            }
            case KeyEvent.VK_LEFT: {
                myHero.moveHeroLeft(map);
                myHero.modifyGameObjectImage("images/hero-left.png");
                break;
            }
            case KeyEvent.VK_SPACE: {
                heroFight(map);
                break;
            }
            default: {
                break;
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private void enemyAddMethod(Area map) {
        int n = rand.nextInt(3) + 3;
        for (int i = 0; i <= n; i++) {
            int randomPosX = rand.nextInt(10);
            int randomPosY = rand.nextInt(10);
            int bossPosX = rand.nextInt(10);
            int bossPosY = rand.nextInt(10);
            if (i == 1) {
                while (map.isWall(bossPosX, bossPosY) || (bossPosX == 0 && bossPosY == 0)) {
                    bossPosX = rand.nextInt(10);
                    bossPosY = rand.nextInt(10);
                }
                GameCharacter boss = new Boss(bossPosX, bossPosY);
                list.add(boss);
            }
            while (map.isWall(randomPosX, randomPosY) || (randomPosX == 0 && randomPosY == 0) || (bossPosX == randomPosX && bossPosY == randomPosY)) {
                randomPosX = rand.nextInt(10);
                randomPosY = rand.nextInt(10);
            }
            GameCharacter skeleton = new Skeleton(randomPosX, randomPosY, String.format("skeleton %d", n));
            /*if a I have time, will add a method that checks for skeleton positions*/
            list.add(skeleton);
        }
    }

    private void heroFight(Area map) {
        Iterator<GameCharacter> iter = list.iterator();
        while (iter.hasNext()) {
            GameCharacter gameCharacter = iter.next();
            int posX = gameCharacter.getPosX();
            int posY = gameCharacter.getPosY();
            if (myHero.getPosX() == posX && myHero.getPosY() == posY) {
                do {
                    gameCharacter.health -= myHero.damage;
                    System.out.println(String.format("monster health is: %d", gameCharacter.health));
                    myHero.health -= gameCharacter.damage;
                    System.out.println(String.format("hero health is: %d", myHero.health));
                    if (gameCharacter.health <= 0) {
                        gameCharacter.setAlive(false);
                        iter.remove();
                    }
                    if (myHero.health <= 0) {
                        myHero.setAlive(false);
                        myHero.setImage(null);
                        onHeroDeathEvent();
                    }
                }
                while (gameCharacter.isAlive() && myHero.isAlive());
            }
        }
    }

    private void onHeroDeathEvent() {
        /* what this still needs: fade in delay, new buttons, button actionlisteners, a restart method */
        Object[] options = {"Start new game",
                "No, thanks",
        };
        ImageBackgroundPane panel = new ImageBackgroundPane();
        int n = JOptionPane.showOptionDialog(this, panel,
                "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[1]);
//        int n = JOptionPane.showOptionDialog(this,
//                "Would you like to start new Game?",
//                "",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.QUESTION_MESSAGE,
//                null,
//                options,
//                options[1]);
    }

    private void onBossDeathEvent() {
        /*this will be the win condition, on Boss death willl trigger portal, that will generate new map*/
    }

}