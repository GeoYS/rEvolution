/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.game.map;

import java.util.ArrayList;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author geshe9243
 */
public interface MapParser {
    public ArrayList<MapObject> parseMapObjects(TiledMap tiledMap);
}
