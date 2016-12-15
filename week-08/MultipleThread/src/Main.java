/**
 * Created by almasics on 2016.12.15..
 */
public class Main {
    public static void main(String[] args) {

        ThreadOne one = new ThreadOne();
        ThreadTwo two = new ThreadTwo();

        Thread oneThread = new Thread(one);
        Thread twoThread = new Thread(two);

        oneThread.start();
        twoThread.start();
    }
}
