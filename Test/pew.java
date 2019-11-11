import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pew here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pew extends Mover
{
    
    /**
     * Act - do whatever the pew wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pew() {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() *4/8;
        int myNewWidth = (int)myImage.getWidth() *4/8;
        myImage.scale(myNewWidth,myNewHeight);
    }
    public void act() 
    {
       projectileMove();
       BossHitpoint();
       setRotation(0);
    }    
    public void projectileMove()
    {
        setLocation(getX(),getY() - 5);
    }
    
    public void BossHitpoint() {
     if(getY() == 0)
     {
         getWorld().removeObject(this);
        }
    
    }

}
