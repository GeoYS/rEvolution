 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.world;

import java.util.ArrayList;
import revolution.game.AI.Interact;
import revolution.game.creature.Creature;

/**
 *
 * @author Chris
 */
public class World {
    //list of all the different types of creatures
    public ArrayList<Creature> populations;    
    private ArrayList<Area> areas;
    public World(//ArrayList<Population> populations,
            ArrayList<Area> areas){
        this.populations = new ArrayList<>();
        this.areas = areas;
    }
    
    // other methods to get information from or add to the world
    
    public void update(long delta){
        // update everything in the world
        // eg. call area.update(); for every area
        
        for(int c1 = 0; c1 < populations.size(); c1++){
            for(int c2 = 0; c2 < populations.size(); c2++){
                Interact.interact(populations.get(c1), populations.get(c2));   
            }
        }
    }
}
