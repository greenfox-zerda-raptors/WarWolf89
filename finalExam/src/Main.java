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
        firstString = "bcdefaaaaaaafgfdbnm";
        secondString = "nmsdfdsjfs";
        System.out.println(checkString(firstString, secondString));
    }


    public static Set<Character> checkString(String firstString, String secondString) {


        char[] first = firstString.toLowerCase().toCharArray();
        char[] second = secondString.toLowerCase().toCharArray();
        ArrayList<Character> returnArray = new ArrayList<>();

        for (char aFirst : first) {
            for (char aSecond : second) {
                if (aSecond == aFirst)
                    returnArray.add(aFirst);
            }
        }
        int end = returnArray.size();
        Set<Character> set = new HashSet<Character>();

        set.addAll(returnArray);
        return set;
    }
}
