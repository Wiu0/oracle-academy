// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Borboleta extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * 
     */
    public void act()
    {
        move(5);
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(120));
        }
    }
}
