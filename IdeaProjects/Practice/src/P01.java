/**
 * Created by almasics on 2016.11.08..
 */
public class P01 {
    public static void main(String[] args) {
        String[][] matrix = new String[4][4];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j){
                    System.out.print(" "+ 1);
                }
                else{
                    System.out.print(" " + 0);
                }
            }
            System.out.println("");
        }
    }
}

