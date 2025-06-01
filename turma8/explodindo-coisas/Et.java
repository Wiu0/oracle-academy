import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Et here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Et extends Actor
{
    /**
     * Act - do whatever the Et wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(Greenfoot.getRandomNumber(20));
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }
}
