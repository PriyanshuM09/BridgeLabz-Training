package fittrack;

public abstract class Workout {

    public String type;
    public int duration; 
    protected double caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories();

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

