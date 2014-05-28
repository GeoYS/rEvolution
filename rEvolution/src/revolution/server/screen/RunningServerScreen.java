/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.server.screen;

import java.io.IOException;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import revolution.server.Server;
import revolution.server.ServerInfo;
import revolution.server.screen.components.MainMenu;
import revolution.server.screen.components.RunningServerMenu;
import revolution.ui.Screen;
import revolution.ui.ScreenManager;

/**
 * Screen to view the information about the gameworld on this server.
 * 
 * @author GeoYS_2
 */
public class RunningServerScreen extends Screen{
    
    public static final int ID = 3;
    
    private RunningServerMenu menu;
    
    private static Server server;
    
    public RunningServerScreen(ScreenManager sm){
        super(sm);
    }
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        try {
            server = new Server(/* port */ 7999);
        } catch (SocketException ex) {
            Logger.getLogger(RunningServerScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RunningServerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.clearListeners(); // if this screen had been previously initialised.
        menu = new RunningServerMenu(this.getScreenManager().getContainer(), this.getScreenManager());
        this.addListener(menu);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.setBackground(Color.blue);
        grphcs.drawString(ServerInfo.currentServer, 100, 100);
        menu.render(gc, grphcs);
        grphcs.drawString("Statistics", menu.STATS_X + 100, menu.STATS_Y);
        grphcs.drawString("Stop", menu.STOP_X + 100, menu.STOP_Y);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        try {
            // update
            server.update(0);
        } catch (IOException ex) {
            Logger.getLogger(RunningServerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        // render
        System.out.println("Server running");
    }

    @Override
    
    public int getID() {
        return ID;
    }
    
}
