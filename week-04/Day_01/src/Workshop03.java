/**
 * Created by almasics on 2016.11.07..
 */
public class Workshop03 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("second line\n");
        sb.append("third line \n");
        sb.insert(0, "first line\n");
        // Add "first line" to the beginning of the sb
        // Add "third line" to the end of the sb
        // Expected outpt:
        // first line
        // second line
        // third line


        System.out.println(sb.toString());
    }
}
