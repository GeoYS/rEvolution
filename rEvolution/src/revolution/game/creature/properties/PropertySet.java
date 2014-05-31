/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature.properties;

import java.util.HashMap;
import revolution.game.creature.Creature;
import revolution.game.creature.Constants;

/**
 *
 * @author Christopher Stokes
 */
public class PropertySet {
    
          
    HashMap<String, Property> properties = new HashMap<>();
    
    public PropertySet(){
        
    }
    
    public PropertySet(String DEFAULT_PROFILE){
        if(DEFAULT_PROFILE.equals(Constants.PropertySets.BODY_SET)){
            properties.put(Constants.Properties.HEIGHT, null);
            properties.put(Constants.Properties.LENGHT, null);
            properties.put(Constants.Properties.WEIGHT, null);
        }else if(DEFAULT_PROFILE.equals(Constants.PropertySets.PERSONALITY_SET)){
            properties.put(Constants.Properties.AGGRESSION, null);
            properties.put(Constants.Properties.INTELLIGENCE, null);
            properties.put(Constants.Properties.FERTILIY, null);
            properties.put(Constants.Properties.FOOD_TYPE, null);
            properties.put(Constants.Properties.FAMILY_STRUCTURE, null);
            
        }else if(DEFAULT_PROFILE.equals(Constants.PropertySets.ENVIRONMENT_SET)){
            properties.put(Constants.Properties.MEDIAN, null);
            properties.put(Constants.Properties.IDEAL_SPACE, null);            
        }
    }
}
