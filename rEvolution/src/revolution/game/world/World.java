 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.world;

import java.util.ArrayList;
import revolution.game.creature.Population;

/**
 *
 * @author Chris
 */
public class World {
    private ArrayList<Population> populations;    
    private ArrayList<Area> areas;
    public World(ArrayList<Population> populations,
            ArrayList<Area> areas){
        this.populations = populations;
        this.areas = areas;
    }
}
