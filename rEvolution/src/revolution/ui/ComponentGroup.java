/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.ui;

import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.state.StateBasedGame;

/**
 * A grouping of AbstractComponent, eg buttons.
 * Useful, for example, for menus or sub-windows.
 * 
 * FYI:
 * - input events are fired from the GameContainer
 * @author GeoYS_2
 */
public abstract class ComponentGroup extends AbstractComponent{    
    
    private ArrayList<AbstractComponent> components;
    private int xOffset, yOffset;
    
    /**
     * A new empty group of components.
     * @param gc
     * @param xOffset x-offset of all components
     * @param yOffset y-offset of all components
     */
    public ComponentGroup(GUIContext gc, int xOffset, int yOffset){
        super(gc);
        components = new ArrayList<>();
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    /**
     * Gets the y offset.
     * @return 
     */
    @Override
    public int getY() {
        return yOffset;
    }

    /**
     * Gets the x offset.
     * @return 
     */
    @Override
    public int getX() {
        return xOffset;
    }

    /**
     * Sets the offset on all the components.
     * @param xOffset
     * @param yOffset 
     */
    @Override
    public void setLocation(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }
    
    public ArrayList<AbstractComponent> getComponents(){
        return components;
    }

    @Override
    public void render(GUIContext guic, Graphics grphcs) throws SlickException {
        for(AbstractComponent c : components){
            c.setLocation(this.getX() + c.getX(), this.getY() + c.getY());
            c.render(guic, grphcs);
            c.setLocation(c.getX() - this.getX(), c.getY() - this.getY());
        }
    }
    
    @Override
    public void setAcceptingInput(boolean acceptingInput) {
        for(AbstractComponent c : components){
            c.setAcceptingInput(acceptingInput);
        }
    }
    
    /**
     * Add a. AbstractComponent implementation, 
     * eg. buttons.
     * @param component 
     */
    public void addComponent(AbstractComponent component){
        components.add(component);
    }
}
