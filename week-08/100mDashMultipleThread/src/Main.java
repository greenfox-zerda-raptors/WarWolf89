import javax.swing.*;

/**
 * Created by almasics on 2016.12.15..
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
