/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.screen;

import org.newdawn.slick.GameContainer;
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
        this.addScreen(new MainMenuScreen(this));
    }
    
}
