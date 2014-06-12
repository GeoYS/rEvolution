/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.screen.components;

import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import revolution.client.game.entity.NewCreature;
import revolution.client.screen.LobbyScreen;
import revolution.client.screen.NewCreatureFoodScreen;
import revolution.client.screen.NewCreatureScreen;
import revolution.game.creature.Creature;
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
public class NewCreatureLocationMenu extends ComponentGroup{
    
    private Button connect, exit, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, therteen, forteen;
    
    public final int NEW_X = CSInfo.WIDTH / 10; 
    public final int NEW_Y = 9 * CSInfo.HEIGHT /10;
    public final int EXIT_X = 7 * CSInfo.WIDTH /10;
    public final int EXIT_Y = 9 * CSInfo.HEIGHT /10;
    private final int WIDTH = 64;
    private final int HEIGHT = 32;
    
    public final int ONE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int ONE_Y = 2 * CSInfo.HEIGHT /10;
    public final int TWO_X = (CSInfo.WIDTH / 10) + 300; 
    public final int TWO_Y = 2 * CSInfo.HEIGHT /10;
    public final int THREE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int THREE_Y = 2 * CSInfo.HEIGHT /10;
    public final int ONE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int ONE_Y = 2 * CSInfo.HEIGHT /10;
    public final int TWO_X = (CSInfo.WIDTH / 10) + 300; 
    public final int TWO_Y = 2 * CSInfo.HEIGHT /10;
    public final int THREE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int THREE_Y = 2 * CSInfo.HEIGHT /10;
    public final int ONE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int ONE_Y = 2 * CSInfo.HEIGHT /10;
    public final int TWO_X = (CSInfo.WIDTH / 10) + 300; 
    public final int TWO_Y = 2 * CSInfo.HEIGHT /10;
    public final int THREE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int THREE_Y = 2 * CSInfo.HEIGHT /10;
    public final int ONE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int ONE_Y = 2 * CSInfo.HEIGHT /10;
    public final int TWO_X = (CSInfo.WIDTH / 10) + 300; 
    public final int TWO_Y = 2 * CSInfo.HEIGHT /10;
    public final int THREE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int THREE_Y = 2 * CSInfo.HEIGHT /10;
    public final int TWO_X = (CSInfo.WIDTH / 10) + 300; 
    public final int TWO_Y = 2 * CSInfo.HEIGHT /10;
    public final int THREE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int THREE_Y = 2 * CSInfo.HEIGHT /10;
    
    public static int familyStringth, reproductionRate, minBirthSize, maxBirthSize;

    public NewCreatureLocationMenu(GUIContext gc, final ScreenManager sm) {        
        super(gc, 0, 0);
        connect = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                NEW_X, NEW_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                try{
                    familyStringth = Integer.valueOf(famStrength.getText());
                    reproductionRate = Integer.valueOf(repRate.getText());
                    minBirthSize = Integer.valueOf(minBirth.getText());
                    maxBirthSize = Integer.valueOf(maxBirth.getText());
                } catch(NumberFormatException e){
                    System.out.println("Bad Input");
                }
                
                sm.changeScreen(NewCreatureFoodScreen.ID, new FadeOutTransition(), new FadeInTransition());
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
        one = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                ONE_X, ONE_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        two = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                TWO_X, THREE_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        three = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                THREE_X, THREE_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        three = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                THREE_X, THREE_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        
        this.addComponent(connect);
        this.addComponent(exit);
    }
}
