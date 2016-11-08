/**
 * Created by almasics on 2016.11.07..
 */
public class Workshop04 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first third fourth");
        // Add "second" to the StringBuilder (sb) between the words "first" and "third"
        // Expected outpt: first second third fourth
        sb.insert(5, " second");

        System.out.println(sb.toString());
    }
}
