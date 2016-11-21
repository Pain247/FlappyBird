
package bubbleJumping;

import java.io.File;

/**
 *
 * @author D
 */
public class Score {
    private static int score =0;
    private Bird birdS= new Bird();
    private Pipe pipeS = new Pipe();
    private static boolean bl= false;
    public static int getPoint(){ return score;}
    private SoundPlayer point =new SoundPlayer(new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\BubbleJumping\\sounds\\getmoney.wav"));
    
    public void pointplus(){
    
   if((birdS.getX()+30)> pipeS.getX1()&& birdS.getX()<(pipeS.getX1()+50)) bl= true;
    
    if( bl ==true && birdS.getX()>(pipeS.getX1()+50)){ 
        score++; 
        bl=false;
        point.play();
    }
    
    
    if((birdS.getX()+30)> pipeS.getX2()&& birdS.getX()<(pipeS.getX2()+50)) bl= true;
    
    if( bl ==true && birdS.getX()>(pipeS.getX2()+50)){ 
        score++; 
        bl=false;
        point.play();
    }
    
    
    if((birdS.getX()+30)> pipeS.getX3()&& birdS.getX()< (pipeS.getX3()+50)) bl= true;
    
    if( bl ==true &&birdS.getX()>(pipeS.getX3()+50)){ 
        score++; 
        bl=false;
        point.play();
    }
    
    
    }
    public void update3(){
    score=0;
    }
}

