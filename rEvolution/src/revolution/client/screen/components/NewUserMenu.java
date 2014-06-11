/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.screen.components;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import revolution.client.Client;
import revolution.client.screen.ConnectionInProgression;
import revolution.client.screen.LobbyScreen;
import revolution.res.ClientImages;
import revolution.server.ServerFactory;
import revolution.server.screen.MainScreen;
import revolution.server.screen.RunningServerScreen;
import revolution.server.screen.components.NewServerMenu;
import revolution.ui.Button;
import revolution.ui.ComponentGroup;
import revolution.ui.ScreenManager;
import revolution.ui.TextField;
import revolution.ui.TypeFace;
import revolution.util.CSInfo;
import revolution.util.SSInfo;

/**
 *
 * @author Christopher Stokes
 */
public class NewUserMenu extends ComponentGroup{
    private Button add, btn2;
    public boolean addUser = false;
    private Button submit, back;
    
    private TextField userName, password;
    
    public String serverName;
    
    public final int START_X = CSInfo.WIDTH / 10; 
    public final int START_Y = 9 * CSInfo.HEIGHT /10;
    public final int BACK_X = 4 * CSInfo.WIDTH /10;
    public final int BACK_Y = 9 * CSInfo.HEIGHT /10;
    public final int USER_X = (CSInfo.WIDTH / 10) + 200; 
    public final int USER_Y = 2 * CSInfo.HEIGHT /10;
    public final int PASS_X = (CSInfo.WIDTH / 10) + 200; 
    public final int PASS_Y = 3 * CSInfo.HEIGHT /10;
    private final int WIDTH = 64;
    private final int HEIGHT = 32;
    private final int TXT_WIDTH = 250;
    private final int TXT_HEIGHT = 30;
    
    public NewUserMenu(GUIContext gc, final ScreenManager sm) {
        super(gc, 0, 0);
        
        submit = new Button(gc,
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                START_X, START_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                //ConnectionInProgression.setLogin(userName.getText(), password.getText(), true);
                //sm.changeScreen(ConnectionInProgression.ID, new EmptyTransition(), new FadeInTransition());
            }
            
        };
        
        back = new Button(gc,
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                BACK_X, BACK_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(MainScreen.ID, new EmptyTransition(), new FadeInTransition());
            }
            
        };

        userName = new TextField(gc, TypeFace.uni(TypeFace.ARIAL, TypeFace.BOLD, 25) , USER_X, USER_Y, TXT_WIDTH, TXT_HEIGHT);
        password = new TextField(gc, TypeFace.uni(TypeFace.ARIAL, TypeFace.BOLD, 25) , PASS_X, PASS_Y, TXT_WIDTH, TXT_HEIGHT);
        this.addComponent(userName);
        this.addComponent(password);
        this.addComponent(submit);
        this.addComponent(back);
    }    
}
