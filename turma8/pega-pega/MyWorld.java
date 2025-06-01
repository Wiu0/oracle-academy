import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Borboleta borboleta = new Borboleta();
        addObject(borboleta,59,33);
        Borboleta borboleta2 = new Borboleta();
        addObject(borboleta2,53,355);
        Borboleta borboleta3 = new Borboleta();
        addObject(borboleta3,489,354);
        Borboleta borboleta4 = new Borboleta();
        addObject(borboleta4,504,48);
        Hunter hunter = new Hunter();
        addObject(hunter,52,206);
    }
}
