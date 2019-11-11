import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends bullet
{
    
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Rocket()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() *4/8;
        int myNewWidth = (int)myImage.getWidth() *4/8;
        myImage.scale(myNewWidth,myNewHeight);
        setRotation(90);
    }
    public void act() 
    {
        moveBullet();
        removeBullet();
    }    
   
}
