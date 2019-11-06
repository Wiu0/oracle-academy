import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Energia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Energia extends Actor
{
    /**
     * Act - do whatever the Energia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(2);
       if(isAtEdge()){
           turn(75);
       }
    }    
}
