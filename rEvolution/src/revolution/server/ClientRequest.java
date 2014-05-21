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
    public String username, password;   
    public ClientRequest(String username, String password){
        this.password = password;
        this.username = username;
    }
}
