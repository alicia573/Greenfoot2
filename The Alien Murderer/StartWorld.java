import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{
    Counter counter = new Counter();
    Shooter shooter;
    public StartWorld()
    {
        super(1200, 600,1 ); 
        prepare();
        
    }

    public Counter getCounter()
    {
        return counter;
    }
   
    private void prepare()
    {

        Robot robot = new Robot();
        addObject(robot,347,332);
        

        Robot robot2 = new Robot();
        addObject(robot2,248,148);

        Robot robot3 = new Robot();
        addObject(robot3,102,470);

        Robot robot4 = new Robot();
        addObject(robot4,512,79);
        
        Robot robot5 = new Robot();
        addObject(robot5,400,200);
        
        Robot robot6 = new Robot();
        addObject(robot6,600,500);

        BlueBalloon blueBalloon = new BlueBalloon();
        addObject(blueBalloon,356,191);

        BlueBalloon blueBalloon2 = new BlueBalloon();
        addObject(blueBalloon2,512,448);

        YellowBalloon yellowBalloon = new YellowBalloon();
        addObject(yellowBalloon,68,354);

        YellowBalloon yellowBalloon2 = new YellowBalloon();
        addObject(yellowBalloon2,159,137);
        
        
        
        YellowBalloon yellowBalloon4 = new YellowBalloon();
        addObject(yellowBalloon4,400,250);

        RedBalloon redBalloon = new RedBalloon();
        addObject(redBalloon,268,383);

        RedBalloon redBalloon2 = new RedBalloon();
        addObject(redBalloon2,376,58);

        RedBalloon redBalloon3 = new RedBalloon();
        addObject(redBalloon3,644,109);

        RedBalloon redBalloon4 = new RedBalloon();
        addObject(redBalloon4,309,533);

        RedBalloon redBalloon5 = new RedBalloon();
        addObject(redBalloon5,74,81);

        Path path = new Path();
        addObject(path,956,358);
        path.setLocation(980,231);
         
        
        shooter = new Shooter();
        addObject(shooter, 950 , 300);

        //Counter counter = new Counter();
        addObject(counter, 1100, 50);

    }
     
}
