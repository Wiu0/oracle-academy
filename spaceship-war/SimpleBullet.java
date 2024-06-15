import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SimpleBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleBullet extends Actor
{
    /**
     * Act - do whatever the SimpleBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        if(isTouching(Hero.class) || isTouching(SideKick.class)) {
            removeTouching(Hero.class);
            removeTouching(SideKick.class);
            getWorld().showText("GAME OVER", 600, 400);
            Greenfoot.stop(); 
        }
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
