import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


/**
 * Created by zoloe on 2016. 12. 05..
 */
public class Board extends JPanel {
    GameObject myHero;
    Area map;

    public Board() {


        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
        myHero = new Hero(0,0);
        map = new Area();
    }

    @Override

    public void paint(Graphics graphics){

        map.draw(graphics);
        myHero.draw(graphics);

    }
}