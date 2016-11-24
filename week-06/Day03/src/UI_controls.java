import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by almasics on 2016.11.23..
 */
public class UI_controls extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private JLabel inputText;
    private JLabel previousText;
    private JTextField textField;
    private JButton clearButton;
    private String newText;
    public static final String TEXT_TITLE = "Text : ";
    public static final String MEMORY_TITLE = "Memory : ";
    public UI_controls() {
        UI_layout();
        setTitle("UI sample");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);

    }

    private void UI_layout (){
//        JFrame myFrame = new JFrame();
        JPanel myPanel = new JPanel();
        myPanel.setPreferredSize(new Dimension(300,200));
        getContentPane().add(myPanel);
//        myFrame.add(myPanel);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300,30));
        textField.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
        );
        myPanel.add(textField);

        inputText =new JLabel(TEXT_TITLE);
        inputText.setPreferredSize(new Dimension(300,20));
        myPanel.add(inputText);

        previousText =new JLabel(MEMORY_TITLE);
        previousText.setPreferredSize(new Dimension(300,20));
        myPanel.add(previousText);

        clearButton = new JButton("Reset");
        clearButton.setEnabled(false);
        clearButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (actionEvent.getSource() == clearButton) {
                            clearButton.setEnabled(false);
                        }
                        previousText.setText("");
                    }
                }
        );
        myPanel.add(clearButton);
    }

}

//    public void actionPerformed(ActionEvent actionEvent) {
//        -        if (actionEvent.getSource() == clearMemoryButton) {
//            -            memoryLabel.setText(MEMORY_TITLE);
//            -            clearMemoryButton.setEnabled(false);
//            -        } else {
//            -            String previousText = textLabel.getText();
//            -            String previousValue = previousText.split(":")[1].trim();
//            -            textLabel.setText(TEXT_TITLE + textField.getText());
//            -            memoryLabel.setText(MEMORY_TITLE + previousValue);
//            -            if (previousValue != null && !previousValue.isEmpty()) {
//                -                clearMemoryButton.setEnabled(true);
//                -            }
//            -        }
//        -    }