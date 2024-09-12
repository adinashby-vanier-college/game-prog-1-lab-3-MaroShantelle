// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * 
     */
    public Ladybug()
    {
    }

    /**
     * Act - do whatever the Ladybug wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        scale(13, 4);
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        move(6);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (isAtEdge()) {
            turn(90);
        }
    }

    /**
     * 
     */
    public void scale(int x, int y)
    {
        int width = x;
        int heigth = y;
    }
}
