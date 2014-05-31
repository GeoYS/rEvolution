/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature.properties;

import java.util.HashMap;
import revolution.game.creature.Creature;
import revolution.game.creature.Constants;
import revolution.game.creature.Rate;

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
        public Property height;
        public Property lenght;
        public Property weight;
        
        public Body(){
            this.height = new Property(this, new Rate(10));
            this.lenght = new Property(this, new Rate(10));
            this.weight = new Property(this, new Rate(10));
        }
    }

    public class Personality{
        public Property aggression;
        public Property intelligence;
        public Property fertility;
        public Property food;
        public Property family;
        
        public Personality(){
            this.aggression = new Property(this, new Rate(10));
            this.intelligence = new Property(this, new Rate(10));
            this.fertility = new Property(this, new Rate(10));
            this.food = new Property(this);
            this.family = new Property(this);
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
