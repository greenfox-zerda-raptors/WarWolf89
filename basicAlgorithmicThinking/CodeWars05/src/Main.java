/**
 * Created by almasics on 2017.02.07..
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(0.015f, 2000, 8000);
        System.out.println(calculator.calculate().toString());
    }
}
