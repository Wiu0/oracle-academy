import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hunter extends Actor
{
    /**
     * Act - do whatever the Hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) {
            move(5);    
        }

        if(Greenfoot.isKeyDown("w")) {
            turn(-4);
        }

        if(Greenfoot.isKeyDown("s")) {
            turn(4);
        }

        removeTouching(Borboleta.class);
    }
}
