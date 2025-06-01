import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArrowFuel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrowFuel extends Actor
{
    private static final int MAX_TIMER_SECONDS = 240;
    int timer = MAX_TIMER_SECONDS;
    
    public ArrowFuel() {
        getImage().scale(20, 32);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) {
            timer--;
        }
        if(timer-- <= 0) {
            timer = MAX_TIMER_SECONDS;
            turn(-5);
        }
        
    }
}
