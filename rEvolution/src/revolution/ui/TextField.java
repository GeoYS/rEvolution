/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.ui;

import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.GUIContext;

/**
 *
 * @author Chris
 */
public class TextField extends org.newdawn.slick.gui.TextField{

    public TextField(GUIContext container, Font font, int x, int y, int width, int height, ComponentListener listener) {
        super(container, font, x, y, width, height);
        container.getInput().removeListener(this);
        
    }

}
