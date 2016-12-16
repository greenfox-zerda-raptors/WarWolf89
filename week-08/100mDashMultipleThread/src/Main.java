/**
 * Created by almasics on 2016.12.15..
 */
public class Main {
    public static void main(String[] args) {
        Sprinter sprinter1 = new TeamUnitedStates();
        Sprinter sprinter2 = new TeamChina();

        Thread sprintthread1 = new Thread(sprinter1);
        Thread sprintthread2 = new Thread(sprinter2);

        sprintthread1.start();
        sprintthread2.start();
    }
}
