import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by almasics on 2016.11.23..
 */
public class Counter extends JFrame {

    private JLabel labelCount;
    private JButton clickButton;
    private JButton resetButton;
    private int clicks = 0;

    public Counter() {
        CreateView();
        setTitle("I need to be clicked");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void updateCounter(){
        labelCount.setText("Clicked " + clicks + " Times");
    }

    public void CreateView (){
        JPanel myPanel = new JPanel();
        getContentPane().add(myPanel);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension(200,20));
        myPanel.add(labelCount);

        clickButton = new JButton("Click me");
        myPanel.add(clickButton);
        clickButton.addActionListener(new ClickButtonCounterListener());

        resetButton = new JButton("Reset");
        resetButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks=0;
                        updateCounter();
                    }
                }
        );
        myPanel.add(resetButton);
        }

    private class ClickButtonCounterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();
        }
    }
}


