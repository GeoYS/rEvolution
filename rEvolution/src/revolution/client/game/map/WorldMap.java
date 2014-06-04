/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.game.map;

import org.newdawn.slick.SlickException;
import revolution.game.world.Area;
import revolution.game.world.World;

/**
 *
 * @author geshe9243
 */
public class WorldMap extends Map{

    public WorldMap(World world, String path, MapParser parser) throws SlickException {
        super(path, parser);
    }
    
    public Area getArea(float x, float y){
        // TODO
        return null;
    }
}
