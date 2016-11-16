
package bubbleJumping;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class Create extends JPanel {
    
    private Bird birdC= new Bird();
    private Pipe pipeC =new Pipe();
    private CheckDie checkdieC = new CheckDie();
    private Score scoreC= new Score();
    private Intro introC =new Intro();
    private static boolean bl = false,bl1=true;
    public BufferedImage bg, floor, gameover;
  
    @Override
    public void paint(Graphics g){
        try {
          
            bg=ImageIO.read(new File("C:\\res\\BG.png"));
            g.drawImage(bg, 0, 0, null);
            introC.paint(g);
            pipeC.paint(g);
            floor=ImageIO.read(new File("C:\\res\\NenDat.png"));
            g.drawImage(floor,0, 390, null);
            
            birdC.paint(g);
            
           
            g.setColor(Color.black);
            g.setFont(new Font("Arial",Font.BOLD, 15));
            g.drawString("Press N to new game, SPACE to play",130, 430);
                  
            g.setColor(Color.white);
            g.setFont(new Font("Arial",Font.BOLD, 80));
            if(scoreC.getPoint()<10) g.drawString(""+scoreC.getPoint(),220, 85);
            else g.drawString(""+scoreC.getPoint(),193, 85);
              
            
           
              
              if(checkdieC.Die()==true){ 
                  gameover = ImageIO.read(new File("C:\\res\\scoreboard.png"));
                  g.drawImage(gameover, 120, 175, null);
                  g.setColor(Color.white);
                  g.setFont(new Font("Arial",Font.BOLD, 20));
                  if(scoreC.getPoint()<10) g.drawString(""+scoreC.getPoint(),305, 296);
                  else g.drawString(""+scoreC.getPoint(),299, 296);
                  g.setColor(Color.black);
                  g.setFont(new Font("Arial",Font.BOLD,15));
                  g.drawString("ESC to exit, R to return game",150, 450);
          
             
              
              }
        } catch (IOException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   


}
