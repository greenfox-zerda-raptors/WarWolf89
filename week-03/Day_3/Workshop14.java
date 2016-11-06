/**
 * Created by almasics on 2016.11.06..
 */
public class Workshop14 {
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]{3, 4, 5, 6, 7};
//        int first = ah[0];
//        int second = ah[1];
//        ah[0] = ah[4];
//        ah[1] = ah[3];
//        ah[3] = second;
//        ah[4] = first;

//        for (int i = 0; i < 5; i++) {
//            System.out.println(ah[i]);
//
//        }

        for (int i = 0; i < ah.length / 2; i++) {
            int temp = ah[i];
            ah[i] = ah[ah.length - i - 1];
            ah[ah.length - i - 1] = temp;
        }

        for (int i = 0; i < ah.length; i++) {
            System.out.println(ah[i]);

        }

    }

}

