/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.ui;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.Transition;

/**
 *
 * @author Chris
 */
public abstract class Screen extends BasicGameState{
    private ScreenManager screenManager;
    private ArrayList<AbstractComponent> components;
    public Screen(ScreenManager sm){
        this.screenManager = sm;
        components = new ArrayList<>();
    }
    public ScreenManager getScreenManager(){
        return screenManager;
    }
    
    /**
     * Register that the component is attached to the screen.
     * @param c 
     */
    public void addComponent(AbstractComponent c){
        components.add(c);
    }
    
    public ArrayList<AbstractComponent> getComponents(){
        return components;
    }
    public void clearComponents(){
        components.clear();
    }

    @Override
    public void enter(GameContainer container, StateBasedGame game) throws SlickException {
        super.enter(container, game);
        for(AbstractComponent c : this.getComponents()){
            c.setAcceptingInput(true);
        }
    }
    @Override
    public void leave(GameContainer container, StateBasedGame game) throws SlickException {
        super.enter(container, game);
        for(AbstractComponent c : this.getComponents()){
            c.setAcceptingInput(false);
        }
    }
    @Override
    public abstract void init(GameContainer gc, StateBasedGame sbg) throws SlickException;
    @Override
    public abstract void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException ;
    @Override
    public abstract void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException;
    @Override
    public abstract int getID();
}
