/**
 * Created by almasics on 2016.12.15..
 */
public class Sprinter implements Runnable {


    String name;
    int sleepValue;
    int distance;

    public Sprinter() {

    }


    private void moveSprinter() {
        for (distance = 0; distance <= 100; distance++) {
            System.out.println(getStringForPrint());
            distance++;
            try {
                Thread.sleep(sleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    private String getStringForPrint() {
        return String.format("Team %s has covered %d meters", getName(), distance);
    }

    public void run() {
        moveSprinter();
    }
}
