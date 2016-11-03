/**
 * Created by almasics on 2016.11.03..
 */
public class Workshop28 {
    public static void main(String[] args) {
        int z = 8;
        // if z is between 10 and 20 print 'Sweet!'
        // if less than 10 print 'More!',
        // if more than 20 print 'Less!'

        if (10 < z && z < 20) {
            System.out.println("Sweet!");
        }
        if (10 > z) {
            System.out.println("More!");
        }
        else {
            System.out.println("Less");
        }
    }
}
