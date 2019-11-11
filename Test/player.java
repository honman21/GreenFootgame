import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    int counter = 0;
    int playerHp = 5;
    //GreenfootSound bgMusic = new GreenfootSound("Undertale.mp3");
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public player() {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() *1/8;
        int myNewWidth = (int)myImage.getWidth() *1/8;
        myImage.scale(myNewWidth,myNewHeight);
    }
    
    public void act() 
    {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("W"))y-=4;
        if(Greenfoot.isKeyDown("S"))y+=4;
        if(Greenfoot.isKeyDown("A"))x-=4;
        if(Greenfoot.isKeyDown("D"))x+=4;
        setLocation(x, y);
        
        if (Greenfoot.isKeyDown("space")){
            fire();
        }
        HitByBullet(); 
        YouLose();
    }    
    //bullet
    private void fire(){
        counter++;
        if(counter == 20){
        pew pew = new pew();
        getWorld().addObject(pew,getX(),getY());
        pew.setRotation(270);
        pew.move(20);
        counter=0;
    }
    }
    public void HitByBullet()
    {
     Actor bullet = getOneIntersectingObject(homingBullet.class);
     if (bullet !=null){
     getWorld().removeObject(bullet);
     playerHp--; 
     ((back)getWorld()).healthBarPlayer.loseHealthPlayer();
    }
    Actor bullet1 = getOneIntersectingObject(bullet1.class);
     if (bullet1 !=null){
     getWorld().removeObject(bullet1);
     playerHp--; 
     ((back)getWorld()).healthBarPlayer.loseHealthPlayer();
    }
    Actor bullet2 = getOneIntersectingObject(bullet2.class);
     if (bullet2 !=null){
     getWorld().removeObject(bullet2);
     playerHp--; 
     ((back)getWorld()).healthBarPlayer.loseHealthPlayer();
    }
    Actor bullet3 = getOneIntersectingObject(bullet3.class);
     if (bullet3 !=null){
     getWorld().removeObject(bullet3);
     playerHp--; 
     ((back)getWorld()).healthBarPlayer.loseHealthPlayer();
    }
     Actor CopyOfbullet3 = getOneIntersectingObject(CopyOfbullet3.class);
     if (CopyOfbullet3 !=null){
     getWorld().removeObject(CopyOfbullet3);
     playerHp--; 
     ((back)getWorld()).healthBarPlayer.loseHealthPlayer();
    }
     Actor CopyOfbullet2 = getOneIntersectingObject(CopyOfbullet2.class);
     if (CopyOfbullet2 !=null){
     getWorld().removeObject(CopyOfbullet2);
     playerHp--; 
     ((back)getWorld()).healthBarPlayer.loseHealthPlayer();
    }
    Actor BossModel = getOneIntersectingObject(BossModel.class);
     if (BossModel !=null){
     getWorld().removeObject(CopyOfbullet2);
     playerHp--; 
     ((back)getWorld()).healthBarPlayer.loseHealthPlayer();
    }
    
    }
    public void YouLose()
    {
        if(playerHp == 0){
        Greenfoot.stop();
       getWorld().addObject(new YouLose(),500,400);
       
    }
    }
}
