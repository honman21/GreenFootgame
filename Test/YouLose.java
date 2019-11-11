import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouLose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouLose extends Actor
{
    public YouLose()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() *12/8;
        int myNewWidth = (int)myImage.getWidth() *10/8;
        myImage.scale(myNewWidth,myNewHeight);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
