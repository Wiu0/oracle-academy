import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bebe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebe extends Actor
{
    /**
     * Act - do whatever the Bebe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(5);
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(360));   
        }
    }
}
