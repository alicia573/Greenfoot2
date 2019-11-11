
import greenfoot.*; 

public class Shooter extends Actor
{
    Bullet bullet = new Bullet();
    int frame = 0;
    int momentOfShot = -100;
    int timeBetweenShots = 10;

    public Shooter(){
        getImage().scale(200, 200);
    }

    public void act() 
    {
        frame++;
        shootBalloons();
        move();
        if (Greenfoot.isKeyDown("space"))
        {
            fire();          
        }
    }

    public void move(){
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("up"))y-= 2;
        if(Greenfoot.isKeyDown("down"))y+=2;
        setLocation(x,y);
    }

    public void fire()
    {
        
        if (frame - momentOfShot > timeBetweenShots) {
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, 950, getY() - 55);
        }
        momentOfShot = frame;
    }
    
    public void shootBalloons()
    {
        Actor blueballoon  = getOneIntersectingObject(BlueBalloon.class);
        Actor redballoon = getOneIntersectingObject(RedBalloon.class);
        Actor yellowballoon = getOneIntersectingObject(YellowBalloon.class);
        if (blueballoon != null)  
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);     
        }
        if (redballoon != null)  
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);     
        }
        if (yellowballoon != null)  
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);     
        }

    }
}
