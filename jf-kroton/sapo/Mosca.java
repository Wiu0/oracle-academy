import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mosca extends Actor
{
    /**
     * Act - do whatever the Mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(1);
        //Identificar se eu cheguei na borda tela
        if(isAtEdge()){
            turn(75);
        }

    }    
}
