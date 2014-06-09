/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.game;

import java.util.ArrayList;
import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.geom.Vector2f;
import revolution.client.game.entity.Entity;

/**
 *
 * @author geshe9243
 */
public class EntitySelector implements MouseListener{
    private Entity selected = null;
    private ArrayList<Entity> entities;
    private boolean isDragging;
    
    public EntitySelector(ArrayList<Entity> entities){
        this.entities = entities;
        isDragging = false;
    }
    
    public Entity getSelected(){
        return selected;
    }

    @Override
    public void mouseWheelMoved(int i) {
    }

    @Override
    public void mouseClicked(int i, int i1, int i2, int i3) {
    }

    @Override
    public void mousePressed(int i, int i1, int i2) {
    }

    @Override
    public void mouseReleased(int i, int i1, int i2) {
        if(isDragging){
            isDragging = false;
        }
        else{
            selected = null;
            for(Entity e : entities){
                if(e.getX() >= i && i <= e.getX() + e.getWidth() &&
                        e.getY() >= i1 && i1 <= e.getY() + e.getHeight()){
                    selected = e;
                    return;
                }
            }
        }
    }

    @Override
    public void mouseMoved(int i, int i1, int i2, int i3) {
    }

    @Override
    public void mouseDragged(int i, int i1, int i2, int i3) {
        isDragging = new Vector2f(i, i1).distanceSquared(new Vector2f(i2, i3)) > 9;
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
