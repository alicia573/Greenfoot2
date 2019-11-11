import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    
    int score = 0;
    int max = 5;
    
    public Counter() {
        setImage(new GreenfootImage("Score:  " + score, 24, Color.BLUE, Color.BLACK));
    }
    
    public void addScore()
    {
        score ++;
                setImage(new GreenfootImage("Score:  " + score, 24, Color.BLUE, Color.BLACK));

        
    }
    
}

