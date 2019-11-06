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
        super(800, 600, 1);
        Foguete.energia = 0;
        //Criando variavel para guardar a instancia
        Asteroide ast = new Asteroide();
        addObject(ast, 500, 100);
        //Instanciando no metodo
        addObject(new Asteroide(), 100, 100);
        addObject(new Foguete(), 50, 200);
        addObject(new Energia(), 600, 400);
        addObject(new Player(), 0, 0);
    }
}
