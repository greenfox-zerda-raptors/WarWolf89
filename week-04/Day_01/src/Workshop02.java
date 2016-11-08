/**
 * Created by almasics on 2016.11.07..
 */
public class Workshop02 {
    public static void main(String... args){
        String name = "World";
        StringBuilder builder = new StringBuilder("Heljo");
        builder.delete(3,4);
        builder.insert(3, "l");
        builder.append(" World");
        // Please change "Heljo" to "Hello" and add name ("World") to the end of the string builder

        System.out.println(builder);
    }
}
