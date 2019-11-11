import greenfoot.*; 
import java.awt.Color.*;
import java.awt.Graphics.*;


/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
   public void act()
   {
       Restart();
       GameOverScreen();
    }
   
   public void GameOverScreen()
   {
      setImage(new GreenfootImage ("Game Over", 60, Color.RED, Color.YELLOW ));
      setLocation(600,300);
    }
    
    
    public void Restart (){
    if (Greenfoot.isKeyDown("R")) {
            Greenfoot.setWorld(new MyWorld ());
        }
    }
}
