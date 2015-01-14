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
public class ClientImages {
    
    // List of image names for later referencing.
    // Make sure they are all unique.
    // Add to this list whenever we add a new image to load.
    public static String SAMPLE_BUTTON_HOVER = "sampleButtonHover"; // example
    public static String SAMPLE_BUTTON_NORMAL = "sampleButtonNormal"; // example
    public static String SAMPLE_BUTTON_PRESSED = "sampleButtonPressed"; // example
    
    private static HashMap<String, Image> images = new HashMap<>();    
    private static Stack<DeferredImage> toLoad = new Stack<>();
    private static double totalImages;
    
    public static Image getImage(String name){
        return images.get(name);
    }
    
    /**
     * Call before calling loadNext.
     * Add images that you need to be loaded here.
     */
    public static void initiateLoading(){
        toLoad.add(new DeferredImage(SAMPLE_BUTTON_HOVER, "res/sampleButtonHover.png")); // example
        toLoad.add(new DeferredImage(SAMPLE_BUTTON_PRESSED, "res/sampleButtonPressed.png")); // example
        toLoad.add(new DeferredImage(SAMPLE_BUTTON_NORMAL, "res/sampleButtonNormal.png")); // example
        totalImages = toLoad.size();
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
}
