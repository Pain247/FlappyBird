
package bubbleJumping;

/**
 *
 * @author Dell
 */
public class Score {
    private static int score =0;
    private Bubble bubbleS= new Bubble();
    private Pipe pipeS = new Pipe();
    private static boolean bl= false;
    public static int getPoint(){ return score;}
    
    
    public void pointplus(){
    
   if((bubbleS.getX()+30)> pipeS.getX1()&& bubbleS.getX()<(pipeS.getX1()+50)) bl= true;
    
    if( bl ==true && bubbleS.getX()>(pipeS.getX1()+50)){ 
        score++; 
        bl=false;
    }
    
    
    if((bubbleS.getX()+30)> pipeS.getX2()&& bubbleS.getX()<(pipeS.getX2()+50)) bl= true;
    
    if( bl ==true && bubbleS.getX()>(pipeS.getX2()+50)){ 
        score++; 
        bl=false;
    }
    
    
    if((bubbleS.getX()+30)> pipeS.getX3()&& bubbleS.getX()< (pipeS.getX3()+50)) bl= true;
    
    if( bl ==true &&bubbleS.getX()>(pipeS.getX3()+50)){ 
        score++; bl=false;
    }
    
    
    }
    public void update3(){
    score=0;
    }
}

