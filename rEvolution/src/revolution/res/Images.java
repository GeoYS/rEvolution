/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.res;

import java.util.HashMap;
import java.util.Stack;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author GeoYS_2
 */
public class Images {
    
    // List of image names for later referencing.
    // Add to this list whenever we add a new image to load.
    public static String IMAGE_NAME = "myImage"; // example
    
    private static HashMap<String, Image> images = new HashMap<>();    
    private static Stack<DeferredImage> toLoad = new Stack<>();
    private static double totalImages;
    
    public static Image getImage(String name){
        return images.get(name);
    }
    
    /**
     * Call before calling loadNext.
     */
    public static void initiateLoading(){
        toLoad.add(new DeferredImage("myImage", "../myImage.png")); // example
        totalImages = 1;
    }
    
    /**
     * Loads next image.
     * @return whether or not all images have been loaded
     * @throws SlickException 
     */
    public static boolean loadNext() throws SlickException{
        DeferredImage img = toLoad.pop();
        images.put(img.name, img.load());
        return toLoad.isEmpty();
    }
    
    /**
     * 
     * @return percent of the images that are loaded.
     */
    public static double percentDone(){
        return (toLoad.size() - totalImages) / totalImages;
    }
    
    private static class DeferredImage{
        public String name, path;
        public DeferredImage(String name, String path){
            this.name = name;
            this.path = path;
        }
        public Image load() throws SlickException{
            return new Image(path);
        }
    }
}