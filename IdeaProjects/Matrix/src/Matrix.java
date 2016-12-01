/**
 * Created by almasics on 2016.12.01..
 */
public class Matrix {
    static String[][] matrix;
    static int size = 4;

    public static void main(String[] args) {
        populateMatrix();
        printMatrix();
        System.out.println("****************");
        flipRotate();
        printMatrix();
        System.out.println("****************");
        flipRotate();
        printMatrix();
        System.out.println("****************");
        flipRotate();
        printMatrix();
        System.out.println("****************");
        flipRotate();
        printMatrix();
    }

    static void populateMatrix(){
        matrix = new String [size ][size];
        int col ;
        for(int row = 0 ; row < size; row ++) {
            for (col = 0 ; col < size; col ++){
                matrix[col][row] = String.format("%d-%d",row,col);
            }
        }
    }

    static void printMatrix() {
        int col ;
        for(int row = 0 ; row < size; row ++) {
            for (col = 0; col < size; col++) {
                System.out.printf("%s ", matrix[col][row]);
            }

            System.out.println();
        }
    }

    static void flipDiagonal() {

        int maxCol = size;
        int col;
        int targetCol;
        int targetRow;
        String swapValue;

        for (int row = 0; row < size ; row++) {
            maxCol--;
            for (col = 0; col < maxCol; col++){
                targetCol = size - row -1;
                targetRow = size - col - 1;
                swapValue = matrix[row][col];
                matrix[row][col]=matrix [targetRow][targetCol];
                matrix [targetRow][targetCol] = swapValue;
            }
        }
    }

    static void flipHorizontal() {
        String swapValue;
        int col;
        int targetCol;
        for (int row = 0; row < size; row++) {
            for (col = 0; col < size / 2; col++) {
                targetCol = size - col - 1;
                swapValue = matrix[row][col];
                matrix[row][col] = matrix[row][targetCol];
                matrix[row][targetCol] = swapValue;
            }
        }
    }

    static void flipRotate() {
        flipDiagonal();
        flipHorizontal();
    }

}
