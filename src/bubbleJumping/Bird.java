
package bubbleJumping;

/**
 *
 * @author Dell
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class Bird{
    private static int y=200;
    private static int x=100;
  
    private BufferedImage bubble;
    public static int getY(){
        return y;
    }
    public static int getX(){
     return x;
    }
    public void paint(Graphics g){
        try {
           bubble= ImageIO.read(new File("C:\\Users\\Dell\\Desktop\\bird\\bird-04.png"));
            g.drawImage(bubble, x, y,null);
        } catch (IOException ex) {
            Logger.getLogger(Bird.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void YUp(){
        y=y+1;
    }
    public void YDown(){
        y=y-40;
    }
    public void update1(){
    x=100;
    y=200;
    }
    
}
