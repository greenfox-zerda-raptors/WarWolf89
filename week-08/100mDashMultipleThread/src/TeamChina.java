/**
 * Created by almasics on 2016.12.15..
 */
public class TeamChina extends Sprinter {

    public TeamChina() {
        this.name = "China";
        this.sleepValue = 400;
    }

    private synchronized Integer moveSprinter() {
        for (distance = 0; distance <= 400; distance++) {
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

        return distance;
    }

    @Override
    public void run() {
        moveSprinter();
    }
}
