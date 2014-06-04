/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature.properties.Types;

/**
 *
 * @author Christopher Stokes
 */
public class Characteristics {
    private int aggression;
    private int intelligence;
    private int family;
    
    public Characteristics(int aggression, int intelligence, int family){
        this.aggression = aggression;
        this.intelligence = intelligence;
        this.family = family;
    }
    
    public int getAggression(){
        return aggression;
    }
    
    public int getIntelligence(){
        return intelligence;
    }
    
    public int getFamily(){
        return family;
    }
}
