
package bubbleJumping;

/**
 *
 * @author D
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author D
 */
public class Bird{
    private static float y=200f;
    private static int x=100;    
    private int index=0;
    private float vt = 0;
    private BufferedImage bird;
    private BufferedImage [] list = new BufferedImage[4];
    private BufferedImage [] list1 = new BufferedImage[4];
    
    public static float getY(){
        return y;
    }
    public static int getX(){
     return x;
    }
    public BufferedImage [] Img(){
    for(int i=1;i<5;i++){
        try {
            list[i-1]=ImageIO.read(new File("C:\\res\\bird-0"+i+".png"));
        } catch (IOException ex) {
            Logger.getLogger(Bird.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    return list;
    }
    


   public void paint(Graphics g){
        list1= Img(); 
        bird = list1[index];
        g.drawImage(bird, x, (int) y,null);
        index++;
        if(index==3) index=0;
       
    }

    public void YUp(){
        vt+=0.089;
        y=this.getY() + vt ;
    }
    public void YDown(){
      this.vt =-3.2f;
    }
    
    public void update1(){
    x=100;
    y=200;
    this.vt =0;
    }

}
