/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.AI;

import revolution.game.creature.Creature;
import revolution.game.creature.History;

/**
 *
 * @author Christopher Stokes
 */
public class Run {
    public static void mate(Creature creature1, History history1, Creature creature2, History history2){
        System.out.println(creature1.getSpeciesName() + " is frothing at the gash for " + creature2.getSpeciesName());
        int minBirthSize = creature1.properies.relation.family.getMinBirthSize();
        int maxBirthSize = creature1.properies.relation.family.getMaxBirthSize();
        int birthSize = (int) (Math.random() * maxBirthSize) - minBirthSize;
        creature1.population.addToPopulation(birthSize);
        history1.mate.setMate(System.currentTimeMillis());
        history2.mate.setMate(System.currentTimeMillis());
    }
    
    public static void eat(Creature creature1, History history1, Creature creature2){
        history1.eat.setEat(System.currentTimeMillis());
        if(creature2.checkAnimal()){
            creature2.population.removeFromPopulation(1);
        }else {
            creature2.population.removeUnitFromCount(1);
        }
    }
}
