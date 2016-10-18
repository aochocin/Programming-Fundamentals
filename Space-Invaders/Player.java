import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends MovableObject
{
    int bulletCooldown;
    public Player()
    {
        speed = 2;
        bulletCooldown = 0;
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        if ( Greenfoot.isKeyDown("left") )
        {
            x -= speed;
        }
        else if ( Greenfoot.isKeyDown("right") )
        {
            x += speed;
        }
        
        setLocation( x,y );
        
        if ( Greenfoot.isKeyDown( "space" ) && bulletCooldown == 0 )
        {
            SpaceWorld world = (SpaceWorld)getWorld();
            world.addBullet( x,y );
            bulletCooldown = 50;
        }
        
        if ( bulletCooldown > 0 )
        {
            bulletCooldown--;
        }
    }    
}
