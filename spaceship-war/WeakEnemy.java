import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WeakEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeakEnemy extends Actor
{
    /**
     * Act - do whatever the WeakEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(20) < 1) {
            turn(Greenfoot.getRandomNumber(359));
        }
         
        if(Greenfoot.getRandomNumber(100) < 1) {
            SimpleBullet sb = new SimpleBullet();
            sb.setRotation(getRotation());
            getWorld().addObject(sb, getX(), getY());
        }
    }
}
