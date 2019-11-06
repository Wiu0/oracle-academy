import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cobra extends AnimalAleatorio
{
    /**
     * Act - do whatever the Cobra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       mover();
       if(isTouching(Sapo.class)){
           int xMundo = getWorld().getWidth();
           int yMundo = getWorld().getHeight();
           getWorld().showText("GAME OVER", xMundo/2, yMundo/2);
           Greenfoot.stop();
       }
    }    
}
