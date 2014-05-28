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
    
    /**
     * Get entity's x coordinate.
     * @return 
     */
    public abstract int getX();
    
    /**
     * Get entity's y coordinate.
     * @return 
     */
    public abstract int getY();
    
    /**
     * Get entity's width.
     * @return 
     */
    public abstract int getWidth();
    
    /**
     * Get entity's height.
     * @return 
     */
    public abstract int getHeight();
    
    /**
     * Define what happens when two entities interact (eg. collision).
     * @param e Entity that is interacted with
     */
    public abstract void interact(Entity e);
    
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
