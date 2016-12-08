import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JPanel implements KeyListener {

    Random rand = new Random();
    GameCharacter myHero = new Hero(0, 0);
    Area map = new Area();
    ArrayList<GameCharacter> list = new ArrayList<>();


    public Board() {
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
        addKeyListener(this);
        setFocusable(true);
        skeletonAddMethod(map);
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
                break;
            }
            case KeyEvent.VK_DOWN: {
                myHero.moveHeroDown(map);
                break;
            }
            case KeyEvent.VK_RIGHT: {
                myHero.moveHeroRight(map);
                break;
            }
            case KeyEvent.VK_LEFT: {
                myHero.moveHeroLeft(map);
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

    public void skeletonAddMethod(Area map) {
        int n = rand.nextInt(3) + 3;
        for (int i = 0; i <= n; i++) {
            int randomPosX = rand.nextInt(10);
            int randomPosY = rand.nextInt(10);
            while (map.isWall(randomPosX, randomPosY) || (randomPosX == 0 && randomPosY == 0)) {
                randomPosX = rand.nextInt(10);
                randomPosY = rand.nextInt(10);
            }
            GameCharacter skeleton = new Skeleton(randomPosX, randomPosY, String.format("skeleton %d", n));
            list.add(skeleton);
        }
    }

    public void heroFight(Area map) {
        for (GameCharacter gameCharacter : list) {
            int posX = gameCharacter.getPosX();
            int posY = gameCharacter.getPosY();
            if (myHero.getPosX() == posX && myHero.getPosY() == posY) {
                System.out.println("Fight lesz more");
            }
        }


    }
}