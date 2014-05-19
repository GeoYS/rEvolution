/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import revolution.server.screen.ServerScreenManager;

/**
 *
 * @author GeoYS_2
 */
public class REvolutionServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException {    
        AppGameContainer app = new AppGameContainer(new ServerScreenManager());
        app.setDisplayMode(640, 640, false);
        app.setTargetFrameRate(40);
        app.setUpdateOnlyWhenVisible(false);
        app.setAlwaysRender(true);
        app.start();
    }
}
