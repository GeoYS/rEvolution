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
    
    public ComponentGroup(GUIContext gc){
        super(gc);
        components = new ArrayList<>();
    }
    
    public ArrayList<AbstractComponent> getComponents(){
        return components;
    }
    
    public void renderComponents(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException{
        for(AbstractComponent c : components){
            c.render(gc, grphcs);
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
