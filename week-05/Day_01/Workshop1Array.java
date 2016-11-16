import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by almasics on 2016.11.14..
 */
public class Workshop1Array {
    public static void main (String[] args) {
        String [][] randomlist = {{"white", "blue", "red", "silver", "black", "green", "banana"},
                {"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"},
                {"1100", "1400", "1600", "1800", "2500"}};

        for (String[] rows : randomlist) {
            for (String columns : rows) {
                System.out.print(columns);
                System.out.print(" ");
            }
            System.out.println();
        }

        ArrayList<ArrayList<String>> carList = new ArrayList<ArrayList<String>>(10);
        carList.add(new ArrayList<String>());
        carList.get(0).add(randomlist[0][new Random().nextInt(randomlist[0].length)]);
        carList.get(0).add(randomlist[1][new Random().nextInt(randomlist[1].length)]);
        carList.get(0).add(randomlist[2][new Random().nextInt(randomlist[2].length)]);

        System.out.print(carList.get(0).get(0)+" ");
        System.out.print(carList.get(0).get(1)+" ");
        System.out.print(carList.get(0).get(2));

        }

    }

//lsVehicle = arraylist<Car>
//lsVehicle[1].size, ....
//            Constructor Car.RandomCar()
//            intRandomiszer(lsRandomColor)

