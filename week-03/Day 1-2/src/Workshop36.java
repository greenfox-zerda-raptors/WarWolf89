/**
 * Created by almasics on 2016.11.03..
 */
public class Workshop36 {
    public static void main(String[] args) {
        String hashtag = "#";

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(hashtag + " ");

                for (int l = 1; l <= 5; l++) {
                    System.out.print(" " + hashtag);
                }
            }
            System.out.println();
        }
    }
}

