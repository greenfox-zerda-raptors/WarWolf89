import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by almasics on 2016.12.15..
 */

public class MainFrame extends JFrame {

    private JButton start;
    private JLabel statusTracker;
    private Toolkit tk = Toolkit.getDefaultToolkit();

    public MainFrame() {
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

        statusTracker = new JLabel("Race status");
        mainPanel.add(statusTracker);

        start = new JButton("Start the race");
        add(start, BorderLayout.PAGE_END);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });


    }

    private void start() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                return null;
            }
        }

    }
}
