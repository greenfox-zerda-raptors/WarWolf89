/**
 * Created by almasics on 2016.11.15..
 */
public class Workshop01 {
    public static void main(String... args) {
        Animals animal = new Animals();
        Bird bird = new Bird();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        System.out.println("Testing Animal\n");
        animal.eat();
        animal.speak();
        System.out.println(animal.toString()+"\n");
        System.out.println("Testing Bird");
        bird.speak();
        bird.sleep();
        bird.eat();
        bird.fly();
        System.out.println(bird.toString()+"\n");
        System.out.println("Testing Dog\n");
        dog.speak();
        dog.sleep();
        dog.beg();
        System.out.println(dog.toString()+"\n");
        if (dog2 instanceof Dog){
            Dog Y = dog2;
            Y.hasTail=false;
            Y.lifeExpectancy=22;
            System.out.println("Casting dog2 into Y to see if it begs...");
            Y.beg();
            System.out.println("And a dog2 cast as (Dog) Y:" + Y.toString() + ", and hasTail=" + Y.hasTail);
        }

        System.out.println("\nTesting Dog 'd'");
        Dog d = new Dog();
        if (d instanceof Animals) {
            Animals a = d;
            a.speak();
            a.sleep();
            System.out.println(a.toString());

        }

    }
}
