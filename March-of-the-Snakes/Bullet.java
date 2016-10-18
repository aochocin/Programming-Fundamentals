import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends MovableObject
{
    public Bullet()
    {
        speed = 10;
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveUp();
        if ( checkIsOffScreen() || checkCollisionWithPredator() )
        {
            return;
        }
        
    }
    
    public boolean checkIsOffScreen()
    {
        if ( isAtEdge() )
        {
            getWorld().removeObject( this );
            return true;
        }
        return false;
    }
    
    public boolean checkCollisionWithPredator()
    {
        Predator collidePredator =
            (Predator)getOneIntersectingObject(Predator.class);
        if ( collidePredator != null )
        {
            getWorld().removeObject( collidePredator );
            getWorld().removeObject( this );
            return true;
        }
        return false;
    }
}
