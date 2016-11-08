/**
 * Created by almasics on 2016.11.07..
 */

import java.util.ArrayList;
import java.util.Arrays;
public class Workshop07 {
    public static void main(String... args){
        String[] numbers = new String[] { "one", "two", "three", "four", "five"};
        // Initialize the arrayList using the numbers array
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(numbers));

        System.out.println(myList);
    }
}
