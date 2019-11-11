import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class homingBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class homingBullet extends Actor
{
    int hit = 2;
    
    private int timer = 650;
    /**
     * Act - do whatever the bullet1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    player Player; 
    public homingBullet(player Mainplayer)
    {
        Player = Mainplayer; 
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() *4/8;
        int myNewWidth = (int)myImage.getWidth() *4/8;
        myImage.scale(myNewWidth,myNewHeight);
        setRotation(45);
    }
    public void act() 
    {
        moveBullet();
        turn(10);
        HitBullet();
        timer--;
        if (timer == 0) {
            getWorld().removeObject(this);
        }
        else if (hit == 0){
            getWorld().removeObject(this);
        }
        
    }    
    public void moveBullet()
    {
        move(2); 
        
        turnTowards(Player.getX(),Player.getY());
    }    
    public void HitBullet(){
       Actor projectile = getOneIntersectingObject(pew.class);
       if (projectile !=null)
       {
           getWorld().removeObject(projectile);
           hit--;
        } 
    }
    
}
