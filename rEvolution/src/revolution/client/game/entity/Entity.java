/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.game.entity;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 * Base entity.
 * @author geshe9243
 */
public abstract class Entity {
    private double x, y;
    public Entity(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return (int) x;
    }
    public int getY(){
        return (int) y;
    }
    public void setPosition(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * The image that should be drawn to represent the entity.
     * @return 
     */
    public abstract Image getCurrentImage();
    
    /**
     * Draws the image at 0, 0. A camera and this entity's
     * x,y coordinates should be used to transform the graphics 
     * so it is drawn at the right position.
     * @param grphcs 
     */
    public void render(Graphics grphcs){
        grphcs.drawImage(this.getCurrentImage(), 0, 0);
    }
    public abstract void update(long delta);
}
