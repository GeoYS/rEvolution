/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature;

/**
 *
 * @author Christopher Stokes
 */
public class History {
    
    public Eat eat = new Eat();
    public Mate mate = new Mate();
    
    public class Vulnerability {
        private boolean isVulnerable;
        
        public void setVulnerability(boolean isVulnerability){
            this.isVulnerable = isVulnerability;
        }
    
        public boolean getVulnerability(){
            return isVulnerable; 
        }
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
        private long lastMate = 0;
        
        public void setMate(long gameTime){
            lastMate = gameTime;
        }
        
        public long lastMate(){
            return lastMate;
        }
    }
}
