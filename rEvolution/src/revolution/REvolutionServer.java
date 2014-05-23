/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution;

import java.awt.Dimension;
import java.awt.Toolkit;
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
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        AppGameContainer app = new AppGameContainer(new ServerScreenManager());
        app.setDisplayMode((int) screen.getWidth(), (int) screen.getHeight(), true);
        app.setTargetFrameRate(60);
        app.setShowFPS(false);
        app.setUpdateOnlyWhenVisible(false);
        app.setAlwaysRender(true);
        app.start();
    }
}
