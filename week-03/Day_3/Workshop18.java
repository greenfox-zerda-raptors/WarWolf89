/**
 * Created by almasics on 2016.11.06..
 */
public class Workshop18 {

    public static int add(int until){
        int sum = 0;
        for (int i=0; i<Integer.MAX_VALUE; i++) {
            sum += i;
            if (i==until) {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

        int result=add(10);
        System.out.println(result);
    }
}
