/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.server.screen.components;

import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.transition.FadeInTransition;
import revolution.res.ClientImages;
import revolution.server.screen.MainScreen;
import revolution.server.screen.NewServerScreen;
import revolution.ui.Button;
import revolution.ui.ComponentGroup;
import revolution.ui.ScreenManager;

/**
 *
 * @author Chris
 */
public class RunningServerMenu extends ComponentGroup{
    
    private Button stats, stop;

    public RunningServerMenu(GUIContext gc, final ScreenManager sm) {
        super(gc, 0, 0);
        
        stats = new Button(gc,
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 200, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(MainScreen.ID, new EmptyTransition(), new FadeInTransition());
            }
            
        };
        
        stop = new Button(gc,
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 300, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(NewServerScreen.ID, new EmptyTransition(), new FadeInTransition());
            }
            
        };
        this.addComponent(stats);
        this.addComponent(stop);
    }  
}
