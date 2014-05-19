/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.ui;

/**
 *
 * @author Chris
 */
public abstract class Screen {
    private ScreenManager screenManager;
    public Screen(ScreenManager sm){
        this.screenManager = sm;
    }
    public void changeScreen(int id){
        this.screenManager.changeScreen(id);
    }
    public abstract void init();
    public abstract void render(/*Graphics g*/);
    public abstract void update();
    public abstract int getID();
}
