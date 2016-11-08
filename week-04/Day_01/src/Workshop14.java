import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by almasics on 2016.11.07..
 */
public class Workshop14 {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("second", "third", "fourth"));
        list.add(0,"first");
        list.add(list.size(), "fifth");
        // Add "first" to the beginning of the list and add "fifth" to the end of the list
        // Expected output: [first, second, third, fourth, fifth]

        System.out.println(list);
    }
}
