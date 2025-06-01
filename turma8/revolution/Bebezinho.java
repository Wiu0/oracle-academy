import greenfoot.*;  

public class Bebezinho extends Actor {
    
    public void act() {
        move(Greenfoot.getRandomNumber(10));
        if(isAtEdge()) { 
            turn(Greenfoot.getRandomNumber(200));
        }
        if(isTouching(Bomba.class)) {
            Greenfoot.stop();
        }
    }
}