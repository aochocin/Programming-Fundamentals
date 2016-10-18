import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Invader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Invader extends MovableObject
{
    private boolean movingLeft;
    
    public Invader()
    {
        movingLeft = true;
        speed = 1;
    }
    
    /**
     * Act - do whatever the Invader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        if ( isAtEdge() )
        {
            movingLeft = !movingLeft;
            y += 50;
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
            SpaceWorld world = (SpaceWorld)getWorld();
            world.youLose();
        }
        setLocation( x,y );
    }    
}
