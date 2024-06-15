import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    int power = 100;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("Boost: " + power, getWorld().getWidth() - 100, 100);
        move(3);
        if(Greenfoot.isKeyDown("up")) {
            turn(5);
        }
        if(Greenfoot.isKeyDown("down")) {
            turn(-5);
        }
        if(power > 0) {
            if(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("enter")) {
                move(8);
                power--;
            }
        }
        if(isTouching(BoostEnergy.class)) {
            power +=80;
            removeTouching(BoostEnergy.class);
        }
    }
}
