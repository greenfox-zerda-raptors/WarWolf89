import main.java.music.StringedInstrument;

/**
 * Created by almasics on 2016.11.16..
 */
public class Violin extends StringedInstrument {
    public Violin() {
        name = "Violin";
        numberOfStrings=4;
        sound = "Screech";
    }

    public void play() {
        super.play();
    }
}
