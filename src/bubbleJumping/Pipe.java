
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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author D
 */
public class Pipe extends JPanel {
    
    private static int x1=500, x2=x1+180,x3=x2+180;  
    private static int h1,h2,h3,h4;
    private static boolean b1=false;
    private static boolean b2=false;
    private static boolean b3=false;
  
    
    private BufferedImage apipe,upipe;
    public void Random(){
    
        Random rd= new Random();
        
       if(b1==false) {h1=rd.nextInt(180); b1=true;}
       
       if(b2==false){ h2=rd.nextInt(180); b2=true;}
         
       if(b3==false) { h3=rd.nextInt(180); b3=true;}
       
  
        
    }
    public static int  getH1(){
       return h1;
    }
      public static int  getH2(){
       return h2;
    }
       public static int  getH3(){
       return h3;
    }
       
    public void paint(Graphics g){
        try {
            Random();
         
            //pipe1
            apipe=ImageIO.read(new File("C:\\res\\OngNuocTren.png"));
            upipe=ImageIO.read(new File("C:\\res\\OngNuocDuoi.png"));
            g.drawImage(apipe, x1, 0, 50, h1, null);
            g.drawImage(upipe, x1, h1+100, 50, 500, null);
            

            // pine2
        
           apipe=ImageIO.read(new File("C:\\res\\OngNuocTren.png"));
           upipe=ImageIO.read(new File("C:\\res\\OngNuocDuoi.png"));
            g.drawImage(apipe, x2, 0, 50, h2, null);
            g.drawImage(upipe, x2, h2+100, 50, 500, null);
            
            //pine 3
            
           
            apipe=ImageIO.read(new File("C:\\res\\OngNuocTren.png"));
            upipe=ImageIO.read(new File("C:\\res\\OngNuocDuoi.png"));
            g.drawImage(apipe, x3, 0, 50, h3, null);
            g.drawImage(upipe, x3, h3+100, 50, 500, null);
            
           
        } catch (IOException ex) {
            Logger.getLogger(Pipe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static int getX1(){
    return x1;}
      public static int getX2(){
    return x2;}
        public static int getX3(){
    return x3;}
    
    public void XDown(){
    x1--;
    x2--; 
    x3--; 
    }
    public void repeat(){
        if(x1==-50) {x1=500; b1=false;}
        if(x2==-50) {x2=500; b2= false;}
        if(x3==-50) {x3=500; b3=false;}
      
    }
    public void update2(){
     x1=500; x2=680; x3=860;
    }
}
