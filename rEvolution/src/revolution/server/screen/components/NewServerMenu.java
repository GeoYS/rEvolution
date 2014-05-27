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
import revolution.server.screen.RunningServerScreen;
import revolution.ui.Button;
import revolution.ui.ComponentGroup;
import revolution.ui.ScreenManager;
import revolution.ui.TextField;
import revolution.ui.TypeFace;

/**
 *
 * @author Chris
 */
public class NewServerMenu extends ComponentGroup{
    
    private Button start, back;
    
    private TextField txt;
    
    public NewServerMenu(GUIContext gc, final ScreenManager sm) {
        super(gc, 0, 0);
        
        start = new Button(gc,
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 200, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(RunningServerScreen.ID, new EmptyTransition(), new FadeInTransition());
            }
            
        };
        
        back = new Button(gc,
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 300, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(MainScreen.ID, new EmptyTransition(), new FadeInTransition());
            }
            
        };

        txt = new TextField(gc, TypeFace.uni(TypeFace.ARIAL, TypeFace.BOLD, 40) , 100, 400, 150, 50);
        this.addComponent(txt);
        this.addComponent(start);
        this.addComponent(back);
    }    
}
