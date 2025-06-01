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
        super(1000, 200, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bebe bebe = new Bebe();
        addObject(bebe,474,0);
        Bebe bebe2 = new Bebe();
        addObject(bebe2,273,200);
        Bomba bomba = new Bomba();
        addObject(bomba,16,78);
        Castle castle = new Castle();
        addObject(castle,966,94);
        Et et = new Et();
        addObject(et,684,174);
        Animal animal = new Animal();
        addObject(animal,754,166);
        et.setLocation(756,12);
    }
}
