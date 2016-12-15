import javax.swing.*;
import java.awt.*;

/**
 * Created by almasics on 2016.12.15..
 */

public class GUI extends JFrame {

    private JButton start;
    private JLabel statusTracker;
    private Toolkit tk = Toolkit.getDefaultToolkit();

    public GUI() {
        createGUI();
    }

    private void createGUI() {

        this.pack();
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setTitle("100m Hurdle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainPanel = new JPanel();
        mainPanel.setSize(new Dimension(600, 400));
        add(mainPanel, BorderLayout.CENTER);

        start = new JButton("Start the race");
        add(start, BorderLayout.PAGE_END);


    }
}
