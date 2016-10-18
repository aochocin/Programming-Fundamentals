import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayWorld extends World
{
    private int score;
    private Player player;
    
    /**
     * Constructor for objects of class PlayWorld.
     * 
     */
    public PlayWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        showText( "Score: "+score, getWidth()-60, getHeight()-30 );
        
        // Create player
        player = new Player();
        player.setRotation( -90 );
        addObject( player, getWidth() / 2, getHeight() - 60 );
        
        // Create a series of invaders
        for ( int y = 1; y < 10; y++ )
        {
            for ( int x = 1; x < 20; x++ )
            {
                addObject ( new Predator(), x * 50, y * 50 );
            }
        }
    }
    
    public void act()
    {
        int predatorCount = getObjects(Predator.class).size();
        showText ( "Predator: "+predatorCount, 100, getHeight()-30 );
        
        if ( predatorCount == 0)
        {
            youWin();
            Greenfoot.stop();
        }
    }
    
    public void youWin()
    {
        showText ( "You win!", getWidth() / 2, getHeight() / 2 );
    }
    
    public void youLose()
    {
        showText ( "You lose!", getWidth() / 2, getHeight() / 2 );
    }
    
    public void addBullet( int x, int y )
    {
        addObject( new Bullet(), x, y );
    }
    
    public void gotoMenu()
    {
        MenuWorld nextState = new MenuWorld();
        Greenfoot.setWorld( nextState );
    }
}
