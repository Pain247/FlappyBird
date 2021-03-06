
package bubbleJumping;

import java.awt.Component;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author D
 */
public class BackGround extends JFrame implements Runnable{
 
     private Create createB= new Create(); //Create Objects in Create class
     private Bird birdB = new Bird();
     private Pipe pipeB= new Pipe();
     private Score scoreB=new Score();
     private Collision collisionB = new Collision();
     private static boolean  b1=true;
     private Thread threadB;
     private SoundPlayer die,wing;
     private boolean isFall = true;
public BackGround(){

    setTitle("Flappy Bird");
    setSize(500, 500);// Create a window 500x500
    setVisible(true);// 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(400, 100); 
    setResizable(false);
    add(createB);// add createB Object to BackGround Class
    die = new SoundPlayer(new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\BubbleJumping\\sounds\\bup.wav"));
    wing = new SoundPlayer(new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\BubbleJumping\\sounds\\flap.wav"));
 
   
    
    //If press SPACE and bubble hasn't broken
    addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char key = e.getKeyChar();
            if(key==32&&collisionB.Die()==false) {
                birdB.YDown();
                wing.play();
                
            }
            
        }

       
        
    });
      threadB = new Thread(this);// Create a thread
      // If press N, thread starts
    addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
          if(e.getKeyChar()=='n'||e.getKeyChar()=='N') threadB.start();
        }});
    
            
            
    
   }

  
public static void main(String[]args){
   
        BackGround bg =new BackGround();
}

    public void run(){
    
        
        while(true){
        repaint();
         if(b1){
              if(isFall){ pipeB.XDown(); 
                pipeB.repeat();}
                birdB.YUp();
               
        
         }
         
        
        try {
            Thread.sleep(8);
        } catch (InterruptedException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        if(collisionB.Die()==true){   
            if(isFall) die.play();
                 birdB.YUp();
                 isFall = false;
            
           
            
              addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    if(e.getKeyChar()==27){
                    
                 Component frame = null;
            
                 JOptionPane.showMessageDialog(frame, "Exit game?");
                 System.exit(0);
                    }
                    else  if(e.getKeyChar()=='P'||e.getKeyChar()=='p'){
                    
                    
                    birdB.update1();// đặt lại tọa đô chim về ban đầu
                    
                    pipeB.update2();// đặt lại tọa độ ống nước về ban đầu
                    
                    scoreB.update3();// đặt lại diem=0;
                    
                    b1=true;
                    isFall = true;
                    createB.setK(1);
                    
                    }
                   
                }

            
            });
           
            
      
           
           
         
        }
        
      scoreB.pointplus();
   
     
    }
       
       
    }



}    

