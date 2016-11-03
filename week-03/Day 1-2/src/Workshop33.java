/**
 * Created by almasics on 2016.11.03..
 */
public class Workshop33 {
    public static void main(String[] args) {
        // print the even numbers till 20
        int limit = 20;
        System.out.println("Printing Even numbers between 0 and " + limit);
        for (int i=0; i<=limit; i++) {
            if( i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
