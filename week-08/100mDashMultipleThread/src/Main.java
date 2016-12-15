/**
 * Created by almasics on 2016.12.15..
 */
public class Main {
    public static void main(String[] args) {

        Sprinter usa = new TeamUnitedStates();
        Sprinter china = new TeamChina();
        Sprinter jamaica = new TeamJamaica();

        Thread usaThread = new Thread(usa);
        Thread chinaThread = new Thread(china);
        Thread jamaicaThread = new Thread(jamaica);

        usaThread.start();
        chinaThread.start();
        jamaicaThread.start();
    }
}
