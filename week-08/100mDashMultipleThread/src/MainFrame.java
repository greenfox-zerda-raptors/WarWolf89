import javax.swing.*;
import java.awt.*;

/**
 * Created by almasics on 2016.12.15..
 */

public class MainFrame extends JFrame {

    private JButton start, threadControl;
    private JLabel statusTrackerTeamOne;
    private JLabel statusTrackerTeamTwo;
    private Toolkit tk = Toolkit.getDefaultToolkit();
    Sprinter sprinter, sprinter2;

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

        statusTrackerTeamOne = new JLabel("Race status for team one");
        mainPanel.add(statusTrackerTeamOne);

        statusTrackerTeamTwo = new JLabel("Race status for team two");
        mainPanel.add(statusTrackerTeamTwo);

        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.PAGE_END);

        start = new JButton("Start the race");
        add(start = new JButton("Start the race"));
        buttonPanel.add(start);
        threadControl = new JButton("Pause the race");
        add(threadControl = new JButton("Pause the race"));
        buttonPanel.add(threadControl);

        start.addActionListener(e -> start());
        threadControl.addActionListener(e -> suspend());


    }

    private void start() {
        sprinter = new TeamUnitedStates(statusTrackerTeamOne);
        sprinter.startExecution();
        sprinter2 = new TeamChina(statusTrackerTeamTwo);
        sprinter2.startExecution();
    }

    private void suspend() {
        sprinter.cancelExecution();
        sprinter2.cancelExecution();
    }
}
