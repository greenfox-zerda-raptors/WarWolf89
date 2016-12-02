/**
 * Created by almasics on 2016.12.02..
 */
public class App {
    static String returnString="";
    static String test = "abcd";
    static String lowerCaseString;

    public static void main(String[] args) {

        System.out.println(App.accum(test));

    }



    public static String accum(String s) {

        for (int i = 0; i < test.length(); i++) {
            returnString+= test.charAt(i);
        }


            return returnString;
    }

    private static String charAtI(){
        for (int i = 0; i < test.length(); i++) {
             lowerCaseString += test.charAt(i);

        }
        return lowerCaseString;
    }
}
