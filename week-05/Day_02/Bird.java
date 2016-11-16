/**
 * Created by almasics on 2016.11.15..
 */

public class Bird extends Animals {
    Bird () {
        System.out.println("created a bird");
        lifeExpectancy = 15;
    }

    public void fly() {
        String bird = "bird";
        System.out.println(" Bird is flying");
    }

    public void nightyNight (){
        super.eat();
        sleep();

    }
//    @Override
//    public void sleep() {
//        System.out.println(" Bird is sleeping");
//    }
    @Override
    public  void eat() {
        System.out.println(" Bird is eating");
    }
    @Override
    public void speak(){
        System.out.println("Chirps");
    }
}
