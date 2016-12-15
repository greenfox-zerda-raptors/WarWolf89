/**
 * Created by almasics on 2016.12.15..
 */
public class Sprinter implements Runnable {


    String name;
    int sleepValue;
    private int distance;
    private static int numberOfRunnersWhoHaveFinished = 0;

    public Sprinter() {
    }


    private void moveSprinter() {
        for (distance = 0; distance <= 100; distance++) {
            System.out.println(getStringForPrint());
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
    }

    public String getName() {
        return name;
    }

    private String getStringForPrint() {
        return String.format("Team %s has covered %d meters", getName(), distance);
    }

    private String victoryMessagePrint() {
        return String.format("Team %s has finished the race at %d place!", getName(), numberOfRunnersWhoHaveFinished);
    }

    private boolean hasFinishedTheRace() {
        boolean finishedTheRace = distance >= 100;
        return finishedTheRace;
    }

    public void run() {
        moveSprinter();
    }
}
