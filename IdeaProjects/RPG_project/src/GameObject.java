import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public abstract class GameObject implements Draw {


    BufferedImage image;
    String filename;
    int posY;

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    int posX;

    public GameObject() {

    }

    public GameObject(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.filename = filename;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }

    public void moveHeroUp(Area map) {
        int nextTile = posY - 1;
        if (positionBounds(nextTile) && !map.isWall(posX, nextTile)) {
            posY -= 1;
        }
    }

    public void moveHeroDown(Area map) {
        int nextTile = posY + 1;
        if (positionBounds(nextTile) && !map.isWall(posX, nextTile)) {
            posY += 1;
        }
    }

    public void moveHeroLeft(Area map) {
        int nextTile = posX - 1;
        if (positionBounds(nextTile) && !map.isWall(nextTile, posY)) {
            posX -= 1;
        }
    }

    public void moveHeroRight(Area map) {
        int nextTile = posX + 1;
        if (positionBounds(nextTile) && !map.isWall(nextTile, posY)) {
            posX += 1;
        }
    }

    public boolean positionBounds(int pos) {
        return pos >= 0 && pos <= 9;
    }

    public int getPosY() {
        return posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getFilename() {
        return filename;
    }


    public void modifyGameObjectImage(String filename) {
        if (!this.filename.contentEquals(filename))
            try {
                image = ImageIO.read(new File(filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
    }


}

