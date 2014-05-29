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
                .getScaledCopy((int)this.getWidth(), (int)this.getHeight());
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getHeight() {
        return height;
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
