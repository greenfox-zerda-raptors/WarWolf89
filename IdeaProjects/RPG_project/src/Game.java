import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class Game extends JFrame {

    public Game() {
        //Create and set up the window.
        new JFrame("maszkalos"); //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //Add content to the window.
        JPanel board = new Board();
        this.add(board);

        //Display the window.
        this.pack(); //pack must be before setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);


        this.setVisible(true);

    }


}
