/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client;

import revolution.client.screen.ClientScreenManager;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import revolution.net.ObjectPacket;
import revolution.net.Socket;
import revolution.server.ClientRequest;
import static revolution.server.Server.GROUP_NAME;
import static revolution.server.Server.GROUP_PORT;
import revolution.server.ServerInfo;
import revolution.server.UserData;
import revolution.ui.ScreenManager;
import revolution.util.Stopwatch;

/**
 *
 * @author Chris
 */
public class Client {
    
    public static Client session;
    private static final long RECEIVE_BROADCAST_TIMEOUT = 500,
            CONNECTION_TIMEOUT = 10000; // milliseconds
    
    private Socket socket;
    private boolean connected = false, disconnected = false;
    private Stopwatch lastData = new Stopwatch(), connectionStart = new Stopwatch();
    
    public Client(int port) throws UnknownHostException, IOException{
        socket = new Socket(InetAddress.getLocalHost().getHostName(),
            port,
            GROUP_NAME,
            GROUP_PORT);
        lastData.start();
    }
    
    /**
     * Receives any broadcasts that are sent out for 0.5 seconds.
     * @return ArrayList of all ServerInfo's it receives
     */
    public ArrayList<ServerInfo> receiveServerBroadcasts() throws IOException{
        long last = System.currentTimeMillis();
        ArrayList<ServerInfo> servers = new ArrayList<>();
        do{
            Object o = socket.receiveMulticast();
            if(o instanceof ServerInfo){
                servers.add((ServerInfo)o);
            }
        }while(last - System.currentTimeMillis() < RECEIVE_BROADCAST_TIMEOUT);
        return servers;
    }
    
    /**
     * Receive data about the user and the gameworld, so that the client 
     * can output appropriately.
     * @return
     * @throws IOException 
     */
    public UserData receiveUserData() throws IOException{
        ObjectPacket o = socket.receive();
        if(o == null){
            return null;
        }
        if(o.object instanceof UserData){
            connected = true;
            lastData.restart();
            return (UserData) o.object;
        }
        return null;
    }
    
    /**
     * Whether or not this client is connected to a server (ie. currently in
     * a game). Connection is inferred to be connected by receiving a 
     * UserData packet; it is inferred to be disconnected if 
     * @return 
     */
    public boolean isConnected(){    
        if(connected && lastData.time() >= Client.CONNECTION_TIMEOUT){
            disconnected = true;
        }
        return connected && lastData.time() < Client.CONNECTION_TIMEOUT;
    }
    
    /**
     * Whether or not this client has disconnected from a server.
     * Returns true only if at some point it was connected, and is
     * now disconnected.
     * @return 
     */
    public boolean isDisconnected(){
        return disconnected;
    }
    
    /**
     * Sends a request to specified server to join that game.
     * Returns whether or not it sent the request (false being a timeout).
     * @param port
     * @param hostName
     * @param username
     * @param password
     * @throws IOException 
     * @return requestSent
     */
    public boolean connect(int port, String hostName, String username, String password) throws IOException{
        if(connectionStart.isRunning()){
            if(connectionStart.time() > CONNECTION_TIMEOUT){
                connectionStart.stop();
                return false;
            }
        }
        else{
            connectionStart.start();
        }
        socket.send(
                new ClientRequest(
                    username,
                    password),
                hostName,
                port);
        return true;
    }
    
    /**
     * Reset all connection related variables.
     */
    public void reset(){        
        connected = false;
        disconnected = false;
        lastData = new Stopwatch();
        lastData.start();
        connectionStart = new Stopwatch();
    }
}