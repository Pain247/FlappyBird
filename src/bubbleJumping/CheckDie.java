
package bubbleJumping;

/**
 *
 * @author Dell
 */

public class CheckDie{
    
    private Bubble bubbleCh= new Bubble();
    private Pipe pipeCh= new Pipe();
    private Score scoreCh = new Score();
    public boolean Die(){
        
        if(bubbleCh.getY()+30>=392) return true;
        
        if((bubbleCh.getY()<=pipeCh.getH1())&&((bubbleCh.getX()+30)>=pipeCh.getX1())&&(bubbleCh.getX()<=(pipeCh.getX1()+50))) return true;
        if((bubbleCh.getY()+30)>=(pipeCh.getH1()+100)&&((bubbleCh.getX()+30)>=pipeCh.getX1())&&((bubbleCh.getX())<=(pipeCh.getX1()+50))) return true;
      
        
        if((bubbleCh.getY()<=pipeCh.getH2())&&((bubbleCh.getX()+30)>=pipeCh.getX2())&&(bubbleCh.getX()<=(pipeCh.getX2()+50))) return true;
        if((bubbleCh.getY()+30)>=(pipeCh.getH2()+100)&&((bubbleCh.getX()+30)>=pipeCh.getX2())&&((bubbleCh.getX())<=(pipeCh.getX2()+50))) return true;
        
       
        if((bubbleCh.getY()<=pipeCh.getH3())&&((bubbleCh.getX()+30)>=pipeCh.getX3())&&(bubbleCh.getX()<=(pipeCh.getX3()+50))) return true;
        if((bubbleCh.getY()+30)>=(pipeCh.getH3()+100)&&((bubbleCh.getX()+30)>=pipeCh.getX3())&&((bubbleCh.getX())<=(pipeCh.getX3()+50))) return true;
        
      
        
        return false;
    }
    
    
    
    
    
}
