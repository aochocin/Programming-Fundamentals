import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends World
{
    private int score;
    private Player player;
    /**
     * Constructor for objects of class SpaceWorld.
     * 
     */
    public SpaceWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        showText( "Score: "+score, getWidth()-60, getHeight()-30 );
        
        // Create player
        player = new Player();
        player.setRotation( -90 );
        addObject( player, getWidth() / 2, getHeight() - 100 );
        
        // Create a series of invaders
        for ( int y = 1; y < 3; y++ )
        {
            for ( int x = 1; x < 6; x++ )
            {
                addObject ( new Invader(), x * 100, y * 100 );
            }
        }
    }
    
    public void act()
    {
        int invaderCount = getObjects(Invader.class).size();
        showText ( "Invaders: "+invaderCount, 100, getHeight()-30 );
        
        if ( invaderCount == 0)
        {
            youWin();
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
}
    
