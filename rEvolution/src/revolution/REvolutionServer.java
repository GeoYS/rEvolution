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
    static Dimension screen;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException {   
        screen = Toolkit.getDefaultToolkit().getScreenSize();
        AppGameContainer app = new AppGameContainer(new ServerScreenManager());
        app.setDisplayMode(1200, 960, false);
        app.setTargetFrameRate(60);
        app.setShowFPS(false);
        app.setUpdateOnlyWhenVisible(false);
        app.setAlwaysRender(true);
        app.start();
    }
}
