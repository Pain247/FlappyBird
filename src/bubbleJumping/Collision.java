
package bubbleJumping;

import java.io.File;

/**
 *
 * @author D
 */

public class Collision{
    
    private Bird birdCh= new Bird();
    private Pipe pipeCh= new Pipe();

    public boolean Die(){
        
        if(birdCh.getY()+24>=392) return true;
        
        if((birdCh.getY()<=pipeCh.getH1())&&((birdCh.getX()+34)>=pipeCh.getX1())&&(birdCh.getX()<=(pipeCh.getX1()+50))){
            return true;
        }
        
        if((birdCh.getY()+24)>=(pipeCh.getH1()+100)&&((birdCh.getX()+34)>=pipeCh.getX1())&&((birdCh.getX())<=(pipeCh.getX1()+50))) { 
            return true;
        }
      
        
        if((birdCh.getY()<=pipeCh.getH2())&&((birdCh.getX()+34)>=pipeCh.getX2())&&(birdCh.getX()<=(pipeCh.getX2()+50))) {
            return true;
        }
        if((birdCh.getY()+24)>=(pipeCh.getH2()+100)&&((birdCh.getX()+34)>=pipeCh.getX2())&&((birdCh.getX())<=(pipeCh.getX2()+50))) {
            return true;
        }
        
       
        if((birdCh.getY()<=pipeCh.getH3())&&((birdCh.getX()+34)>=pipeCh.getX3())&&(birdCh.getX()<=(pipeCh.getX3()+50))) {
            return true;
        }
        if((birdCh.getY()+24)>=(pipeCh.getH3()+100)&&((birdCh.getX()+34)>=pipeCh.getX3())&&((birdCh.getX())<=(pipeCh.getX3()+50))) {
            return true;
        }
        
      
        
        return false;
    }
    
    
    
    
    
}
