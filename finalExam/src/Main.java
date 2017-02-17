import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by almasics on 2017.02.17..
 */
public class Main {

    private static String firstString;
    private static String secondString;

    public static void main(String[] args) {
        firstString = "nmsdfdsjfs";
        secondString = "bcdefaaaaaaafgfdbnm";
        System.out.println(checkString(firstString, secondString));
    }


    public static Set<Character> checkString(String firstString, String secondString) {


        char[] first = firstString.toLowerCase().toCharArray();
        char[] second = secondString.toLowerCase().toCharArray();
        ArrayList<Character> returnArray = new ArrayList<>();

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (second[j] == first[i])
                    returnArray.add(first[i]);
            }
        }
        int end = returnArray.size();
        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < end; i++) {
            set.add(returnArray.get(i));
        }
        return set;
    }
}
