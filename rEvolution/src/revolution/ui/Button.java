/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.ui;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.geom.Shape;

/**
 * A simple definition of a GUI (click-able) button 
 * that can be added to a screen and rendered.
 * Be careful
 * @author geshe9243
 */
public abstract class Button implements MouseListener{
    
    private boolean isHovering = false, isPressed = false;
    
    public abstract Shape getButtonShape();
    public abstract void onHoverOn();
    public abstract void onHoverOff();
    public abstract void onPressed();
    public abstract void onRelease();
    public abstract void onClick();
    public abstract void render(Graphics g);
    public abstract void update(long delta);

    @Override
    public void mouseWheelMoved(int i) {
    }

    @Override
    public void mouseClicked(int button, int x, int y, int numClicks) {
        if(this.isHovering && button == Input.MOUSE_LEFT_BUTTON){
            this.onClick();
        }
    }

    @Override
    public void mousePressed(int i, int i1, int i2) {
        if(this.isHovering){
            if(!this.isPressed){
                this.onPressed();
                this.isPressed = true;
            }
        }
        if(!this.isHovering){
            if(this.isPressed){
                this.onRelease();
                this.isPressed = false;
            }
        }
    }

    @Override
    public void mouseReleased(int i, int i1, int i2) {
    }

    @Override
    public void mouseMoved(int i, int i1, int i2, int i3) {
        if(this.getButtonShape().contains(i2, i3)){
            if(!this.isHovering){
                this.onHoverOn();
                this.isHovering = true;
            }
        }
        else{
            if(this.isHovering){
                this.onHoverOff();
                this.isHovering = false;
            }
        }
    }

    @Override
    public void mouseDragged(int i, int i1, int i2, int i3) {
    }

    @Override
    public void setInput(Input input) {
    }

    @Override
    public boolean isAcceptingInput() {
        return true;
    }

    @Override
    public void inputEnded() {
    }

    @Override
    public void inputStarted() {
    }
    
}
