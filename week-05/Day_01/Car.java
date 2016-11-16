/**
 * Created by almasics on 2016.11.14..
 */
    public class Car {
    //Add somethings here to create a car and some fields
    private String color;
    private String typeCar;
    private int sizeEngine;
    private int kmOdometer;

    void drive (int distance) {
        if (distance<20 && distance!=0){
            System.out.printf("brrm,%s just drove around town  %d clicks.\n", typeCar, distance );
        }
        else if (distance<50 && distance!=0) {
            System.out.printf("brrm, screech, brrm, screech; %s commuted %d clicks.\n", typeCar, distance);
        }
        else {
            System.out.printf("whee, ZY x clicks.");
        }
        kmOdometer += distance;
    }


    public Car() {
        typeCar="Mazda";
        kmOdometer = 12312;
        this.color = "red";
        sizeEngine = 1600;
    }

//    public void setInfo (String type, String color, int engineSize, int kilometerClock){
//        kmOdometer= kilometerClock;
//        sizeEngine=engineSize;
//        typeCar=type;
//        this.color=color;
//    }
    public String toString() {
//        String introduction = "This " + typeCar + " is " + color + " has " +sizeEngine + " engine and clocked " + kmOdometer + "km's.\n";
        String introduction = String.format("This %s is %s has %d engine and clocked %d km's.\n",typeCar, color, sizeEngine,kmOdometer);
        return introduction;


    }
    String getColor(){
        return color;
    }
    String getTypeCar() {
        return typeCar;
    }
    int getSizeEngine () {
        return sizeEngine;
    }
    int getKmOdometer () {
        return kmOdometer;
    }
    public void setType (String newType) {
        typeCar = newType;
    }

    public void setColor (String newColor) {
        color = newColor;
    }

    public void setSizeEngine (int newSizeEngine) {
        sizeEngine = newSizeEngine;
    }

    public void setkmOdometer (int newKmOdometer) {
        kmOdometer = newKmOdometer;
    }

}


