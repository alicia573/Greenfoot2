import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Enemies
{
    public Robot()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewHeight,myNewWidth);
    }

    public void act() 
    {
        move(1);
        if(Greenfoot.getRandomNumber(100) < 6)
        {
            turn(Greenfoot.getRandomNumber(180));
        }
        // Add your action code here.
    }   

    public void reset()
    {

    }
}
