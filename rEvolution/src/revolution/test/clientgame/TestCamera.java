/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.test.clientgame;

import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.geom.Vector2f;
import revolution.client.game.Camera;

/**
 *
 * @author GeoYS_2
 */
public class TestCamera implements MouseListener, Camera{

    private float x, y, 
            sx, sy;
    
    public TestCamera(float x,float y){
        this.x = x;
        this.y = y;
        this.sx = this.sy = 1;
    }
    
    @Override
    public Translation getTranslation() {
        return new Translation(x,y);
    }

    @Override
    public Rotation getRotation() {
        return new Rotation(0,0,0);
    }

    @Override
    public Scale getScale() {
        return new Scale(sy, sx);
    }

    @Override
    public void mouseWheelMoved(int i) {
        System.out.println("Mouse wheel moved: " + i);
        sx = sy = sx + (float) i / 360;
    }

    @Override
    public void mouseClicked(int i, int i1, int i2, int i3) {
    }

    @Override
    public void mousePressed(int i, int i1, int i2) {
    }

    @Override
    public void mouseReleased(int i, int i1, int i2) {
    }

    @Override
    public void mouseMoved(int i, int i1, int i2, int i3) {
    }

    @Override
    public void mouseDragged(int i, int i1, int i2, int i3) {
        int deltaX = i2 - i, deltaY = i3 - i1;
        x += deltaX;
        y += deltaY;
    }

    @Override
    public void setInput(Input input) {
    }

    @Override
    public boolean isAcceptingInput() {
        return true; // always accepting
    }

    @Override
    public void inputEnded() {
    }

    @Override
    public void inputStarted() {
    }
    
}
