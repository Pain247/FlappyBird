
package bubbleJumping;

import java.awt.Color;
import java.awt.Font;
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
 * @author D
 */
public class Create extends JPanel {
    
    private Bird birdC= new Bird();
    private Pipe pipeC =new Pipe();
    private Collision collisionC = new Collision();
    private Score scoreC= new Score();
    private Intro introC =new Intro();
    private static boolean bl = false,bl1=true;
    public BufferedImage bg, floor, gameover;
    private MyConnect connectC = new MyConnect();
    private int k =1;
    private int a = 0; 
    public Create(){
    connectC.connect();
    }
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
            if(a==0){g.drawString("Press N to new game, SPACE to play",130, 430);}
            if(collisionC.Die()) a=1;      
            g.setColor(Color.white);
            g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,80));
            if(scoreC.getPoint()<10) g.drawString(""+scoreC.getPoint(),220, 85);
            else g.drawString(""+scoreC.getPoint(),193, 85);
              
            
           
              
              if(collisionC.Die()==true){ 
                  
                  //Insert score to database
                  if(k==1){connectC.insert(scoreC); k=0;} 
                  
                  //Display score
                  gameover = ImageIO.read(new File("C:\\res\\scoreboard.png"));
                  g.drawImage(gameover, 120, 175, null);
                  g.setColor(Color.white);
                  g.setFont(new Font("Arial",Font.BOLD, 20));
                  if(scoreC.getPoint()<10) g.drawString(""+scoreC.getPoint(),305, 296);
                  else g.drawString(""+scoreC.getPoint(),299, 296);
                  g.setColor(Color.black);
                  g.setFont(new Font("Arial",Font.BOLD,15));
                  g.drawString("ESC to exit, P to play again",150, 435);
                  
                  
                  //Set medal
                  if(scoreC.getPoint()>=10){g.setColor(Color.decode("#FFCC00"));
                  g.fillOval(152, 288, 45, 45);}
                  else if(scoreC.getPoint()>=20){g.setColor(Color.decode("#EEEEEE"));
                  g.fillOval(152, 288, 45, 45);}
                  else if(scoreC.getPoint()>=30){g.setColor(Color.decode("#FFFF33"));
                  g.fillOval(152, 288, 45, 45);}
                  
                  //set HighScore
                
                  g.setColor(Color.white);
                  g.setFont(new Font("Arial",Font.BOLD,20));
                  if(connectC.getMax()<10) g.drawString(""+connectC.getMax(),305,337);
                  else g.drawString(""+connectC.getMax(),299, 337);
              
              }
        } catch (IOException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void setK(int k){
    this.k =k;
    }
    public int getK(){
    return k;
    }


}
