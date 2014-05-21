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
        // Do nothing here.
        // Rendering should be done in a screen by 
        // calling renderComponents.
    }
    
    public void renderComponents(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException{
        for(AbstractComponent c : components){
            c.setLocation(this.getX() + c.getX(), this.getY() + c.getY());
            c.render(gc, grphcs);
            c.setLocation(c.getX() - this.getX(), c.getY() - this.getY());
        }
    }
    /**
     * Useful if there is a sub-window that needs focus.
     */
    public void disableComponents(){
        for(AbstractComponent c : components){
            c.setAcceptingInput(false);
        }
    }    
    /**
     * Useful if there is a sub-window that needs focus.
     */
    public void enableComponents(){
        for(AbstractComponent c : components){
            c.setAcceptingInput(true);
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
    
    @Override
    public void keyPressed(int key, char c) {
        for(AbstractComponent comp : components){
            comp.keyPressed(key, c);
        }
    }
    
    @Override
    public void keyReleased(int key, char c) {
        for(AbstractComponent comp : components){
            comp.keyReleased(key, c);
        }
    }
    
    @Override
    public void mouseClicked(int button, int x, int y, int clickCount) {
        for(AbstractComponent c : components){
            c.mouseClicked(button, x, y, clickCount);
        }
    }

    @Override
    public void mouseDragged(int oldx, int oldy, int newx, int newy) {
        for(AbstractComponent c : components){
            c.mouseDragged(oldx, oldy, newx, newy);
        }
    }

    @Override
    public void mouseMoved(int oldx, int oldy, int newx, int newy) {
        for(AbstractComponent c : components){
            c.mouseMoved(oldx, oldy, newx, newy);
        }
    }

    @Override
    public void mousePressed(int button, int x, int y) {
        for(AbstractComponent c : components){
            c.mousePressed(button, x, y);
        }
    }


    @Override
    public void mouseReleased(int button, int x, int y) {
        for(AbstractComponent c : components){
            c.mouseReleased(button, x, y);
        }
    }
    @Override
    public void mouseWheelMoved(int newValue) {
        for(AbstractComponent c : components){
            c.mouseWheelMoved(newValue);
        }
    }
}
