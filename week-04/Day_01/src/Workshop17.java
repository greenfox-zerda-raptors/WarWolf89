/**
 * Created by almasics on 2016.11.07..
 */
import java.util.*;

public class Workshop17{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        List<Integer> contains = new ArrayList <Integer>(Arrays.asList(4,8,12,16));
        /*I know this can be done with a boolean, too tired to do it tho*/
        if (list.containsAll(contains)) {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }

}

