import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(10);
        setLocation(getX() - 6, getY());
        removeTouching(WeakEnemy.class);
        removeTouching(MediumEnemy.class);
        removeTouching(StrongEnemy.class);
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
