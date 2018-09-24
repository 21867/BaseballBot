import kareltherobot.*;
/**
 * Write a description of class Pinsetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseballBot extends UrRobot
{
    /**
     * Constructor for objects of class Pinsetter
     */
    public BaseballBot(int st, int ave, Direction dir, int beeps)
    {
        super (1,6, North, 0);
    }
    
    public void clearDiamond()
    {
        move();
        clearUp();
        nextUp();
        clearDown();
        nextDown();
        clearUp();
        nextUp();
        clearDown();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
        
    }
    public void upStair()
    {
        move();
        turnRight();
        move();
        turnLeft();
        
        
    }   
    public void downStair()
    {
        move();
        turnLeft();
        move();
        turnRight();
        
        
    }
    public void nextUp()
    {
        move();
        turnLeft();
        move();
        
        
    }
    public void nextDown()
    {
        move();
        turnRight();
        move();
        
        
    }
    public void clearUp()
    {
        pickBeeper();
        upStair();
        pickBeeper();
        upStair();
        pickBeeper();
        upStair();
        pickBeeper();
        
    }
    public void clearDown()
    {
        pickBeeper();
        downStair();
        pickBeeper();
        downStair();
        pickBeeper();
        downStair();
        pickBeeper();
        
    }
}
