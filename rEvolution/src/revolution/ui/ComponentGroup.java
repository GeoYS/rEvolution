/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.ui;

import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.InputListener;
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
    
    private ArrayList<AbstractComponent> components = null;
    private int xOffset, yOffset;
    private GUIContext gc;
    
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
        this.gc = gc;
        
        // PROBABLY BAD CONVENTION, BUT THIS IS NECESSARY FOR ALL (!) 
        // COMPONENTS SO THAT THEY WORK CORRECTLY WITH SCREENS AND 
        // TRANSITIONS. MAKE SURE THIS LINE OF CODE IS IN ANY CLASS THAT 
        // IMPLEMENTS THE SLICK ABSTRACTCOMPONENT CLASS!!!!!!
        // THE REASON IS BECAUSE COMPONENTS LIKE BUTTONS SHOULD
        // NOT BE PRIMARY LISTENERS TO INPUT; RATHER THEY SHOULD BE ADDED 
        // TO "SCREENS" (THAT'S HOW I SET IT UP).
        gc.getInput().removeListener(this);
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
        int xDif = xOffset - this.xOffset, yDif = yOffset - this.yOffset;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        if(this.components == null){
            return;
        }
        for(AbstractComponent c : this.components){
            c.setLocation(c.getX() + xDif, c.getY() + yDif);
        }
    }
    
    
    @Override
    public void keyPressed(int key, char c) {
        super.keyPressed(key, c);
        for(InputListener il : this.getComponents()){
            il.keyPressed(key, c);
        }
    }

    @Override
    public void keyReleased(int key, char c) {
        super.keyReleased(key, c);        
        for(InputListener il : this.getComponents()){
            il.keyReleased(key, c);
        }
    }

    @Override
    public void mouseClicked(int button, int x, int y, int clickCount) {
        super.mouseClicked(button, x, y, clickCount);
        for(InputListener il : this.getComponents()){
            il.mouseClicked(button, x, y, clickCount);
        }        
    }

    @Override
    public void mouseDragged(int oldx, int oldy, int newx, int newy) {
        super.mouseDragged(oldx, oldy, newx, newy);
        for(InputListener il : this.getComponents()){
            il.mouseDragged(oldx, oldy, newx, newy);
        }        
    }

    @Override
    public void mouseMoved(int oldx, int oldy, int newx, int newy) {
        super.mouseMoved(oldx, oldy, newx, newy);
        for(InputListener il : this.getComponents()){
            il.mouseMoved(oldx, oldy, newx, newy);
        }        
    }

    @Override
    public void mousePressed(int button, int x, int y) {
        super.mousePressed(button, x, y);
        for(InputListener il : this.getComponents()){
            il.mousePressed(button, x, y);
        }        
    }

    @Override
    public void mouseReleased(int button, int x, int y) {
        super.mouseReleased(button, x, y);
        for(InputListener il : this.getComponents()){
            il.mouseReleased(button, x, y);
        }        
    }

    @Override
    public void mouseWheelMoved(int newValue) {
        super.mouseWheelMoved(newValue);
        for(InputListener il : this.getComponents()){
            il.mouseWheelMoved(newValue);
        }        
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
    
    /**
     * Remove a. AbstractComponent implementation, 
     * eg. buttons.
     * @param component 
     */
    public void removeComponent(AbstractComponent component){
        components.remove(component);
    }
}
