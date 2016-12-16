import javax.swing.*;
import java.awt.*;

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

        start.addActionListener(e -> start());


    }

    private void start() {
        SwingWorker<String, Void> worker = new SwingWorker<String, Void>() {
            @Override
            protected String doInBackground() throws Exception {
                Sprinter sprinter1 = new TeamUnitedStates();
                Sprinter sprinter2 = new TeamChina();
                Thread sprintthread1 = new Thread(sprinter1);
                Thread sprintthread2 = new Thread(sprinter2);
                sprintthread1.start();
                sprintthread2.start();
                return sprintthread1.toString();
            }

        };
        worker.execute();
    }
}
