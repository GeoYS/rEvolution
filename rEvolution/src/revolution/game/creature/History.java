/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature;

import java.io.Serializable;

/**
 *
 * @author Christopher Stokes
 */
public class History implements Serializable{
    
    public Eat eat = new Eat();
    public Mate mate = new Mate();
    
    private long bornTime = 0;
    
    public History(long bornTime){
        this.bornTime = bornTime;
    }
    
    public class Eat {
        private long lastEat = 0;
    
        public void setEat(long gameTime){
            lastEat = gameTime;
        }
    
        public long lastEat(){
            return lastEat;
        }
    }
    
    public class Mate {
        
        public Mate(){
            
        }
        
        public Mate(long Pollinate){
            lastMate = Pollinate;
        }
        
        private long lastMate = 0;
        
        public void setMate(long gameTime){
            lastMate = gameTime;
        }
        
        public long lastMate(){
            return lastMate;
        }
    }
    
    public long getBornTime(){
        return bornTime;
    }
}
