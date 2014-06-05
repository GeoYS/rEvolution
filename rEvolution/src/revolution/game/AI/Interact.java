/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.AI;

import revolution.game.creature.Creature;
import revolution.game.creature.properties.Types.Location;

/**
 *
 * @author Christopher Stokes
 */
public class Interact {
    public boolean wouldInteract(Creature creature1, Creature creature2){
        Location location1 = creature1.properies.environment.location;
        Location location2  = creature2.properies.environment.location;
        int sharedPlaces = location1.shares(location2);
        
        //not sure waht to do with probaility yet
        
    }
}
