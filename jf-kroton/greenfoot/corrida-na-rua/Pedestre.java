import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pedestre extends Actor {
    int ponto = 0;
    boolean fazPontoNaParteCima = true;
    Pontos p = new Pontos();
    
    public void act() {
        mostrarPontos();
        mover();
        somarPonto();
    }    

    void mostrarPontos(){
        GreenfootImage gi = new GreenfootImage(
        "Pontos: " + ponto, 30, Color.WHITE, new Color(0, 0, 0, 0));
        p.setImage(gi);
        getWorld().addObject(p, 740, 430);
    }

    void somarPonto(){
        if(fazPontoNaParteCima){
            if(getY() < 33){
                ponto++;
                fazPontoNaParteCima = false;
            }
        }else{
            if(getY() > 408){
                ponto++;
                fazPontoNaParteCima = true;
            }
        }
    }

    void mover(){
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(3);
        } else if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(3);
        }else if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(3);
        }else if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(3);
        }
    }
}
