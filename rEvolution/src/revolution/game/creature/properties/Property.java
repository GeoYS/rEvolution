/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature.properties;

/**
 *
 * @author Chris
 */
public class Property {
    public PropertyType type;
    public double value;
    public Property(PropertyType type, double value){
        this.type = type;
        this.value = value;
    }
}
