/**
 * Created by almasics on 2016.12.08..
 */
public class GameCharacter extends GameObject {
    public GameCharacter() {

    }

    public GameCharacter(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.posX = posX;
        this.posY = posY;

    }
}
