import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoostEnergy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoostEnergy extends Actor
{
    /**
     * Act - do whatever the BoostEnergy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(-10);
        setLocation(getX() + 2, getY());
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
