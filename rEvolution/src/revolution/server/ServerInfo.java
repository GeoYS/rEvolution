/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.server;

import java.io.Serializable;

/**
 * Information that the server broadcasts. Clients receive this
 * information for their lobbies.
 * @author GeoYS_2
 */
public class ServerInfo implements Serializable{
    public String hostName;
    public int port;
    public ServerInfo(String hostName, int port){
        this.hostName = hostName;
        this.port = port;
    }
}
