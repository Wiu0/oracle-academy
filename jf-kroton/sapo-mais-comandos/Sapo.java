import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Sapo feita para estudo
 * 
 * @author wiu
 * @version 1.0
 */
public class Sapo extends Actor {
    int pontos = 0;
    boolean jaTemCobra = false;
    int speed = 1;

    public void act() {
        // Add your action code here.
        getWorld().showText("Pontos: " + pontos, 450, 25);
        move(speed);
        //Capturar evento do teclado
        controleTeclado();
        tocandoMosca();
        adicionarCobra();
        soltarPoder();
    }

    void controleTeclado(){
        if(Greenfoot.isKeyDown("up")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("down")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("space")){
            speed = 5;
        }else{
            speed = 1;
        }
    }

    void tocandoMosca(){
        if(isTouching(Mosca.class)){
            pontos++;
            int x = Greenfoot.getRandomNumber(700);
            int y = Greenfoot.getRandomNumber(500);
            getWorld().addObject(new Mosca(), x, y);
        }
        removeTouching(Mosca.class);
    }

    void adicionarCobra(){
        if(pontos == 1 && !jaTemCobra){
            int x = Greenfoot.getRandomNumber(700);
            int y = Greenfoot.getRandomNumber(500);
            getWorld().addObject(new Cobra(), x, y);
            jaTemCobra = true;
        }
    }

    void soltarPoder(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
            if(mouse.getButton() == 1){
                Poder p = new Poder();
                p.setRotation(getRotation());
                getWorld().addObject(p, getX(), getY());
            }
        }

    }

}
