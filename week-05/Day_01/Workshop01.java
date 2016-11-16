/**
 * Created by almasics on 2016.11.14..
 */
public class Workshop01 {
    public static void main(String[] args) {
    Car myCar = new Car();
        System.out.print(myCar.toString());

//    System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
//            myCar.getTypeCar(), myCar.getColor(), myCar.getSizeEngine(), myCar.getKmOdometer());
        Car myCar_1 = new Car();
        myCar_1.setType("Ford");
        myCar_1.setColor("silver");
        myCar_1.setSizeEngine(2500);
        myCar_1.setkmOdometer(152312);
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
                myCar_1.getTypeCar(), myCar_1.getColor(), myCar_1.getSizeEngine(), myCar_1.getKmOdometer());
        Car myCar_2 = new Car();
        myCar_2.setType("Beamer");
        myCar_2.setColor("green");
        myCar_2.setSizeEngine(2800);
        myCar_2.setkmOdometer(42521);
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
           myCar_2.getTypeCar(), myCar_2.getColor(), myCar_2.getSizeEngine(), myCar_2.getKmOdometer());
}
}
