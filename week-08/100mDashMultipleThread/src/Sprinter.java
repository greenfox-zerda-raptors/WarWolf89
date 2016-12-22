import javax.swing.*;
import java.util.List;

/**
 * Created by almasics on 2016.12.15..
 */
public class Sprinter {

    String name;
    int sleepValue;


    private boolean paused = false;
    private Integer distance;
    private static int numberOfRunnersWhoHaveFinished = 0;
    private JLabel statusLabel;


    public Sprinter(JLabel label) {
        this.statusLabel = label;
    }

    public void startExecution() {
        worker.execute();
    }

    public synchronized void pauseExecution() {
        paused = true;
        this.notify();
    }

    public synchronized void resumeExecution() {
        paused = false;
        this.notify();
    }

    public boolean getPaused() {
        return paused;
    }

    private SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {

        @Override
        protected Void doInBackground() throws Exception {
            for (distance = 0; distance <= 400 && !isCancelled(); distance++) {
                System.out.println(getStringForPrint());
                if (paused) {
                    try {
                        synchronized (this) {
                            while (getPaused()) {
                                wait(1);
                            }
                        }
                    } catch (InterruptedException ex) {
                        System.out.println("");
                    }
                }
                if (hasFinishedTheRace()) {
                    numberOfRunnersWhoHaveFinished++;
                    System.out.println(victoryMessagePrint());
                    break;
                }
                publish(distance + 1);
                try {
                    Thread.sleep(sleepValue);
                } catch (InterruptedException e) {
                    System.out.println("");
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
