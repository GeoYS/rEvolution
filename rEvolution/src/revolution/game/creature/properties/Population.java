/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature.properties;

import java.util.ArrayList;
import revolution.game.creature.Creature;
import revolution.game.creature.History;

/**
 *
 * @author Chris
 */
public class Population {
    private int count = 0;
    public ArrayList<History> Instances = new ArrayList<>();
    
    public int getPopulationSize(){
        return Instances.size();
    }
    
    public void addToPopulation(int addAmount){
        for(int i = 0; i < addAmount; i++){
            Instances.add(new History());
        }
    }
    
    public void removeFromPopulation(int removeAmount){
        if(removeAmount < Instances.size()){
            for(int i = 0; i < removeAmount; i++){
                Instances.remove(i);
            }
        }
    }
    
    public void removeInstance(History history){
        Instances.remove(history);
    }
    
    public void addUnitToCount(int addAmount){
        count += addAmount;
    }
    
    public void removeUnitFromCount(int removeAmount){
        count -= removeAmount;
    }
    
    public int getCount(){
        return count;
    }
}