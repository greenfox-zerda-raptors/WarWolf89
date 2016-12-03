import com.sun.xml.internal.ws.util.StringUtils;

/**
 * Created by almasics on 2016.12.02..
 */
public class App {
    public static void main(String[] args) {

        System.out.println(App.accum("jsdkFlhdsjkf"));
    }



    public static String accum(String s) {
        String returnString;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.append(Character.toUpperCase(s.charAt(i)));
            builder.append(App.lowerCaseCharString(s.charAt(i),i));
            builder.append("-");

        }
        return builder.substring(0,builder.length()-1);

    }

    private static String lowerCaseCharString(Character charAt, int number){
        String lowerCaseString="";
        for (int i = 0; i < number; i++) {
            lowerCaseString+=Character.toLowerCase(charAt);
        }
        return lowerCaseString;
    }
}
