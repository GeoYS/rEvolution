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
    
    private Button connect, exit, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, therteen, fourteen, fifteen, sixteen, seventeen;
    
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
    public final int FOUR_X = (CSInfo.WIDTH / 10) + 300; 
    public final int FOUR_Y = 3 * CSInfo.HEIGHT /10;
    public final int FIVE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int FIVE_Y = 3 * CSInfo.HEIGHT /10;
    public final int SIX_X = (CSInfo.WIDTH / 10) + 300; 
    public final int SIX_Y = 4 * CSInfo.HEIGHT /10;
    public final int SEVEN_X = (CSInfo.WIDTH / 10) + 300; 
    public final int SEVEN_Y = 4 * CSInfo.HEIGHT /10;
    public final int EIGHT_X = (CSInfo.WIDTH / 10) + 300; 
    public final int EIGTH_Y = 5 * CSInfo.HEIGHT /10;
    public final int NINE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int NINE_Y = 5 * CSInfo.HEIGHT /10;
    public final int TEN_X = (CSInfo.WIDTH / 10) + 300; 
    public final int TEN_Y = 6 * CSInfo.HEIGHT /10;
    public final int ELEVEN_X = (CSInfo.WIDTH / 10) + 300; 
    public final int ELEVEN_Y = 6 * CSInfo.HEIGHT /10;
    public final int TWELEVE_X = (CSInfo.WIDTH / 10) + 300; 
    public final int TWELEVE_Y = 7 * CSInfo.HEIGHT /10;
    public final int THERTEEN_X = (CSInfo.WIDTH / 10) + 300; 
    public final int THERTEEN_Y = 7 * CSInfo.HEIGHT /10;
    public final int FOURTEEN_X = (CSInfo.WIDTH / 10) + 300; 
    public final int FOURTEEN_Y = 8 * CSInfo.HEIGHT /10;
    public final int FIFTEEN_X = (CSInfo.WIDTH / 10) + 300; 
    public final int FIFTEEN_Y = 8 * CSInfo.HEIGHT /10;
    public final int SIXTEEN_X = (CSInfo.WIDTH / 10) + 300; 
    public final int SIXTEEN_Y = 9 * CSInfo.HEIGHT /10;
    public final int SEVENTEEN_X = (CSInfo.WIDTH / 10) + 300; 
    public final int SEVENTEEN_Y = 9 * CSInfo.HEIGHT /10;
    
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
                TWO_X, TWO_Y, WIDTH, HEIGHT){
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
        four = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                FOUR_X, FOUR_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        five = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                FIVE_X, FIVE_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        six = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                SIX_X, SIX_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        seven = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                SEVEN_X, SEVEN_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        eight = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                EIGHT_X, EIGTH_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        nine = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                NINE_X, NINE_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        ten = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                TEN_X, TEN_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        eleven = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                ELEVEN_X, ELEVEN_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        twelve = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                TWELEVE_X, TWELEVE_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        therteen = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                THERTEEN_X, THERTEEN_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        fourteen = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                FOURTEEN_X, FOURTEEN_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        fifteen = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                FOURTEEN_X, FOURTEEN_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        sixteen = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                FOURTEEN_X, FOURTEEN_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        seventeen = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                FOURTEEN_X, FOURTEEN_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(NewCreatureScreen.ID, new FadeOutTransition(), new FadeInTransition());
            }
        };
        this.addComponent(connect);
        this.addComponent(exit);
        this.addComponent(one);
        this.addComponent(two);
        this.addComponent(three);
        this.addComponent(four);
        this.addComponent(five);
        this.addComponent(six);
        this.addComponent(seven);
        this.addComponent(eight);
        this.addComponent(nine);
        this.addComponent(ten);
        this.addComponent(eleven);
        this.addComponent(twelve);
        this.addComponent(therteen);
        this.addComponent(fourteen);
        this.addComponent(fifteen);
        this.addComponent(sixteen);
        this.addComponent(seventeen);
    }
}
