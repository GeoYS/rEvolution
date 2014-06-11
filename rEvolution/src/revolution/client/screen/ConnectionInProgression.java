/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.screen;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.transition.FadeInTransition;
import revolution.client.Client;
import revolution.game.creature.Creature;
import revolution.ui.Screen;
import revolution.ui.ScreenManager;
import revolution.util.CSInfo;

/**
 *
 * @author Christopher Stokes
 */
public class ConnectionInProgression extends Screen{

    public static final int ID = 4;
    private static String userName, password; 
    private static boolean newUser; // whether or not new user or lgging in
    private static Creature creature;
    
    public ConnectionInProgression(ScreenManager sm) {
        super(sm);
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.drawString("Attempting to log in/ creating new user...", CSInfo.WIDTH / 2 - 50, CSInfo.HEIGHT / 2 - 5);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        // send connection request
        try {
            Client.session.connect(Client.session.getPort(),
                    Client.session.getHostName(),
                    userName,
                    password,
                    creature,
                    newUser);
                    } catch (IOException ex) {
            Logger.getLogger(ConnectionInProgression.class.getName()).log(Level.SEVERE, null, ex);
        }
        // check if server sent confirmation back
        try {
            Client.session.receiveUserData();
        } catch (IOException ex) {
            Logger.getLogger(ConnectionInProgression.class.getName()).log(Level.SEVERE, null, ex);
        }
        // if session is connected
        if(Client.session.isConnected()){
            super.getScreenManager().changeScreen(0, // change to main game screen!
                    new EmptyTransition(), new FadeInTransition());
        }
    }

    @Override
    public int getID() {
        return ID;
    }
    
    public static void setLogin(String userName, String password, Creature creature, boolean newUser){
        ConnectionInProgression.userName = userName;
        ConnectionInProgression.password = password;
        ConnectionInProgression.creature = creature;
        ConnectionInProgression.newUser = newUser;
    }
}
