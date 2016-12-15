import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by almasics on 2016.12.15..
 */
public class ThreadTwo implements Runnable {

    ArrayList<String> numberList = new ArrayList<>(Arrays.asList("six", "seven", "eight", "nine", "ten"));

    public ThreadTwo() {

    }


    private void soutThis() {
        System.out.println("Second thread starts here");
        for (String numberlist : numberList) {
            System.out.println(numberlist);
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 50; i < 100; i++) {

            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
