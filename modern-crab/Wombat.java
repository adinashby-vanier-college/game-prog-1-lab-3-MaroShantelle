// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Wombat extends Actor
{

    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        move(7);
        if (Greenfoot.getRandomNumber(5) == 1) {
            turn(Greenfoot.getRandomNumber(20) - 45);
        }
        if (isAtEdge()) {
            turn(80);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
            Greenfoot.playSound("eating.wav");
        }
    }
}
