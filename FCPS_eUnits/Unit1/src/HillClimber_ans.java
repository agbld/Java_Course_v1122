
public class HillClimber_ans extends Climber{

    public HillClimber(){
    
    }
    
    public HillClimber(int x){
      super(x);
    }
    
    public void climbUpRight()
    {
         turnLeft();
         move();
         turnRight();
         move();
         move();
    }
    public void climbUpLeft()
    {
         turnRight();
         move();
         turnLeft();
         move();
         move();
    }
    public void climbDownRight()
    {
         move();
         move();
         turnRight();
         move();
         turnLeft();
    }
    public void climbDownLeft()
    {
         move();
         move();
         turnLeft();
         move();
         turnRight();
    }
}
