/**
 * Created by almasics on 2016.11.07..
 */

import java.util.ArrayList;
import java.util.Arrays;
public class Workshop10 {
    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array
        int [] numberArray = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            numberArray[i] = numList.get(i);
        }
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);

        }
    }
}
