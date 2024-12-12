public class StepTracker{
    public int minSteps;
    public int aDays;
    public int Days;
    public int Steps;
    
    public StepTracker(int s){
        minSteps = s;
    }
    
    // StepTracker tr = new Steptracker(5000);
    
    addDailySteps(int steps){
        Steps += steps;
        if(steps >= minSteps){
            aDays++;
            Days++;
        }
        else{
            Days++;
        }
    }
    
    public int activeDays(){
        return aDays;
    }
    
    public double averageSteps(){
        double aSteps = (double)Steps/Days;
        return aSteps;
    }
}