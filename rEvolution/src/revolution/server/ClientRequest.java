/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.server;

/**
 *
 * @author Chris
 */
public class ClientRequest {
    public int port;
    public String hostName, username, password;   
    public ClientRequest(int port, String hostName, String username, String password){
        this.hostName = hostName;
        this.password = password;
        this.port = port;
        this.username = username;
    }
}
