/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.server;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Chris
 */
public class User implements Serializable{
    public int port;
    public String userName, password;
    public String hostName;
    public String pathToXML = null;

    public User(String pathToXML){
        this.pathToXML = pathToXML;
    }

    public User(int port, String hostName, String password){
        this.port = port;
        this.hostName = hostName;
        this.password = password;
    }

    public void setPort(int port){            
        this.port = port;
    }

    public void setHostName(String hostName){
        this.hostName = hostName;            
    }

    public void load(){
        // load from XML file
    }

    public void save(){
        // save to a XML file
    }   
}
