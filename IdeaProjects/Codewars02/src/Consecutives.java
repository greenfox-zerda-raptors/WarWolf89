import sun.awt.image.IntegerInterleavedRaster;

import java.util.*;

public class Consecutives {

    private static List<Integer> i = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1);

    public static void main(String[] args) {
        System.out.println(sumConsecutives(i));
    }

    public static List<Integer> sumConsecutives(List<Integer> s) {

        ArrayList<Integer> sumOfNumbers = new ArrayList<>();
        List<Integer> i = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3,1);
        Integer firstNumber;
        Integer secondNumber;
        Integer sumFirstAndSecond;

        for (int j = 0; j < i.size()-1; j++) {
                firstNumber = i.get(j);
                secondNumber = i.get(j+1);

            if (firstNumber == secondNumber){
                sumFirstAndSecond = firstNumber + secondNumber;
                sumOfNumbers.add(sumFirstAndSecond);
            }

            else {
                sumOfNumbers.add(firstNumber);
                sumOfNumbers.add(secondNumber);
                }
        }

        sumOfNumbers.add(i.get(i.size() - 1));
        return sumOfNumbers;
    }
}
