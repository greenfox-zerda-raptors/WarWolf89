/**
 * Created by almasics on 2016.11.04..
 */
public class Workshop04 {
    public static void main(String[] args) {
        int[] s = new int[]{1, 2, 3, 8, 5, 6};
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 8) {
                System.out.print(4);
            }

            else
                System.out.print(s[i]);
            // change the 8 to 4
        }
    }
}
