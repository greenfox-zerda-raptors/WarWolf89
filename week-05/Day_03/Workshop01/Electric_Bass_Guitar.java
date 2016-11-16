import main.java.music.StringedInstrument;

/**
 * Created by almasics on 2016.11.16..
 */
public class Electric_Bass_Guitar extends StringedInstrument {
    public Electric_Bass_Guitar(){
        this(4);
    }

    public  Electric_Bass_Guitar(int numberOfStrings) {
        super.name = "Electric Bass Guitar";
        this.numberOfStrings=numberOfStrings;
        sound = "Dumdumdum";
    }


    public void play() {
        super.play();
    }
}
