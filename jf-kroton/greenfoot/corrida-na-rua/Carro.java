import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Actor
{
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(Greenfoot.getRandomNumber(10));
        if(isAtEdge()){
            int numero = Greenfoot.getRandomNumber(254);
            numero += 92;
            setLocation(0, numero);
        }
        if(isTouching(Pedestre.class)){
            getWorld().addObject(new GameOver(), getWorld().getWidth()/2,
            getWorld().getHeight()/2);
            //arquivo game-over.mp3 na pasta "sound" do jogo
            Greenfoot.playSound("game-over.mp3");
            Greenfoot.stop();
        }
    }    
}
