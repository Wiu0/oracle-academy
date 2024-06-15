import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SideKick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SideKick extends Actor
{
    int power = 200;
    /**
     * Act - do whatever the SideKick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("Power: " + power * 100/200, getWorld().getWidth() - 100, 50);

        if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 3);
        }

        if(power > 0) {
            if(Greenfoot.isKeyDown("p")) {
                Egg sb = new Egg();
                sb.setRotation(180);
                getWorld().addObject(sb, getX(), getY());
                power--;
            }
        }
        
        if(isTouching(Energy.class)) {
            power +=160;
            removeTouching(Energy.class);
        }

    }
}
