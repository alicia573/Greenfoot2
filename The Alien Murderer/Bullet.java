import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends Mover
{
    boolean gameOver = false;

    public Bullet(){
        getImage().scale(50, 20);
    }

    public void act() 
    {
        if (!gameOver) {
            setLocation(getX() - 50, getY());
            shootBalloons();
            removeBullet();
            shootRobots();
        }
    }  
    
    public void removeBullet() {
        if (getX() < 20) {
            getWorld().removeObject(this);
        }
    }

    public void shootRobots()
    {
        Robot robot = (Robot) getOneIntersectingObject(Robot.class);
        if (robot!= null)  
        {
            World myWorld = getWorld();
           
            getWorld().removeObject(robot);
            ((StartWorld)getWorld()).counter.addScore();
            youWin();
            getWorld().removeObject(this);
            Greenfoot.playSound("Booms2.mp3");

        }
    }

    public void shootBalloons()
    {
        Actor balloon = getOneIntersectingObject(Objects.class);
        if (balloon != null)  
        {
            gameOver = true;
            System.out.println(gameOver);
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);   
        }
    }

    public void youWin()
    {
        if(((StartWorld)getWorld()).counter.score == 6){
            getWorld().addObject(new YouWin(), 600, 300);
        }
    }

}
