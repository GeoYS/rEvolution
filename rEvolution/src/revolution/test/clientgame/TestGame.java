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
        cam = new TestCamera(0, 0);
        gc.getInput().addMouseListener(cam);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        entityManager.update(i);
    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
        grphcs.translate(cam.getTranslation().x, cam.getTranslation().y);
        grphcs.scale(cam.getScale().xScalingFactor, cam.getScale().yScalingFactor);
        entityManager.render(grphcs, cam);
        grphcs.drawOval(0, 0, 10, 10);
        grphcs.resetTransform();
        
    }
    
    public static void main (String[] args) throws SlickException{
        AppGameContainer app = new AppGameContainer(new TestGame());
        app.setMinimumLogicUpdateInterval(16);
        app.setTargetFrameRate(60);
        app.start();
    }
}
