/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.server;

import revolution.net.Socket;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Chris
 */
public class Server {
    public static final int GROUP_PORT = 9899;
    public static final String GROUP_NAME = "235.2.2.2";
    
    private ArrayList<User> users = new ArrayList<>();
    private HashMap<String,User> accounts = new HashMap();
    
    private Socket socket;
    
    public Server(int port) throws UnknownHostException, SocketException, IOException{
        socket = new Socket(InetAddress.getLocalHost().getHostName(),
                port,
                GROUP_NAME,
                GROUP_PORT);
    }
    
    public Server(String pathToXML) throws UnknownHostException, SocketException, IOException{
        // when server is started from a saved session/game
    }
    
    public void update(long delta){
        receive();
        sendWorldInfo();
        sendInvitationBroadcast();
    }
    
    // public Info getInfo()
    // Returns information about the gameworld so that the Screen can output 
    // appropriate information
    
    public void receive(){
        // recieves object from socket
        // decide what to do based on the type of the object
    }
    
    public void sendWorldInfo(){
        // send to each address already connect info on the world
    }
    
    public void sendInvitationBroadcast(){
        // send lobby broadcast
    }
    
    public void saveToXML(){
        // should be called when server shuts down
        // save everything to xml
    }  
}


