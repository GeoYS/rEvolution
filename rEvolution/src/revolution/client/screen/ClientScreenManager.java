/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.screen;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import revolution.ui.ScreenManager;

/**
 *
 * @author GeoYS_2
 */
public class ClientScreenManager extends ScreenManager{
    public ClientScreenManager(){
        super("rEvolution");
    }
    @Override
    public void initStatesList(GameContainer gc) {
        // Add screens
        this.addScreen(new LoadingScreen(this));
        this.addScreen(new MainMenuScreen(this));
        this.addScreen(new LobbyScreen(this));
        this.addScreen(new NewUserScreen(this));
        
        // Enter first screen
        this.enterState(LoadingScreen.ID);
    }
    
}
