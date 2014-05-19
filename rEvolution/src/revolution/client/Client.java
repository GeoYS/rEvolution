/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import revolution.net.Socket;
import static revolution.server.Server.GROUP_NAME;
import static revolution.server.Server.GROUP_PORT;
import revolution.ui.ScreenManager;

/**
 *
 * @author Chris
 */
public class Client {
    private Socket socket;
    private ScreenManager screenManager;
    
    public Client(int port) throws UnknownHostException, IOException{
        socket = new Socket(InetAddress.getLocalHost().getHostName(),
            port,
            GROUP_NAME,
            GROUP_PORT);
        screenManager = new ScreenManager();
        // add screens
    }
    
    public void lobby(){
        // checks the socket for server broadcasts
    }
    
    // public void render(){}
    
    public void connect(){
        while(true){
            // connecting
        }
    }
}
