/**
 * Created by almasics on 2016.11.21..
 */
import java.util.ArrayList;
import java.util.*;



public class App {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Garden flowerBed = new Garden();
        Garden forest = new Garden();
        System.out.println("Press enter to begin");
        System.out.println("Add a flower to the garden: ");
        String inputFlowername = userInput.nextLine();
        flowerBed.addFlower(inputFlowername);
        System.out.println("Add a tree to the garden: ");
        String inputTreename = userInput.nextLine();
        forest.addTree(inputTreename);
        flowerBed.listFlowers();
        forest.listTrees();
        System.out.println("How much water do you want to add? ");
        int wateradded = userInput.nextInt();
        flowerBed.waterGarden(wateradded);

}
}
