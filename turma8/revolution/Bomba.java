import greenfoot.*;  
public class Bomba extends Actor
{
    public void act()
    {
         if(Greenfoot.isKeyDown("w")) {
             turn(-4);
         }
         
         if(Greenfoot.isKeyDown("s")) {
             turn(4);
         }
         
         if(Greenfoot.isKeyDown("space")) {
             move(5);
         }
         
         if(Greenfoot.isKeyDown("enter")) {
             move(10);
         }
         
         if(Greenfoot.isKeyDown("b")) {
             if(isTouching(Castle.class)) {
                 Greenfoot.stop();
             }
             
         }
    }
}
