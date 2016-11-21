import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by almasics on 2016.11.21..
 */
public class Garden {
    String plantName;
    boolean isWatered=false;
    int waterLevel=0;
    int thirstyLevel;
    ArrayList<Flowers> flowersArrayList = new ArrayList<>();
    ArrayList<Trees> treesArrayList = new ArrayList<>();


    public Garden() {

    }

    public void addFlower(String flowerName){
        flowersArrayList.add(new Flowers(flowerName));
        this.plantName=flowerName;
    }

    public void addTree(String treeName){
        treesArrayList.add(new Trees(treeName));
        this.plantName=treeName;
    }

    public void listFlowers(){
        for (Iterator<Flowers> i = flowersArrayList.iterator(); i.hasNext(); ) {
            Flowers item = i.next();
            System.out.println(item);
        }
    }

    public void listTrees(){
        for (Iterator<Trees> i = treesArrayList.iterator(); i.hasNext(); ) {
            Trees item = i.next();
            System.out.println(item);
        }
    }

    public void waterGarden(int wateradded){
        int newWaterlevel = waterLevel + wateradded;

        if (newWaterlevel > thirstyLevel) {
            isWatered = true;
            System.out.println("plant is not thirsty");
        }

        else {
            System.out.println("plant still thirsty");
        }

    }

    public String getPlantName() {
        return plantName;
    }

    public boolean isWatered() {
        return isWatered;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public void setWatered(boolean watered) {
        isWatered = watered;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

}
