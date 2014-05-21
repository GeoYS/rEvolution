/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.screen;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.EmptyTransition;
import revolution.res.Images;
import revolution.ui.Screen;
import revolution.ui.ScreenManager;

/**
 *
 * @author geshe9243
 */
public class LoadingScreen extends Screen{

    public static int ID = 0;
    
    public LoadingScreen(ScreenManager sm){
        super(sm);
    }
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        Images.initiateLoading();
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.drawString("Loading: " + Images.percentDone(), 100, 100);
        
        if(Images.loadNext()){
            this.getScreenManager().changeScreen(MainMenuScreen.ID, 
                new EmptyTransition(), new EmptyTransition());
        }
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
    }

    @Override
    public int getID() {
        return 0;
    }
    
}
