/**
 * Created by almasics on 2016.11.08..
 */
import java.util.*;
public class Workshop02 {
    public static void main(String[] args) {
        String[] numbers = new String[]{"one", "two", "three", "four", "five"};

        for (int i = 0; i <= numbers.length; i++) {
            System.out.print(i);
            try {
                System.out.print("=" + numbers[i] + "\n");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("(IndexOutOfBoundsException)");
            }

        }
        System.out.println("Finish line");
    }
}
