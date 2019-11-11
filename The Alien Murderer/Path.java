import greenfoot.*; 

public class Path extends Actor
{
    public Path(){
    GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/1;
        int myNewWidth = (int)myImage.getWidth()/1;
        myImage.scale(myNewHeight,myNewWidth);
    }
     
}
