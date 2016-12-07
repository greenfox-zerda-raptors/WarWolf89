import java.awt.*;


public class Tile extends GameObject{




    public boolean moveable;

    public Tile(String filename, int posX, int posY, boolean moveable) {
        super(filename, posX, posY);
        this.moveable = moveable;
    }

    public boolean isMoveable() {
        return moveable;
    }
}
