/**
 * Created by almasics on 2016.11.03..
 */
public class Workshop34 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".

        int limit = 100;
        for (int i = 0; i <= limit; i++) {

            if (i % 3 == 0) {
                System.out.println("Fizz");
            }

            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }


            /*switch (limit) {
                System.out.println(i);
                case i % 3 == 0:
                    System.out.print("Fizz");

                case i % 5 == 0:
                    System.out.print("Buzz");

                default: System.out.println(i);*/

            }
        }
    }




