import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Planet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planet extends Actor
{
    /**
     * Act - do whatever the Planet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Hero.class)) {
            getWorld().showText("NEXT LEVEL", getWorld().getWidth()/2, getWorld().getHeight()/2);
        }
    }
}
