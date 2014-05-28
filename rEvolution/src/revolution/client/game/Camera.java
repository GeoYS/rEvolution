/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.game;

import org.newdawn.slick.geom.Vector2f;

/**
 * A class that hold transformation information for the graphics context
 * so that the right area of the world is drawn.
 * @author GeoYS_2
 */
public interface Camera {
    
    /**
     * Gets the (x,y) position of the camera.
     * @return Vector with translation to apply to the graphics context
     */
    public Translation getTranslation();
    
    /**
     * Gets the rotation of the camera.
     * @return Rotation to apply to the graphics context.
     */
    public Rotation getRotation();
    
    /**
     * Gets the scaling factor (eg. represents zoom) of the camera.
     * @return Scaling factors for x and y to apply to graphics context.
     */
    public Scale getScale();
    
    public class Scale{
        public float xScalingFactor, yScalingFactor;
        public Scale(float sx, float sy){
            this.xScalingFactor = sx;
            this.yScalingFactor = sy;
        }
    }  
    
    public class Translation{
        public float x, y;
        public Translation(float x, float y){
            this.x = x;
            this.y = y;
        }
    }  
    
    public class Rotation{
        public float centreX, centreY, angle;
        public Rotation(float centreX, float centreY, float angle){
            this.angle = angle;
            this.centreX = centreX;
            this.centreY = centreY;
        }
    }
}
