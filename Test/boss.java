import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss extends Actor
{
    int BossHp = 175;
    int counter = 0;
    /**
     * Act - do whatever the boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        HitPew();
        YouWin();
        //damageHit();
    }    
     public void HitPew(){
       Actor projectile = getOneIntersectingObject(pew.class);
       Actor damagePic = getOneIntersectingObject(damgePic.class);
       if (projectile !=null)
       {
           getWorld().removeObject(projectile);
           BossHp--;
           //getWorld().addObject(new damgePic(),600,400);
           counter++;
           //World world = getWorld();
           //back back = new back(); 
           //healtbar healtbar = back.getHealthbar();
           //healtbar.loseHealth();
           //healtbar.update();
           ((back)getWorld()).healtbar.loseHealth();
           
        } 
        
         
        
    }
    public void YouWin()
    {
        if (BossHp == 0){
            Greenfoot.stop();
       getWorld().addObject(new YouWin(),500,450);
        }
    }
}
