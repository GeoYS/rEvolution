/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.client.game.map;

import org.newdawn.slick.SlickException;
import revolution.game.world.Area.Portion;

/**
 *
 * @author geshe9243
 */
public class PortionMap extends Map{

    public PortionMap(Portion portion, String path, MapParser parser) throws SlickException {
        super(path, parser);
    }
    
}
