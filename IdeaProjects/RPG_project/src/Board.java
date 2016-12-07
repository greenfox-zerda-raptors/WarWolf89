import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;



public class Board extends JPanel implements KeyListener {

    GameObject myHero = new Hero(0,0);
    Area map= new Area();

    public Board() {

        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
        addKeyListener(this);
        setFocusable(true);

    }

    @Override
    public void paint(Graphics graphics){
        map.draw(graphics);
        myHero.draw(graphics);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP : {
                myHero.moveHeroUp(map);
                break;
            }
            case KeyEvent.VK_DOWN : {
                myHero.moveHeroDown(map);
                break;
            }
            case KeyEvent.VK_RIGHT : {
                myHero.moveHeroRight(map);
                break;
            }case KeyEvent.VK_LEFT : {
                myHero.moveHeroLeft(map);
                break;
            }
            default:{
                break;
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}