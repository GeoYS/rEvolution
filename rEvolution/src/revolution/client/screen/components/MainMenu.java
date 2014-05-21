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
import org.newdawn.slick.state.transition.HorizontalSplitTransition;
import revolution.client.screen.MainMenuScreen;
import revolution.res.Images;
import revolution.ui.Button;
import revolution.ui.ComponentGroup;
import revolution.ui.ScreenManager;

/**
 *
 * @author geshe9243
 */
public class MainMenu extends ComponentGroup{
    public MainMenu(GUIContext context, final ScreenManager sm){
        super(context, 0, 0);
        this.addComponent(new Button(context, 
                Images.getImage(Images.SAMPLE_BUTTON_NORMAL),
                Images.getImage(Images.SAMPLE_BUTTON_HOVER),
                Images.getImage(Images.SAMPLE_BUTTON_PRESSED),
                100, 300, 64, 32){
            @Override
            public void onClick() {
                sm.changeScreen(MainMenuScreen.ID, new EmptyTransition(), new HorizontalSplitTransition());
            }
        });
    }
}
