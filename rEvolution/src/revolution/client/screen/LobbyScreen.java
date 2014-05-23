/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.screen;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.BlobbyTransition;
import org.newdawn.slick.state.transition.CombinedTransition;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.state.transition.RotateTransition;
import org.newdawn.slick.state.transition.VerticalSplitTransition;
import revolution.res.ClientImages;
import revolution.ui.Button;
import revolution.ui.Screen;
import revolution.ui.ScreenManager;

/**
 *
 * @author Chris
 */
public class LobbyScreen extends Screen{

    public static int ID = 2;
    
    private Button back1, back2;
    
    public LobbyScreen(ScreenManager sm) {
        super(sm);
    }
    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void init(GameContainer gc, final StateBasedGame sbg) throws SlickException {
        this.clearComponents();
        back1 = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 200, 64, 32){
            @Override
            public void onClick() {
                getScreenManager().changeScreen(MainMenuScreen.ID,
                        new EmptyTransition(),
                        new RotateTransition());
            }
        };
        back2 = new Button(gc, 
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                100, 300, 64, 32){
            @Override
            public void onClick() {
                getScreenManager().changeScreen(MainMenuScreen.ID,
                        new EmptyTransition(),
                        new VerticalSplitTransition());
            }
        };
        this.addComponent(back1);
        this.addComponent(back2);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.setBackground(Color.darkGray);
        grphcs.drawString("This is the lobby screen", 100, 100);
        back1.render(gc, grphcs);
        back2.render(gc, grphcs);        
        grphcs.drawString("Rotate out Transition", 200, 200);
        grphcs.drawString("Vertical Split Transition", 200, 300);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
    }
    
}
