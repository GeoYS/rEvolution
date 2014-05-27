/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.screen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import revolution.client.Client;
import revolution.client.screen.components.LobbyMenu;
import revolution.net.Socket;
import revolution.server.ServerInfo;
import revolution.server.UserData;
import revolution.ui.Screen;
import revolution.ui.ScreenManager;

/**
 *
 * @author Chris
 */
public class LobbyScreen extends Screen{

    public static int ID = 2;
    
    private LobbyMenu menu;
    
    private Client client;
    
    private String conAdd;
    
    private int conPort;
    
    private String out = "add user";
    
    public LobbyScreen(ScreenManager sm) {
        super(sm);
        
        client = Client.session;
    }

    @Override
    public void init(GameContainer gc, final StateBasedGame sbg) throws SlickException {
        this.clearListeners(); // if this screen had been previously initialised.
        menu = new LobbyMenu(this.getScreenManager().getContainer(), this.getScreenManager());
        this.addListener(menu);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.setBackground(Color.darkGray);
        grphcs.drawString("LobbyScreen", 100, 100);
        menu.render(gc, grphcs);      
        grphcs.drawString("Add User", 200, 200);
        grphcs.drawString("(Not Implemented)", 200, 300);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {         
         // consider these loops as update/render loops
         if(!client.isConnected()){
             // receiving server information for lobby
             ArrayList<ServerInfo> servers = null;
             try {
                 servers = client.receiveServerBroadcasts();
             } catch (IOException ex) {
                 Logger.getLogger(LobbyScreen.class.getName()).log(Level.SEVERE, null, ex);
             }
             for(ServerInfo si : servers){
                 System.out.println("Host name: " + si.hostName + " Port: " + si.port);
                 System.out.println("Attempting to connect/log in.");
                 
                 try {
                     // attempt to connect to server
                     client.connect(si.port, si.hostName, "", "", true);
                 } catch (IOException ex) {
                     Logger.getLogger(LobbyScreen.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 try {
                     // if userdata is received, than client has connected
                     client.receiveUserData();
                 } catch (IOException ex) {
                     Logger.getLogger(LobbyScreen.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 if(client.isConnected()){
                     conAdd = si.hostName;
                     conPort = si.port;
                     break;
                 }
             }
         }
         //System.out.println("Connected!");
         if(client.isConnected()){
             if(menu.addUser){
                menu.addUser = false;
             
             // receiving game world data from server
             UserData ud = null;
             try {
                 ud = client.receiveUserData();
             } catch (IOException ex) {
                 Logger.getLogger(LobbyScreen.class.getName()).log(Level.SEVERE, null, ex);
             }
             if(ud != null){
                 System.out.println(ud.message);
             }
             }
         }
         //System.out.println("Disconnected");
    }
    
    @Override
    public int getID() {
        return ID;
    }
    
}
