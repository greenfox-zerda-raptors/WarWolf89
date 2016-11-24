/**
 * Created by almasics on 2016.11.23..
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class HelloWorld extends JFrame {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


    public HelloWorld(){
        JFrame myFrame = new JFrame();
        JPanel myPanel = new JPanel();
        myFrame.add(myPanel);
        myFrame.pack();
        myFrame.setVisible(true);
        JLabel helloWorld = new JLabel("Hello World");

        myPanel.add(helloWorld);
        this.add(myPanel);
        this.setSize(400,400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (String i: hellos ) {
            myPanel.add(new JLabel(i));

        }
    }

}
