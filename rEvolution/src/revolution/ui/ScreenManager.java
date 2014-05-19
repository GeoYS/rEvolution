/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.ui;

import java.util.HashMap;

/**
 *
 * @author Chris
 */
public class ScreenManager {
    private HashMap<Integer,Screen> screens;
    private Screen currentScreen;
    public ScreenManager(){
        screens = new HashMap();
    }
    public void addScreen(Screen s){
        screens.put(s.getID(), s);
        currentScreen = s;
    }
    public void changeScreen(int id){
        currentScreen = screens.get(id);
    }
    public void render(){
        currentScreen.render();
    }
    public void update(){
        currentScreen.update();
    }
}
