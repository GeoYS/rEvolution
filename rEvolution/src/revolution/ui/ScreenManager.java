/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.ui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.Transition;

/**
 *
 * @author Chris
 */
public abstract class ScreenManager extends StateBasedGame{
    public ScreenManager(String name){
        super(name);
    }
    public void addScreen(Screen s){
        this.addState(s);
    }
    public void changeScreen(int id, Transition out, Transition in){
        this.enterState(id, out, in);
    }
    /**
     * Calls init() in all screens.
     * I made this because images have to load first,
     * If there is anything in the other screens
     * that need images before they are actually loaded,
     * they will get null pointers. Therefore this should
     * be called after all loading is done.
     */
    public void reInitScreens() throws SlickException{
        this.getContainer().getInput().removeAllListeners();
        this.init(this.getContainer());
    }
    @Override
    public abstract void initStatesList(GameContainer gc);
}
