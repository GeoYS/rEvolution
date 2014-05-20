/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.UnknownHostException;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import revolution.client.Client;

/**
 *
 * @author chsto9228
 */
public class REvolutionClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException, IOException{
        int port = 1000;
        while(!available(port)){
            port ++;
        }
        AppGameContainer app = new AppGameContainer(new Client(port).getScreenManager());
        app.setDisplayMode(640, 640, false);
        app.setTargetFrameRate(40);
        app.setUpdateOnlyWhenVisible(false);
        app.setAlwaysRender(true);
        app.start();
    }
    
    // from Apache camel project
    public static boolean available(int port) {
        if (port < 0 || port > 9999) {
            throw new IllegalArgumentException("Invalid start port: " + port);
        }

        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(port);
            ds.setReuseAddress(true);
            return true;
        } catch (IOException e) {
        } finally {
            if (ds != null) {
                ds.close();
            }
        }

        return false;
    }
}
