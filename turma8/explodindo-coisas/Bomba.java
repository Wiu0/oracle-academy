import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Actor
{
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("space")){
            move(5); 
        }

        if(Greenfoot.isKeyDown("enter")) {
            move(9);
        }    
        if(Greenfoot.isKeyDown("w")) {
            turn(-5);
        }       
        if(Greenfoot.isKeyDown("s")) {
            turn(5);
        }
        if(Greenfoot.isKeyDown("b")) {
            Greenfoot.stop();
        }
    }
}
