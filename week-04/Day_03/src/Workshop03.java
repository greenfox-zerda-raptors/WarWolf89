/**
 * Created by almasics on 2016.11.08..
 */
import java.util.*;

public class Workshop03 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        Integer number =-1;
        while ( number !=0 ) {
            System.out.print("INPUT or 0 to end?");
            try {
                number = userInput.nextInt();
                System.out.println();
                System.out.println("Yum " + Integer.toString(number).substring(0, Integer.toString(number).length() / 2));
            }
            catch (InputMismatchException e) {
                System.out.println("Fucked Up");
            }
            userInput.nextLine();

        }
        System.out.println("Bye");
    }
}
