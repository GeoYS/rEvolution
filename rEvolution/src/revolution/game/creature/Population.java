/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature;

/**
 *
 * @author Chris
 */
public abstract class Population {
    private Creature creature;
    private int size;
    public Population(Creature creature, int size){
        this.creature = creature;
        this.size = size;
    }
    public abstract void interact(Population other);
}
