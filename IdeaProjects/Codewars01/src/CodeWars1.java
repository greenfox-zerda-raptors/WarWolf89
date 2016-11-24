/**
 * Created by almasics on 2016.11.24..
 */
public class CodeWars1 {
    public static void main(String[] args) {

        System.out.println(CodeWars1.persistence(524237423));

    }

    public static int persistence(long n) {

        int multiply;
        String numberString = String.valueOf(n);
        if (n<10){
            System.out.println(0);
        }
        do {
            multiply=1;
            char[] charArray = numberString.toCharArray();
            int[] workingNumber = new int[charArray.length];

            for (int i = 0; i < charArray.length; i++) {
                workingNumber[i] = Integer.parseInt("" + charArray[i]);
                if (workingNumber[i]!=0){
                    multiply = multiply * workingNumber[i];
                }

            }
            System.out.println(multiply);
            numberString = String.valueOf(multiply);

        }

        while (multiply > 10);
        return multiply;
    }
}
