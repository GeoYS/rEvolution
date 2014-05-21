/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.screen;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import revolution.client.screen.components.MainMenu;
import revolution.res.Images;
import revolution.ui.Screen;
import revolution.ui.ScreenManager;

/**
 *
 * @author GeoYS_2
 */
public class MainMenuScreen extends Screen{
    
    public static final int ID = 1;
    
    private MainMenu menu;
        
    public MainMenuScreen(ScreenManager sm) {
        super(sm);
        menu = new MainMenu(sm.getContainer(), sm);
    }
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.drawString("rEvolution", 100, 100);
        menu.renderComponents(gc, sbg, grphcs);
        grphcs.drawImage(new Image("res/sampleButtonPressed.png"), 10, 10);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
    }

    @Override
    public int getID() {
        return ID;
    }
    
}
