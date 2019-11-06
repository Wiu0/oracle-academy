import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Sapo feita para estudo
 * 
 * @author wiu
 * @version 1.0
 */
public class Sapo extends Actor
{
    /**
     * Act - do whatever the Sapo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(1);
        //Capturar evento do teclado
        if(Greenfoot.isKeyDown("up")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("down")){
            turn(5);
        }
        removeTouching(Mosca.class);
    }    
}
