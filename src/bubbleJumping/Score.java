
package bubbleJumping;

/**
 *
 * @author Dell
 */
public class Score {
    private static int score =0;
    private Bird birdS= new Bird();
    private Pipe pipeS = new Pipe();
    private static boolean bl= false;
    public static int getPoint(){ return score;}
    
    
    public void pointplus(){
    
   if((birdS.getX()+30)> pipeS.getX1()&& birdS.getX()<(pipeS.getX1()+50)) bl= true;
    
    if( bl ==true && birdS.getX()>(pipeS.getX1()+50)){ 
        score++; 
        bl=false;
    }
    
    
    if((birdS.getX()+30)> pipeS.getX2()&& birdS.getX()<(pipeS.getX2()+50)) bl= true;
    
    if( bl ==true && birdS.getX()>(pipeS.getX2()+50)){ 
        score++; 
        bl=false;
    }
    
    
    if((birdS.getX()+30)> pipeS.getX3()&& birdS.getX()< (pipeS.getX3()+50)) bl= true;
    
    if( bl ==true &&birdS.getX()>(pipeS.getX3()+50)){ 
        score++; bl=false;
    }
    
    
    }
    public void update3(){
    score=0;
    }
}

