import javax.swing.*;
import java.awt.*;

/**
 * Created by almasics on 2016.12.15..
 */

public class MainFrame extends JFrame {

    private JButton start;
    private JLabel statusTrackerTeamOne;
    private JLabel statusTrackerTeamTwo;
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

        statusTrackerTeamOne = new JLabel("Race status");
        mainPanel.add(statusTrackerTeamOne);

        statusTrackerTeamTwo = new JLabel("Race status");
        mainPanel.add(statusTrackerTeamTwo);

        start = new JButton("Start the race");
        add(start, BorderLayout.PAGE_END);

        start.addActionListener(e -> start());


    }

    private void start() {
        Sprinter sprinter = new TeamUnitedStates(statusTrackerTeamOne);
        Sprinter sprinter2 = new TeamChina(statusTrackerTeamTwo);
    }
}
