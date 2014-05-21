/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.ui;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.gui.MouseOverArea;

/**
 * A simple definition of a GUI (click-able) button 
 * that can be added to a screen and rendered.
 * Be careful of overlapping buttons.
 * @author geshe9243
 */
public abstract class Button extends MouseOverArea{
    
    private boolean isHovering = false, isPressed = false;
    
    public Button(GUIContext gc, Image normal,
            Image pressed, Image hover,
            Shape shape){
        super(gc, normal, shape);
        this.setMouseDownImage(pressed);
        this.setMouseOverImage(hover);
    }
    
    public Button(GUIContext gc, Image normal,
            Image pressed, Image hover, int x, int y, int width, int height){
        super(gc, normal, x, y, width, height);
        this.setMouseDownImage(pressed);
        this.setMouseOverImage(hover);
    }

    @Override
    public void mouseClicked(int button, int x, int y, int clickCount) {
        super.mouseClicked(button, x, y, clickCount);
        onClick();
    }
    
    public abstract void onClick();
}
