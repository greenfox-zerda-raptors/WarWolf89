import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by almasics on 2016.12.15..
 */
public class ThreadOne implements Runnable {

    private ArrayList<String> numberList = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));

    public ThreadOne() {
    }


    private void soutThis() {
        System.out.println("Second thread starts here");
        for (String numberlist : numberList) {
            System.out.println(numberlist);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override

    public void run() {
        soutThis();
    }
}


