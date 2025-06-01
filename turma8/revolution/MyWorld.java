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
        super(1100, 250, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bebezinho bebezinho = new Bebezinho();
        addObject(bebezinho,524,0);
        Bebezinho bebezinho2 = new Bebezinho();
        addObject(bebezinho2,319,250);
        Bomba bomba = new Bomba();
        addObject(bomba,40,115);
        Castle castle = new Castle();
        addObject(castle,1055,108);
        Etzinho etzinho = new Etzinho();
        addObject(etzinho,813,22);
        Animal animal = new Animal();
        addObject(animal,701,220);
    }
}
