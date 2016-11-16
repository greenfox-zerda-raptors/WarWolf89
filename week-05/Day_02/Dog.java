/**
 * Created by almasics on 2016.11.15..
 */
public class Dog extends Animals {
    boolean hasTail = false;
    Dog () {
        System.out.println("created a dog");
        lifeExpectancy = 15;
        isCarnivore = true;
    }
    @Override
    public void speak(){
        System.out.println("barks");
    }

    public void beg(){
        System.out.println("begs");
    }

}
