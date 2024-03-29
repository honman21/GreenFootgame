import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthBarPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthBarPlayer extends Actor
{
    int health = 5;
    int healthBarWidth = 100;
    int healthBarHeight = 10;
    int pixelsPerHealthPoint = healthBarWidth / health;
    public healthBarPlayer()
    {
        update();
        
    }
    public void act() 
    {
        update();
        
    }
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2,healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0,0,healthBarWidth + 1,healthBarHeight +1);
        myImage.setColor(Color.YELLOW);
        myImage.fillRect(1,1,health*pixelsPerHealthPoint ,healthBarHeight);
        
        
    }
    public void loseHealthPlayer()
    {
        health--;
    }  
}
