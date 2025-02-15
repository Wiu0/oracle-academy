import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private static final byte DEFAULT_LIMIT_COUNT_IMAGE_FRAME = 11;
    private byte countActualSpriteIdle = 0;
    private byte countActualSpriteRun = 0;
    private byte countActualSpriteSlide = 0;
    private String key = null;

    public void act()
    {
        refreshSprite();
    }

    private void refreshSprite() {

       if(Greenfoot.isKeyDown("a")){
            setIdleSpriteRun("a");
        } else if(Greenfoot.isKeyDown("d")){
            setIdleSpriteRun("d");
        } else if(Greenfoot.isKeyDown("w")){
            setIdleSpriteRun("w");
        } else if(Greenfoot.isKeyDown("s")){
            setIdleSpriteRun("s");
        } else if(Greenfoot.isKeyDown("space")){
            setIdleSpriteSlide();
        }  else {
            setIdleSpriteIdle();
        }
    }

    private byte setSprite(String action, byte count) {
        return setSprite(action, count, DEFAULT_LIMIT_COUNT_IMAGE_FRAME); 
    }

    private byte setSprite(String action, byte count, byte limit) {
        setImage(action + ++count + ".png");
        if(count == limit) {
            count = 0;
        }
        return count;
    }

    private void setIdleSpriteRun(String key) {
        countActualSpriteRun = setSprite("run", countActualSpriteRun);
        moveDirection(key);
    }

    private void moveDirection(String key) {
        if(key.equals("d")) {
            move(2);
        } else if(key.equals("a")) {
            move(-2);
        } else if(key.equals("w")) {
            setLocation(getX(), getY() - 2);
        } else if(key.equals("s")) {
            setLocation(getX(), getY() + 2);
        }
    }

    private void setIdleSpriteIdle() {
        if(Greenfoot.getRandomNumber(10) < 6) {
            return;
        }
        countActualSpriteIdle = setSprite("idle", countActualSpriteIdle);
    }   
    
    private void setIdleSpriteSlide() {
        if(Greenfoot.getRandomNumber(10) < 6) {
            return;
        }
        countActualSpriteSlide = setSprite("slide", countActualSpriteSlide, (byte)14);
    }
}