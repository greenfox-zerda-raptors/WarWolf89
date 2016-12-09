import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by almasics on 2016.12.09..
 */
public class ImageBackgroundPane extends JPanel {
    private BufferedImage img;

    public ImageBackgroundPane() {
        img = modifyBackgroundImage("images/you_died.png");

    }


    @Override

    public void paint(Graphics g) {
//        super.paint(g);
        Dimension curSize = this.getSize();
        g.drawImage(img, 0, 0, curSize.width, curSize.height, null);

    }

    private BufferedImage modifyBackgroundImage(String filename) {
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
