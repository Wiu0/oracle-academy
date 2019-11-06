import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AnimalAleatorio extends Actor
{
    public void act() {
    }
    
    public void mover(){
        int numero = Greenfoot.getRandomNumber(10);
        move(numero);
        //Identificar se eu cheguei na borda tela
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(360));
        }
    }
}