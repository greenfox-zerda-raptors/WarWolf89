import com.sun.xml.internal.ws.util.StringUtils;

/**
 * Created by almasics on 2016.12.02..
 */
public class App {
    static String returnString="";
    static String test = "abcd";
    static String lowerCaseString="";
    static String temp ="";


    public static void main(String[] args) {

        System.out.println(App.accum(test));
//        System.out.println(App.lowerCaseCharString(test));
    }



    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            builder.append(Character.toUpperCase(test.charAt(i)));
            builder.append(App.lowerCaseCharString(test));
            builder.append("-");
        }

            return builder.toString();
    }

    private static String lowerCaseCharString(String anotherS){
        String lowerCaseCharacter="";
        for (int i = 0; i < test.length(); i++) {
            for (int j = 0; j <= i; j++) {
                lowerCaseString+= lowerCaseCharacter;
                lowerCaseCharacter = Character.toString(test.charAt(i));
            }

        }
        return lowerCaseString;
    }
}
