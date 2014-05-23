/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.screen.components;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.state.transition.HorizontalSplitTransition;
import revolution.client.screen.LobbyScreen;
import revolution.client.screen.MainMenuScreen;
import revolution.res.ClientImages;
import revolution.ui.Button;
import revolution.ui.ComponentGroup;
import revolution.ui.ScreenManager;

/**
 *
 * @author geshe9243
 */
public class MainMenu extends ComponentGroup{
    
    private Button lobby1, lobby2;
    
    public MainMenu(GUIContext context, final ScreenManager sm){
        super(context, 0, 0);
        lobby1 = new Button(context, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 200, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(LobbyScreen.ID, new EmptyTransition(), new HorizontalSplitTransition());
            }
        };
        lobby2 = new Button(context, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 300, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(LobbyScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        this.addComponent(lobby1);
        this.addComponent(lobby2);
    }
}
