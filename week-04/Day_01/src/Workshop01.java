/**
 * Created by almasics on 2016.11.07..
 */
public class Workshop01 {
    public static void main(String... args){
        String example = "A long example string";

        StringBuilder theReplacer = new StringBuilder(example);
        theReplacer.delete(2,6);
        theReplacer.insert(2,"short");



        /*example.replace("long", "short");*/
        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected ouput: A short example string


        System.out.println(theReplacer);
    }
}
