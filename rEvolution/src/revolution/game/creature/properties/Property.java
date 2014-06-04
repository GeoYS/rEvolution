/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature.properties;

import revolution.game.creature.properties.PropertySet.Body;
import revolution.game.creature.properties.PropertySet.Personality;
import revolution.game.creature.properties.PropertySet.Environment;
import revolution.game.creature.Rate;

/**
 *
 * @author Chris
 */
public class Property {
    private double value;
    private Object object;
    public Property(double value){
        this.value = value;
    }
    
    public Property(Object object){
        this.object = object;
    }
    
    public Property(Body body, Rate rate){
    }
    
    public Property(Personality personality, Rate rate){
    }
    
    public Property(Environment environment, Rate rate){
    }
    
    public Property(){
    }
            
    public void set(){
    }
    
    public Object get(){
        return object;
    }
}
