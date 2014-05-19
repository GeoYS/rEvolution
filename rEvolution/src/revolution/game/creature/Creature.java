/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature;

import revolution.game.creature.properties.Property;
import java.util.ArrayList;
import java.util.HashMap;
import revolution.game.creature.properties.PropertyType;

/**
 *
 * @author Chris
 */
public class Creature {
    private HashMap<PropertyType, Double> properties;
    public Creature(ArrayList<Property> properties){
        for(Property p : properties){
            this.properties.put(p.type, p.value);
        }
    }
    public double getPropertyValue(PropertyType type){
        return properties.containsKey(type) ? properties.get(type) : 0;
    }
}
