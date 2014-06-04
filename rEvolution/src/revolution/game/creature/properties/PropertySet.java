/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature.properties;

import java.util.HashMap;
import revolution.game.creature.Constants;
import revolution.game.creature.Creature;
import revolution.game.creature.Rate;
import revolution.game.creature.properties.Types.Characteristics;
import revolution.game.creature.properties.Types.Food;
import revolution.game.creature.properties.Types.Size;

/**
 *
 * @author Christopher Stokes
 */
public class PropertySet {
    
          
    HashMap<String, Property> properties = new HashMap<>();
    public Body body;
    public Personality personality;
    public Environment environment;
    
    public class Body{
        public Size size;
        
        public Body(){
            this.size = new Size(1,2,3);
        }
    }

    public class Personality{
        public Characteristics characteristic;
        public Food food;
        
        public Personality(){
            this.characteristic = new Characteristics(1, 2, 3);
            this.food = new Food(new Size(1,2,3), 2, 3, 4);
        }
    }
    
    public class Environment{
        public Property median;
        public Property area;
        
        public Environment(){
            this.median = new Property(this);
            this.area = new Property(this);
        }
    }
    public PropertySet(){
        this.body = new Body();
        this.personality = new Personality();
        this.environment = new Environment();
        
    }
}
