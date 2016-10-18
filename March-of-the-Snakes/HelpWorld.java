import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpWorld extends World
{

    /**
     * Constructor for objects of class HelpWorld.
     * 
     */
    public HelpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Button("Go Back"), 300, 275 );
        showText( "Use the left and right directional keys to move.", 230, 20);
        showText( "Use the space bar key to shoot bombs at incoming snakes.",
        290, 50);
        showText( "If all snakes are eliminated, you win.", 185, 80);
        showText( "If one of the snakes is at the bottom screen, you lose.",
        265, 110);
        showText( "Good luck!", 70, 140);
    }
    
    public void gotoMenu()
    {
        MenuWorld nextState = new MenuWorld();
        Greenfoot.setWorld( nextState );
    }
}
