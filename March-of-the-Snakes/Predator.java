import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Predator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Predator extends MovableObject
{
    private boolean movingLeft;
    
    public Predator()
    {
        movingLeft = true;
        speed = 4;
    }
    
    /**
     * Act - do whatever the Predator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        if ( isAtEdge() )
        {
            movingLeft = !movingLeft;
            y += 20;
            setRotation( getRotation() + 180 );
        }
        
        if ( movingLeft )
        {
            x += speed;
        }
        else
        {
            x -= speed;
        }
        if ( y > getWorld().getHeight() - 50 )
        {
            PlayWorld world = (PlayWorld)getWorld();
            world.youLose();
            Greenfoot.stop();
        }
        setLocation( x,y );
    }    
}
