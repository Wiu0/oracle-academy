import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroides here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroide extends Actor
{
     public void act() {
       move(2);
       if(isAtEdge()){
           turn(75);
       }
       if(isTouching(Foguete.class)){
           getWorld().showText("GAME OVER", 300, 200);
           Greenfoot.stop();
       }
       int numeroAleatorio = Greenfoot.getRandomNumber(10000);
       if(numeroAleatorio >= 9990){ 
           int x = Greenfoot.getRandomNumber(getWorld().getWidth());
           int y = Greenfoot.getRandomNumber(getWorld().getHeight());
           getWorld().addObject(new Asteroide(), x, y);
        }
      
    }    
}
