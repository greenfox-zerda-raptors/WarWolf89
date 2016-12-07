import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public abstract class GameObject implements Draw {

    BufferedImage image;
    int posX, posY;

    public GameObject() {

    }

    public GameObject(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }// cons GameObject

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }
    public void moveHeroDown() {
        posY+=1;
    }
    public void moveHeroUp() {
        posY-=1;
    }
    public void moveHeroLeft() {
        posX-=1;
    }
    public void moveHeroRight() {
        posX+=1;
    }
}

