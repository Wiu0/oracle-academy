import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MotherShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MotherShip extends Actor
{
    /**
     * Act - do whatever the MotherShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        for(int i = 0; i < Greenfoot.getRandomNumber(9); i++) {
            if(Greenfoot.getRandomNumber(70) < 1) {
                Power sb = new Power();
                sb.setRotation(90 + Greenfoot.getRandomNumber(270));
                getWorld().addObject(sb, getX(), getY());
            }            
        }
    }
}
