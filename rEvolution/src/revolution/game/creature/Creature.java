/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature;

import revolution.game.creature.properties.Property;
import java.util.ArrayList;
import java.util.HashMap;
import revolution.game.creature.properties.PropertySet;

/**
 *
 * @author Chris
 */
public class Creature {
    private HashMap<String, PropertySet> properties = new HashMap<>();
    public PropertySet properies = new PropertySet();    
    public Creature(){
            
    }
}