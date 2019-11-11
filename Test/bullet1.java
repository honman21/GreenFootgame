import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet1 extends bullet
{
    
    /**
     * Act - do whatever the bullet1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public bullet1()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() *6/8;
        int myNewWidth = (int)myImage.getWidth() *6/8;
        myImage.scale(myNewWidth,myNewHeight);
        setRotation(90);
    }
    public void act() 
    {
        moveBullet();
        removeBullet();
    }    
   
}
