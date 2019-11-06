import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    String nome = "";
    public void act() 
    {
        // Add your action code here.
        if(nome.equals("")){
            iniciarPergunta();
        }
    }   

    void iniciarPergunta(){
        nome = Greenfoot.ask("Informe seu apelido");
        getWorld().showText("Player " + nome , 400, 10);
    }
}
