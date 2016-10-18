import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuWorld extends World
{

    /**
     * Constructor for objects of class MenuWorld.
     * 
     */
    public MenuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(new Button("Play"), 300, 125 );
        addObject(new Button("Help"), 300, 250 );
    }
    
     public void gotoHelp()
    {
        HelpWorld nextState = new HelpWorld();
        Greenfoot.setWorld( nextState );
    }
    
    public void gotoGame()
    {
        PlayWorld nextState = new PlayWorld();
        Greenfoot.setWorld( nextState );
    }
}
