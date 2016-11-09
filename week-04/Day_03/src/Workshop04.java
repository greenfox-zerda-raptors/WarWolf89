/**
 * Created by almasics on 2016.11.09..
 */
import java.util.*;
public class Workshop04 {
    public static void main(String[] args){

        int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
        String two = "2";

        System.out.println("Testing ...");
        try {a[2] = a[3]/a[0];}
        catch (ArithmeticException e) {

        }
        System.out.println("Past hurdle 1");
        try {a[9] = Integer.parseInt(two);}
        catch (ArrayIndexOutOfBoundsException e) {

        }
        System.out.println("Past hurdle 2");
        try {a[10] = Integer.parseInt("ten");}
        catch (NumberFormatException e) {

        }
        System.out.println("Past hurdle 3...  And I realized perhaps I'm wrong");
        try {a[10] = 10;}
        catch (ArrayIndexOutOfBoundsException e){

        }
        System.out.println("Past hurdle 4");
        two = "two";
        System.out.println("Past hurdle 5");
        try {a[9] = Integer.parseInt(two);}
        catch (NumberFormatException e){

        }

        System.out.println("*** FINISH LINE ***");
    }
}
