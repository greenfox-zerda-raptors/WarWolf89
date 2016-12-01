/**
 * Created by almasics on 2016.12.01..
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(90));

    }

    public int solution(int number) {

        int sumNumbers=0;

        for (int i = 0; i < number; i++) {
             if (i%3==0 || i%5==0 ){
                 sumNumbers+=i;
             }
        }
        return sumNumbers;
    }
}
