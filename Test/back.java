import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends World
{
    GreenfootSound bgMusic = new GreenfootSound("Undertale.mp3");
    healtbar healtbar = new healtbar();
    healthBarPlayer healthBarPlayer =  new healthBarPlayer(); 
    public void started()
    {
        bgMusic.playLoop();
        bgMusic.setVolume(50);
    }

    public void stopped()
    {
        bgMusic.pause();   
    }
    int counterHB = 0;
    int counterB1 = 0;
    int counterB2 = 0;
    int counterB3 = 0;
    int counterNB = 0;
    int counterNB2 = 0;
    int counterNNB = 0;
    int counterNNB2 = 0;

    public player Mainplayer = new player();

    /**
     * Constructor for objects of class back.
     * 
     */
    public back()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
    }

    public healtbar getHealthbar()
    {
        return healtbar;
    }

    public healthBarPlayer getHealthBarPlayer()
    {
        return healthBarPlayer;
    }

    public void act() 
    {
        counterHB++;
        counterB1++;
        counterB3++;
        counterNB++;
        counterNNB++;

        if (counterHB == 540) {
            homingBullet homingBullet = new homingBullet(Mainplayer);
            addObject(homingBullet,50,170);

        
        }
        if (counterHB == 540) {
            homingBullet homingBullet = new homingBullet(Mainplayer);
            addObject(homingBullet,950,170);

        }
        if(counterHB == 601){
            counterHB = 100;
        }
        if (counterB1 == 180) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,230,240);
            bullet2 bullet2 = new bullet2();
            addObject(bullet2,230,240);
            bullet3 bullet3 = new bullet3();
            addObject(bullet3,230,240);

        
        }
        if (counterB1 == 181) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,760,240);
            bullet2 bullet2 = new bullet2();
            addObject(bullet2,760,240);
            bullet3 bullet3 = new bullet3();
            addObject(bullet3,760,240);

            counterB1 = 0;

        }
        if (counterB2 == 22) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,410,200);
        }
        if (counterB2 == 16) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,450,200);
        }
        if (counterB2 == 10) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,490,200);

        }
        if (counterB2 == 16) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,530,200);
        }
        if (counterB2 == 22) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,570,200);

        }
        if (counterB2 == 23) {
            counterB2 = 0;

        }
        if (counterB3 > 2000 && counterB3 < 2800){
            counterB2++;
        }
        else if (counterB3 >3201){
            counterB3 = 300;
        }
        if(counterNB > 950){
            counterNB2++;

        }
        if (counterNB2 == 180) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,230,240);
            CopyOfbullet2 CopyOfbullet2 = new CopyOfbullet2();
            addObject(CopyOfbullet2,230,240);
            bullet3 bullet3 = new bullet3();
            addObject(bullet3,230,240);

        
        }
        if (counterNB2 == 181) {
            bullet1 bullet1 = new bullet1();
            addObject(bullet1,760,240);
            bullet2 bullet2 = new bullet2();
            addObject(bullet2,760,240);
            CopyOfbullet3 CopyOfbullet3 = new CopyOfbullet3();
            addObject(CopyOfbullet3,760,240);

            counterNB2 = 0;

        }
        if (counterNNB > 2800){
            counterNNB2++;
        }
        if (counterNNB2 == 320){
            Rocket Rocket = new Rocket();
            addObject(Rocket,263,170);
        }
        if (counterNNB2 == 300){
            Rocket2 Rocket2 = new Rocket2();
            addObject(Rocket2,263,170);
        }
        if (counterNNB2 == 340){
            Rocket3 Rocket3 = new Rocket3();
            addObject(Rocket3,263,170);

        }
        if (counterNNB2 == 320){
            Rocket Rocket = new Rocket();
            addObject(Rocket,724,170);
        }
        if (counterNNB2 == 300){
            Rocket2 Rocket2 = new Rocket2();
            addObject(Rocket2,724,170);
        }
        if (counterNNB2 == 340){
            Rocket3 Rocket3 = new Rocket3();
            addObject(Rocket3,724,170);

        }
        if (counterNNB2 == 341){
            counterNNB2 = 0;
        }

    }

    
    private void prepare()
    {
        player player = new player();
        addObject(Mainplayer,490,680);
        player.setLocation(480,614);
        removeObject(player);

        boss boss = new boss();
        addObject(boss,456,79);
        boss.setLocation(490,79);
        boss.setLocation(486,90);
        removeObject(boss);
        BossModel bossModel = new BossModel();
        addObject(bossModel,504,224);
        bossModel.setLocation(494,218);
        addObject(boss,494,46);
        bossModel.setLocation(496,216);
        //healtbar healtbar = new healtbar();
        addObject(healtbar,496,14);
        bossModel.setLocation(496,116);
        addObject(healthBarPlayer, 60, 685);
        intro intro = new intro();
        addObject(intro, 530, 450);
        Name name = new Name();
        addObject(name, 90, 665);

    }
}
