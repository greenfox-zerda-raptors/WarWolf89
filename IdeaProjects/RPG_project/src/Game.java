import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class Game extends JFrame {

    public Game() {
        new JFrame("maszkalos"); //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        JPanel board = new Board();
        this.add(board);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
