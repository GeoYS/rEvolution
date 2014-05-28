/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.test.clientgame;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import revolution.client.game.entity.Entity;

/**
 *
 * @author GeoYS_2
 */
public class TestEntity extends Entity{
    
    private float x, y, 
            vx, vy; // pixels per second
    private float width, height;
    private Image image;
    
    public TestEntity(float x, float y) throws SlickException{
        this.x = x; 
        this.y = y;
        vx = -5 + 10 * (float)Math.random();
        vy = -5 + 10 * (float)Math.random();
        width = 10 * (float)Math.random();
        height = 10 * (float)Math.random();
        image = new Image("res/sampleButtonNormal.png")
                .getScaledCopy(this.getWidth(), this.getHeight());
    }

    @Override
    public int getX() {
        return (int)x;
    }

    @Override
    public int getY() {
        return (int)y;
    }

    @Override
    public int getWidth() {
        return (int)width;
    }

    @Override
    public int getHeight() {
        return (int)height;
    }

    @Override
    public void interact(Entity e) {
    }

    @Override
    public Image getCurrentImage() {
        return image;
    }

    @Override
    public void update(long delta) {
        x += vx * ((double)delta / 1000);
        y += vy * ((double)delta / 1000);
    }
    
}
