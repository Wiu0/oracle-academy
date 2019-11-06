import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static GreenfootSound gs;
    public MyWorld() {    
                
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        addObject(new Pedestre(), 400, 420);
        addObject(new Carro(), 0, 225);
        addObject(new Carro(), 0, 100);
        gs = new GreenfootSound("playing.mp3");
        gs.playLoop();
        //Greenfoot.playSound("playing.mp3");
        
    }
}
