import main.java.music.StringedInstrument;

/**
 * Created by almasics on 2016.11.16..
 */
public class Electric_Guitar extends StringedInstrument {
    public Electric_Guitar(){
        this(6);
    }
    public Electric_Guitar(int numberOfStrings) {
        name = "Electric Guitar";
        this.numberOfStrings = numberOfStrings;
        sound = "Twang";

    }

    public void play() {
        super.play();
    }

}

