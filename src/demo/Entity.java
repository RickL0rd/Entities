
package demo;

import java.util.concurrent.ThreadLocalRandom;


public class Entity {

   
    protected int initiative;
    protected int endurance;
    protected int attack;
    protected int flexibility;

    public Entity(int initiative, int endurance, int attack, int flexibility) {
        this.initiative = initiative;
        this.endurance = endurance;
        this.attack = attack;
        this.flexibility = flexibility;

    }
    
    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getFlexibility() {
        return flexibility;
    }

    public void setFlexibility(int flexibility) {
        this.flexibility = flexibility;
    }

    
    public int rollTurnOrder() {
       int turnOrderResult = 0;
       
       for (int i = 0; i < initiative; i++) {
          int diceValue = ThreadLocalRandom.current().nextInt(1, 6);   
          turnOrderResult += diceValue;     
        }
            
        return turnOrderResult;
    }
    
    public int attackAttempt() {
         int AttackResult = 0;
        
         for (int i = 0; i < attack; i++) {
          int diceValue = ThreadLocalRandom.current().nextInt(1, 6);   
          AttackResult += diceValue;     
        }
           
        return AttackResult;
    }
    
     public int dodgeAttempt() {
        int dodgeResult = 0;
        
        for (int i = 0; i < flexibility; i++) {
          int diceValue = ThreadLocalRandom.current().nextInt(1, 6);   
          dodgeResult += diceValue;     
        }
        
        return dodgeResult;
    } 
    
    public boolean escapeAttempt() {
        boolean escapeSuccesfull = false;
        
        int escapeChance =  flexibility * 10;
        
        int escapeAttempt = ThreadLocalRandom.current().nextInt(0, 100);
        
        if (escapeAttempt <= escapeChance) {
            escapeSuccesfull = true;    
        }
    
        return escapeSuccesfull;

    }

}