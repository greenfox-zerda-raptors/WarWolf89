import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Consecutives {

    private static List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);

    public static void main(String[] args) {
        System.out.println(sumConsecutives(i));
    }

    public static List<Integer> sumConsecutives(List<Integer> s) {
        ArrayList<Integer> sumOfNumbers = new ArrayList<>();
        for (int j=1; j<i.size(); j++) {
            Integer numberOne = i.get(j-1);
            Integer numberTwo = i.get(j);
            if (numberOne == numberTwo){
                Integer sum = numberOne + numberTwo;
                sumOfNumbers.add(sum);
            }
        }
       return sumOfNumbers;
    }
}
