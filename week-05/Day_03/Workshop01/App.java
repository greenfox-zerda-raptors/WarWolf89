/**
 * Created by almasics on 2016.11.16..
 */
import main.java.music.*;
public class App {
    public static void main(String[] args) {

        System.out.println("Test 1, create ElectricGuitar, Bass and Violin with default strings.");
        Electric_Guitar guitar = new Electric_Guitar();
        Electric_Bass_Guitar bassGuitar = new Electric_Bass_Guitar();
        Violin violin = new Violin();

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

          System.out.println("Test 2, create ElectricGuitar, Bass with 7 and 5 strings .");
          guitar = new Electric_Guitar(7);
          bassGuitar = new Electric_Bass_Guitar(5);

        System.out.println("Test 2 Play");
        guitar.play();
        bassGuitar.play();
    }
}
