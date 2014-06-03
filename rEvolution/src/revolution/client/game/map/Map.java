/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.game.map;

import java.util.ArrayList;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 * A map that will be drawn using Tiled. Can either be the map of the 
 * world overview, or zoomed in, where creatures can be controlled.
 * @author GeoYS_2
 */
public class Map extends TiledMap{
    private final ArrayList<MapObject> mapObjects;
    public Map(String path, MapParser parser) throws SlickException{
        super(path);
        mapObjects = parser.parseMapObjects((TiledMap)this);
    }
    public ArrayList<MapObject> getMapObjects(){
        return mapObjects;
    }
}
