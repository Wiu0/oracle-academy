import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    boolean initialized = false;
    private int scrollAmount = 2; // Adjust for scroll speed
    private int scrollPosition = 0;
    private GreenfootImage backgroundImage;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 646, 1); 
        backgroundImage = new GreenfootImage("backg.jpg");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pilot pilot = new Pilot();
        addObject(pilot,65,167);
        ViolentBird violentBird = new ViolentBird();
        addObject(violentBird,1000,297);
        violentBird.setLocation(1000,291);
        ViolentBird violentBird2 = new ViolentBird();
        addObject(violentBird2,1000,28);
        ViolentBird violentBird3 = new ViolentBird();
        addObject(violentBird3,1000,532);
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,201,605);
        Fuel fuel = new Fuel();
        addObject(fuel,50,517);
        fuel.setLocation(57,522);
        ArrowFuel arrowFuel = new ArrowFuel();
        addObject(arrowFuel,53,520);
    }
    
    public void act() {
        if(!initialized) {
            GreenfootSound gs = new GreenfootSound("airplane_prop.mp3");
            //gs.playLoop();
            initialized = true;
        }
        
        scrollPosition = (scrollPosition + scrollAmount) % backgroundImage.getWidth();
        GreenfootImage bg = getBackground();
        bg.clear();

        // Draw the background image at the new position
        bg.drawImage(backgroundImage, scrollPosition, 0);

        // Draw the background image again to create a continuous scroll
        if (scrollPosition < backgroundImage.getWidth()) {
            bg.drawImage(backgroundImage, scrollPosition - backgroundImage.getWidth(), 0);
        }
    }
}
