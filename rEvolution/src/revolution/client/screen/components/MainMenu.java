/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.screen.components;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.GUIContext;
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
        Image buttonImage = Images.getImage(Images.IMAGE_NAME);
        this.addComponent(new Button(context, 
                buttonImage,
                buttonImage,
                buttonImage,
                100, 300, buttonImage.getWidth(), buttonImage.getHeight()){
            @Override
            public void onClick() {
                sm.changeScreen(MainMenuScreen.ID, null, new HorizontalSplitTransition());
            }
        });
    }
}
