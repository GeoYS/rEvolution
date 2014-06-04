/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.client.game.map;

import java.util.HashMap;

/**
 *
 * @author geshe9243
 */
public class MapObject {
    private HashMap<String, String> properties;
    public MapObject(){
        properties = new HashMap<>();
    }
    public void addProperties(String propertyName, String propertyValue){
        properties.put(propertyName, propertyValue);
    }
    public String getProperty(String propertyName){
        return properties.get(propertyName);
    }
}
