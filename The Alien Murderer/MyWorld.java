import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {
        super(1200, 600, 1); 
        prepare();  
    }

    public void act()
    {
       if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new StartWorld ());
        }
        
    }

    private void prepare()
    {
        Menu menu = new Menu();
        addObject(menu,600,300);
    }
    
}
