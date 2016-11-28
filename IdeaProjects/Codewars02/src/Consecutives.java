import sun.awt.image.IntegerInterleavedRaster;

import java.util.*;

public class Consecutives {

    static List<Integer> i = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3,1);
    public static void main(String[] args) {
        System.out.println(sumConsecutives(i));
    }

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> i = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3,1);
        ArrayList<Integer> sumOfNumbers = new ArrayList<>();
        Integer firstNumber;
        Integer secondNumber;
        Integer sumNumbers;

        for (int j = 0; j < i.size()-1; j++) {
                firstNumber = i.get(j);
                secondNumber = i.get(j+1);

            if (firstNumber == secondNumber){
                sumNumbers= firstNumber + secondNumber;
                sumOfNumbers.add(sumNumbers);
            }

            else {
                sumOfNumbers.add(firstNumber);
            }
        }

        sumOfNumbers.add(i.get(i.size() - 1));
        return sumOfNumbers;
    }
}
