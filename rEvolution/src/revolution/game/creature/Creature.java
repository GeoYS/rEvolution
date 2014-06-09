/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature;

import revolution.game.creature.properties.Property;
import java.util.ArrayList;
import java.util.HashMap;
import revolution.game.creature.properties.Population;
import revolution.game.creature.properties.PropertySet;

/**
 *
 * @author Chris
 */
public class Creature {
    //  public History history = new History();
    public PropertySet properies = new PropertySet();
    public MindState mind = new MindState();
    public Population population = new Population();
    private int populationSize = 0;
    private boolean isAnimal;
    private boolean isVulnerable;
    //not final solution
    private String createdBy, speciesName;
    public Creature(String createdBy, String speciesName, boolean isAnimal){
        this.createdBy = createdBy;
        this.speciesName = speciesName;
        this.isAnimal = isAnimal;
    }
    
    public boolean checkAnimal(){
        return isAnimal;
    }
    
    public String getCreator(){
        return createdBy;
    }
    
    public String getSpeciesName(){
        return speciesName;
    }
    
}