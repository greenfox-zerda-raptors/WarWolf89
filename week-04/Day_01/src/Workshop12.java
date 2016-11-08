/**
 * Created by almasics on 2016.11.07..
 */
import java.util.ArrayList;
import java.util.Random;

public class Workshop12 {
    public static void main(String... args){
        ArrayList<String> arrayList = new ArrayList<String>();
        int random = new Random().nextInt(20);
        for(int i=0;i<20;i++){
            if(i == random){
                arrayList.add("removable");
            }
            arrayList.add("" + i);
        }
        // Remove "removable" from the list, but without using the index of the element.
        arrayList.remove("removable");

        System.out.println(arrayList);
    }
}
