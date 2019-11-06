import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Foguete extends Actor {
    public static int energia = 0;
    
    public void act() {
        getWorld().showText("Energia: " + energia, 720, 580);
        mover();
        soltarPoder();
        pegarEnergia();
    }    
    
    void pegarEnergia(){
        if(isTouching(Energia.class)){
            energia += 100;// é o mesmo que energia = energia + 10;
            removeTouching(Energia.class);
        }
    }
    
    void soltarPoder(){
        if(Greenfoot.isKeyDown("space") && energia > 0){
            Poder p = new Poder();
            p.setRotation(getRotation());
            getWorld().addObject(p, getX(), getY());
            energia--;//energia -= 1; energia = energia - 1; 
        }
    }

    void mover() {
        move(4);
        if(Greenfoot.isKeyDown("up")){
            turn(-5);
        }else if(Greenfoot.isKeyDown("down")){
            turn(5);
        }
    }
}
