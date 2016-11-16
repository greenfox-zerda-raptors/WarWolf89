/**
 * Created by almasics on 2016.11.15..
 */
public class Animals {
    String name;
    int lifeExpectancy;
    boolean isCarnivore;
    Animals () {
        System.out.println("created an animal");
        lifeExpectancy=10;
        isCarnivore=false;
    }
    Animals (int years, boolean iscarnivore) {
        System.out.println("created an animal");
    }

    public void sleep() {
        System.out.println(" Animal is sleeping");
    }
    public void eat() {
        System.out.println(" Animal is eating");
    }
    public void speak(){
        System.out.println("animal speaks");
    }
    public String toString () {
        return String.format("isCarnivore =%b, lifeExpectancy=%d", isCarnivore, lifeExpectancy);
    }

}
