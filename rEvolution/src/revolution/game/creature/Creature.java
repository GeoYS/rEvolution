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
    public History history = new History();
    public PropertySet properies = new PropertySet();
    public MindState mind = new MindState();
    private boolean isAnimal = false;
    public Creature(Boolean isAnimal){
            this.isAnimal = isAnimal;
    }
    
    public boolean checkAnimal(){
        return isAnimal;
    }
}