import javax.swing.*;
import java.util.List;

/**
 * Created by almasics on 2016.12.15..
 */
public class Sprinter extends SwingWorker<Void, Integer> implements Runnable {

    JLabel statusLabel = new JLabel();
    String name;

    int sleepValue;
    public Integer distance;
    public static int numberOfRunnersWhoHaveFinished = 0;

    public Sprinter() {
    }

    @Override
    protected Void doInBackground() throws Exception {
        for (distance = 0; distance <= 400; distance++) {
            System.out.println(getStringForPrint());
            if (hasFinishedTheRace()) {
                numberOfRunnersWhoHaveFinished++;
                System.out.println(victoryMessagePrint());
                break;
            }
            distance++;
            publish(distance);
            try {
                Thread.sleep(sleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void process(List<Integer> chunks) {
        for (int number : chunks) {
            statusLabel.setText(String.format("Team %s has covered %d meters", name, number));
        }
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


}
