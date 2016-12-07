import java.awt.*;


public class Hero extends GameObject{
    int posX;
    int posy;



    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY);
        this.posX=posX;
        this.posY=posY;
    }



}
