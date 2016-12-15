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
        System.out.println("First thread starts here");
        for (String numberlist : numberList) {
            System.out.println(numberlist);
        }
    }

    @Override

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


