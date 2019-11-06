import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poder extends Actor
{
    /**
     * Act - do whatever the Poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move(6);
        if(isAtEdge()){//verifica se objeto está nos limites da tela
            getWorld().removeObject(this);//remove o próprio objeto
            return;
        }
        if(isTouching(Asteroide.class)){
            removeTouching(Asteroide.class);
            Foguete.energia +=50;
            int x = Greenfoot.getRandomNumber(getWorld().getWidth());
            int y = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Asteroide(), x, y);
        }
    }    
}
