/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.server.screen.components;

import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import revolution.res.ClientImages;
import revolution.server.screen.NewServerScreen;
import revolution.server.screen.SavedServerScreen;
import revolution.ui.Button;
import revolution.ui.ComponentGroup;
import revolution.ui.ScreenManager;

/**
 *
 * @author geshe9243
 */
public class MainMenu extends ComponentGroup{
    
    private Button newServer, loadServer;
    
    public MainMenu(GUIContext gc, final ScreenManager sm){
        super(gc, 0, 0);
        newServer = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 200, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(NewServerScreen.ID, new EmptyTransition(), new FadeInTransition());
            }
        };
        loadServer = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 300, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(SavedServerScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        this.addComponent(newServer);
        this.addComponent(loadServer);
    }
}
