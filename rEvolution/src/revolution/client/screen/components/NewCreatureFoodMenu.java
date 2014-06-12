/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.screen.components;

import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import revolution.client.screen.LobbyScreen;
import revolution.client.screen.NewCreatureScreen;
import revolution.res.ClientImages;
import revolution.ui.Button;
import revolution.ui.ComponentGroup;
import revolution.ui.ScreenManager;
import revolution.ui.TextField;
import revolution.ui.TypeFace;
import revolution.util.CSInfo;

/**
 *
 * @author Chris
 */
public class NewCreatureFoodMenu extends ComponentGroup{
    
    private Button connect, exit;
    
    private TextField height, length, weight, frequency, meat, veg;
    
    public final int NEW_X = CSInfo.WIDTH / 10; 
    public final int NEW_Y = 9 * CSInfo.HEIGHT /10;
    public final int EXIT_X = 7 * CSInfo.WIDTH /10;
    public final int EXIT_Y = 9 * CSInfo.HEIGHT /10;
    private final int WIDTH = 64;
    private final int HEIGHT = 32;
    
    public final int FAM_STRENGHT_X = (CSInfo.WIDTH / 10) + 300; 
    public final int FAM_STRENGHT_Y = 2 * CSInfo.HEIGHT /10;
    public final int REP_RATE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int REP_RATE_Y = 3 * CSInfo.HEIGHT /10;
    public final int MIN_BIRTH_X = (CSInfo.WIDTH / 10) + 300; 
    public final int MIN_BIRTH_Y = 4 * CSInfo.HEIGHT /10;
    public final int MAX_BIRTH_X = (CSInfo.WIDTH / 10) + 300; 
    public final int MAX_BIRTH_Y = 5 * CSInfo.HEIGHT /10;
    private final int TXT_WIDTH = 250;
    private final int TXT_HEIGHT = 30;

    public NewCreatureFoodMenu(GUIContext gc, final ScreenManager sm) {        
        super(gc, 0, 0);
        connect = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                NEW_X, NEW_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(LobbyScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        exit = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                EXIT_X, EXIT_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
//        height = new TextField(gc, TypeFace.uni(TypeFace.ARIAL, TypeFace.BOLD, 25) , FAM_STRENGHT_X, FAM_STRENGHT_Y, TXT_WIDTH, TXT_HEIGHT);
//        length = new TextField(gc, TypeFace.uni(TypeFace.ARIAL, TypeFace.BOLD, 25) , REP_RATE_X, REP_RATE_Y, TXT_WIDTH, TXT_HEIGHT);
//        weight = new TextField(gc, TypeFace.uni(TypeFace.ARIAL, TypeFace.BOLD, 25) , MIN_BIRTH_X, MIN_BIRTH_Y, TXT_WIDTH, TXT_HEIGHT);
//        frequency = new TextField(gc, TypeFace.uni(TypeFace.ARIAL, TypeFace.BOLD, 25) , MAX_BIRTH_X, MAX_BIRTH_Y, TXT_WIDTH, TXT_HEIGHT);
//        this.addComponent(height);
//        this.addComponent(length);
//        this.addComponent(weight);
//        this.addComponent(frequency);
        this.addComponent(connect);
        this.addComponent(exit);
    }
}
