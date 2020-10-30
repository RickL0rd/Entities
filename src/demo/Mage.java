
package demo;

import java.util.concurrent.ThreadLocalRandom;


public class Mage extends Entity{

    public Mage() {
        super(6, 4, 9, 5);
    }
    
    //Unik eftersom trollkarlens passive påverkar flyförsöket
    @Override
    public boolean escapeAttempt(){
        boolean escapeSuccesfull = false;
        
        int escapeChance = 80;
        
        int escapeAttempt = ThreadLocalRandom.current().nextInt(0, 100);
        
         if (escapeAttempt <= escapeChance) {
            escapeSuccesfull = true;
            
        }
    
        return escapeSuccesfull;
        
    }
    
}
