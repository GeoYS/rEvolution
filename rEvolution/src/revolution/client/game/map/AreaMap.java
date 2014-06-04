/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.game.map;

import org.newdawn.slick.SlickException;
import revolution.game.world.Area;

/**
 *
 * @author geshe9243
 */
public class AreaMap extends Map{

    public AreaMap(Area area, String path, MapParser parser) throws SlickException {
        super(path, parser);
    }

    public Area getPortion(float x, float y){
        // TODO
        return null;
    }
}
