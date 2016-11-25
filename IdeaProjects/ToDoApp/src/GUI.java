/**
 * Created by almasics on 2016.11.25..
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    private JButton addTask, removeTask, completeTask;
    private JTextField textField;
    Toolkit tk = Toolkit.getDefaultToolkit();

    public GUI() {
        createGUI();
        setVisible(true);
        setTitle("The To-Do App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new BorderLayout());

        addTask=new JButton("Add a task");
        //actionlistener and actionperformed here
        myPanel.add(addTask);

        removeTask=new JButton("Remove task");
        myPanel.add(removeTask);

        completeTask=new JButton("Complete Task");
        myPanel.add(completeTask);

        textField = new JTextField();
        myPanel.add(textField);


    }

    private void createGUI(){
        Dimension dim = tk.getScreenSize();
        this.setSize(dim);
        int xPos = (dim.width /2 ) - (this.getWidth()/2);
        int yPos = (dim.height /2 ) - (this.getHeight()/2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);



    }

}
