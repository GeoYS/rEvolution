/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature;

import java.io.Serializable;

/**
 *
 * @author Chris
 */
public class Rate implements Serializable{
    private int outOf;
    private int rating;
    public Rate(int outOf){
        this.outOf = outOf;
    }
    public double setRating(int rating){
        this.rating = rating;
        return this.rating / this.outOf;
    }
    
    public double getValue(){
        return this.rating;
    }
}
