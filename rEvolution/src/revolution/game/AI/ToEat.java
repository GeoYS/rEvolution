/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.AI;

import revolution.game.creature.Creature;
import revolution.game.creature.History;
import revolution.game.creature.properties.Types.Food;
import revolution.game.creature.properties.Types.Size;

/**
 *
 * @author Christopher Stokes
 */
public class ToEat {
    private boolean size;
    private boolean frequency;
    private boolean type;
    public static History eater;
    
    public static int decisionRating;
    
    public static int getDecision(Creature creature1, Creature creature2){
        if(frequency(creature1, creature2) && size(creature1, creature2)
                && type(creature1, creature2)){
            return decisionRating;
        } else {
            return 0;
        }
    }
    
    private static boolean type(Creature creature1, Creature creature2){
        Food eater = creature1.properies.personality.food;
        boolean eatie = creature2.checkAnimal();
        
        if(eater.getEatMeat() > eater.getEatVeg() && eatie){
            decisionRating = getHunger(creature1);
            return true;
        } else if(eater.getEatMeat() < eater.getEatVeg() && !eatie){
            decisionRating = getHunger(creature1);
            return true;
        } else if(eater.getEatVeg() - eater.getEatMeat() > 2 && eater.getEatVeg() < 6 && eatie && getHunger(creature1) > 5){
            decisionRating = getHunger(creature1) - (eater.getEatVeg() - eater.getEatMeat());
            return true;
        } else if(eater.getEatMeat() - eater.getEatVeg() > 2 && eater.getEatMeat() < 6 && !eatie && getHunger(creature1) > 5){
            decisionRating = getHunger(creature1) - (eater.getEatVeg() - eater.getEatMeat());
            return true;
        }
        else return false;        
    }
    
    private static boolean frequency(Creature creature1, Creature creature2){
        boolean flag = false;
        for(History i : creature1.population.Instances){ 
            System.out.println(creature1.getSpeciesName() + " v.s " + creature2.getSpeciesName());
            eater = i;
            if(System.currentTimeMillis() > 
                    i.eat.lastEat() + eatWait(creature1.properies.personality.food.getFoodFrequency())){
               flag = true;
               break;
            } else {
                flag = false;
            }
        }
        System.out.println("");
        return flag;
    }
    
    private static boolean size(Creature creature1, Creature creature2){
        Size eater = creature1.properies.personality.food.getFoodSize();
        Size eatie = creature2.properies.body.size;
        
        if(isAbout(eater.getHeight(), eatie.getHeight()) && 
                isAbout(eater.getLength(), eatie.getLength()) &&
                isAbout(eater.getWeight(), eatie.getWeight())){
            return true;
        }
        else {
            return false;
        }
    }
    
    private static boolean isAbout(int args1, int args2){
        if(args1 <= args2 + 1 && args1 >= args2 - 1){
            return true;
        }
        else {
            return false;
        }
    }
    
    private static long eatWait(int frequencyRating){
        switch(frequencyRating) {
            case 1:
                return 100_000;
            case 2:
                return 200_000;
            case 3:
                return 300_000;
            case 4:
                return 400_000;
            case 5:
                return 500_000;
            case 6:
                return 600_000;
            case 7:
                return 700_000;
            case 8:
                return 800_000;
            case 9:
                return 900_000;
            case 10:
                return 1_000_000;
            default:
                return 1_000_000;
        }        
    }
    
    private static int getHunger(Creature creature1){
        long hungerRate;
        hungerRate = (System.currentTimeMillis() - eater.eat.lastEat()) / eatWait(creature1.properies.personality.food.getFoodFrequency());
        if(hungerRate <= 2){
            return 1;
        } else if(hungerRate <= 3){
            return 2;
        } else if(hungerRate <= 4){
            return 3;
        } else if(hungerRate <= 5){
            return 4;
        } else if(hungerRate <= 6){
            return 5;
        } else if(hungerRate <= 7){
            return 6;
        } else if(hungerRate <= 8){
            return 7;
        } else if(hungerRate <= 9){
            return 8;
        } else if(hungerRate <= 10){
            return 9;
        } else if(hungerRate > 10){
            return 10;
        } else {
            return 0;
        }    
    }
    
}
