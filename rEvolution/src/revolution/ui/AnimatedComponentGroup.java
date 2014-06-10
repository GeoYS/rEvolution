/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.ui;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.GUIContext;

/**
 *
 * @author GeoYS_2
 */
public abstract class AnimatedComponentGroup extends ComponentGroup{

    private long lastRender;
    
    public AnimatedComponentGroup(GUIContext gc, int xOffset, int yOffset) {
        super(gc, xOffset, yOffset);
    }

    @Override
    public void render(GUIContext guic, Graphics grphcs) throws SlickException {
        long thisRender = System.currentTimeMillis();
        update(thisRender - lastRender);
        lastRender = thisRender;
        super.render(guic, grphcs);
    }
    
    protected abstract void update(long delta);
    
}
