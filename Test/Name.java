import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Name here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Name extends Actor
{
    public Name()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() *3/10;
        int myNewWidth = (int)myImage.getWidth() *3/10;
        myImage.scale(myNewWidth,myNewHeight);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
