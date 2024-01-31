import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Background extends JPanel {

    BufferedImage image;

    public Background() throws IOException {
        this.setBounds(0, 0, 401, 600);
        this.setBackground(Color.BLACK);
        try {
            image = ImageIO.read(new File("ftcontent\\icons\\FastIcon.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
    }

}
