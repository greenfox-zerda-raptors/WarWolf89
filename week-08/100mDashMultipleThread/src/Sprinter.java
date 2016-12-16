import javax.swing.*;
import java.util.List;

/**
 * Created by almasics on 2016.12.15..
 */
public class Sprinter {

    String name;
    int sleepValue;

    private Integer distance;
    private static int numberOfRunnersWhoHaveFinished = 0;
    private JLabel statusLabel = new JLabel();


    public Sprinter(JLabel label) {
        this.statusLabel = label;

    }

    public void startExecution() {
        worker.execute();
    }

    public void cancelExecution() {
        worker.cancel(true);

    }

    private SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
        @Override
        protected Void doInBackground() throws Exception {
            for (distance = 0; distance <= 400 && !isCancelled(); distance++) {
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


    };
}
