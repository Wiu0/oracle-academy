import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    int eneryLevel = 1000;
    int boostEneryLevel = 1000;
    public void act() {
        if(Greenfoot.getRandomNumber(eneryLevel) == 1) {
            addObject(new Energy(), 50, Greenfoot.getRandomNumber(getHeight()));
            eneryLevel += 100;
        }
        if(Greenfoot.getRandomNumber(boostEneryLevel) == 1) {
            addObject(new BoostEnergy(), 50, Greenfoot.getRandomNumber(getHeight()));
            boostEneryLevel += 100;
        }
    }

    private void prepare()
    {

        MotherShip motherShip = new MotherShip();
        addObject(motherShip,104,433);
        MediumEnemy mediumEnemy = new MediumEnemy();
        addObject(mediumEnemy,316,52);
        MediumEnemy mediumEnemy2 = new MediumEnemy();
        addObject(mediumEnemy2,538,173);
        MediumEnemy mediumEnemy3 = new MediumEnemy();
        addObject(mediumEnemy3,153,254);
        StrongEnemy strongEnemy = new StrongEnemy();
        addObject(strongEnemy,1078,209);
        StrongEnemy strongEnemy2 = new StrongEnemy();
        addObject(strongEnemy2,681,379);
        StrongEnemy strongEnemy3 = new StrongEnemy();
        addObject(strongEnemy3,426,502);
        StrongEnemy strongEnemy4 = new StrongEnemy();
        addObject(strongEnemy4,449,266);
        StrongEnemy strongEnemy5 = new StrongEnemy();
        addObject(strongEnemy5,126,610);
        WeakEnemy weakEnemy = new WeakEnemy();
        addObject(weakEnemy,744,109);
        WeakEnemy weakEnemy2 = new WeakEnemy();
        addObject(weakEnemy2,957,411);
        WeakEnemy weakEnemy3 = new WeakEnemy();
        addObject(weakEnemy3,1039,6);
        WeakEnemy weakEnemy4 = new WeakEnemy();
        addObject(weakEnemy4,1014,130);
        Planet planet = new Planet();
        addObject(planet,53,52);
        SideKick sideKick = new SideKick();
        addObject(sideKick,1172,340);
        Hero hero = new Hero();
        addObject(hero,1046,756);
    }
}
