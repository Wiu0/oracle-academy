import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MediumEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumEnemy extends Actor
{
    /**
     * Act - do whatever the MediumEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(20) < 2) {
            turn(Greenfoot.getRandomNumber(359));
        }
        move(Greenfoot.getRandomNumber(11));

        if(Greenfoot.getRandomNumber(80) < 1) {
            SimpleBullet sb = new SimpleBullet();
            sb.setRotation(getRotation());
            getWorld().addObject(sb, getX(), getY());
        }
    }
}
