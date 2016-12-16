/**
 * Created by almasics on 2016.12.15..
 */
public class Sprinter implements Runnable {


    String name;
    int sleepValue;
    public Integer distance;
    public static int numberOfRunnersWhoHaveFinished = 0;

    public Sprinter() {
    }


    private Integer moveSprinter() {
        for (distance = 0; distance <= 400; distance++) {
            System.out.println(getStringForPrint());
            synchronized (this) {
                if (distance == 100) {
                    notifyAll();
                }
            }
            if (hasFinishedTheRace()) {
                numberOfRunnersWhoHaveFinished++;
                System.out.println(victoryMessagePrint());
                break;
            }
            distance++;
            try {
                Thread.sleep(sleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return distance;
    }

    public String getName() {
        return name;
    }

    public String getStringForPrint() {
        return String.format("Team %s has covered %d meters", getName(), distance);
    }

    public String victoryMessagePrint() {
        return String.format("Team %s has finished the race at %d place!", getName(), numberOfRunnersWhoHaveFinished);
    }

    public boolean hasFinishedTheRace() {
        return distance >= 400;
    }

    public void run() {
        moveSprinter();
    }
}
