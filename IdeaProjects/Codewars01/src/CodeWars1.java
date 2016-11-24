/**
 * Created by almasics on 2016.11.24..
 */
public class CodeWars1 {
    public static void main(String[] args) {
        CodeWars1.persistence(4567);

    }

    public static void persistence(long n) {
        String numberString = String.valueOf(n);
        char[] charArray = numberString.toCharArray();
        int[] workingNumber = new int [charArray.length];
        int multiply=1;
        for (int i = 0; i < charArray.length; i++) {
                workingNumber[i] = Integer.parseInt(""+charArray[i]);
                multiply =multiply * workingNumber[i];
        }
        System.out.println(multiply);
    }
}
