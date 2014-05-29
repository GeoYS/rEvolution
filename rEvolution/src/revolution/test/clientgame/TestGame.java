/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolution.test.clientgame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import revolution.client.game.Camera;
import revolution.client.game.entity.EntityManager;

/**
 *
 * @author GeoYS_2
 */
public class TestGame extends BasicGame{

    private EntityManager entityManager;
    private TestCamera cam;
    
    public TestGame(){
        super("TestGame");
    }
    
    @Override
    public void init(GameContainer gc) throws SlickException {
        entityManager = new EntityManager();
        for(int i = 0; i < 10; i ++){
            entityManager.addEntity(
                    new TestEntity(90 + 10 * (float)Math.random(),
                        90 + 10 * (float)Math.random()));
        }
        cam = new TestCamera(gc, 0, 0);
        gc.getInput().addMouseListener(cam);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        entityManager.update(i);
    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
        cam.applyTranslation(grphcs);
        cam.applyZoom(grphcs);
        entityManager.render(grphcs, cam);
        grphcs.drawOval(-5, -5, 10, 10); // origin
        grphcs.resetTransform();
        
        //cross hair
        grphcs.drawRect(gc.getWidth() / 2 - 10,
                gc.getHeight() / 2 - 10,
                20, 20);
        grphcs.drawOval(gc.getWidth() / 2 - 1, gc.getHeight() / 2 - 1,
                2, 2);
        grphcs.drawString(-cam.getX() + " " + -cam.getY(), gc.getWidth() / 2 + 20, gc.getHeight() / 2 - 10);
    }
    
    public static void main (String[] args) throws SlickException{
        AppGameContainer app = new AppGameContainer(new TestGame());
        app.setMinimumLogicUpdateInterval(16);
        app.setTargetFrameRate(60);
        app.start();
    }
}