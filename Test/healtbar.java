import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healtbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healtbar extends Actor
{
    int health = 175;
    int healthBarWidth = 700;
    int healthBarHeight = 20;
    int pixelsPerHealthPoint = healthBarWidth / health;
    public healtbar()
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
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1,health*pixelsPerHealthPoint ,healthBarHeight);
        
    }
    public void loseHealth()
    {
        health--;
    }
}
