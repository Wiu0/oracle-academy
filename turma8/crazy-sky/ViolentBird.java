import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ViolentBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ViolentBird extends Enemy
{
    private static final int MAX_TIMER_SECONDS = 120;
    GreenfootSound gs;
    int timer = MAX_TIMER_SECONDS;
    
    public ViolentBird() {
        gs = new GreenfootSound("eagle3.mp3");
    }

    public void act()
    {
        move(-4);
        if(isAtEdge() || Greenfoot.getRandomNumber(100) < 5) {
            turn(Greenfoot.getRandomNumber(280) - 140);
        }
        
        if(timer-- == 0) {
            //gs.play();
            timer = MAX_TIMER_SECONDS + Greenfoot.getRandomNumber(240);
        }
    }
}
