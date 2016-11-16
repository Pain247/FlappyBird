
package bubbleJumping;

/**
 *
 * @author Dell
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class Intro extends JFrame {
     private BufferedImage it;
     private Bird birdI= new Bird();
    
    public void paint(Graphics g){
        
        
         try {
             g.setColor(Color.black);
             g.setFont(new Font("Arial",Font.BOLD,20 ));
            //
             it= ImageIO.read(new File("C:\\res\\Flappybird.png"));
             g.drawImage(it,110, 300, null);
           
             
         } catch (IOException ex) {
             Logger.getLogger(Intro.class.getName()).log(Level.SEVERE, null, ex);
         }
      
         }



  
    }

 
    


