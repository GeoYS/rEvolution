/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.screen;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import revolution.ui.Screen;
import revolution.ui.ScreenManager;

/**
 *
 * @author GeoYS_2
 */
public class MainClientScreen extends Screen{
    
    public static final int ID = 1;
        
    public MainClientScreen(ScreenManager sm) {
        super(sm);
    }
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.drawString("rEvolution", 100, 100);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
    }

    @Override
    public int getID() {
        return ID;
    }
    
}
