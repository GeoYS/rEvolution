/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.server.screen;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import revolution.ui.Screen;
import revolution.ui.ScreenManager;

/**
 * Screen with settings of the new server.
 * Should have options to save right away to an xml, and 
 * to run server.
 *
 * @author GeoYS_2
 */
public class NewServerScreen extends Screen{
    
    public NewServerScreen(ScreenManager sm){
        super(sm);
    }
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}