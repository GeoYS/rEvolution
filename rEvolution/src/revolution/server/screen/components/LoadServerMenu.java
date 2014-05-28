/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.server.screen.components;

import java.util.ArrayList;
import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.transition.FadeInTransition;
import revolution.res.ClientImages;
import revolution.server.ServerInfo;
import revolution.server.screen.MainScreen;
import revolution.ui.Button;
import revolution.ui.ComponentGroup;
import revolution.ui.ScreenManager;
import revolution.util.SSInfo;

/**
 *
 * @author Chris
 */
public class LoadServerMenu extends ComponentGroup{
    private Button btn1, back;
    
    private ArrayList<Button> lists = new ArrayList<>();

    public final int START_X = SSInfo.WIDTH / 10; 
    public final int START_Y = 9 * SSInfo.HEIGHT /10;
    public final int BACK_X = 4 * SSInfo.WIDTH /10;
    public final int BACK_Y = 9 * SSInfo.HEIGHT /10;
    private final int WIDTH = 64;
    private final int HEIGHT = 32;
    
    private int place;
    
    public LoadServerMenu(GUIContext gc, final ScreenManager sm) {
        super(gc, 0, 0);
        
        btn1 = new Button(gc,
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                START_X, START_Y, WIDTH, HEIGHT){
            @Override
            public void onClick() {
                sm.changeScreen(MainScreen.ID, new EmptyTransition(), new FadeInTransition());
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
        
        for(int i = 0; i < 4; i++){
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
        }
        
        
        
        this.addComponent(btn1);
        this.addComponent(back);
    }
    
    public void createList(GUIContext gc, final ScreenManager sm, int size){
        for(int i = 0; i < lists.size(); i++){
        this.removeComponent(lists.get(i));
        }
        lists.clear();
        for(int i = 0; i < size; i++){
            place = i;
            lists.add(new Button(gc,
                    ClientImages.getImage(ClientImages.SAMPLE_BUTTON_NORMAL),
                    ClientImages.getImage(ClientImages.SAMPLE_BUTTON_HOVER),
                    ClientImages.getImage(ClientImages.SAMPLE_BUTTON_PRESSED),
                    200, (200 + (place * 100)), WIDTH, HEIGHT){
                @Override
                public void onClick() {
                    System.out.println("Button number : " + place);
                };
                }
            );
            this.addComponent(lists.get(place));
        }
        System.out.println("out");
    }
}
