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
    private long lastEat = 0;
    
    public void setEat(long gameTime){
        lastEat = gameTime;
    }
    
    public long lastEat(){
        return lastEat;
    }
}
