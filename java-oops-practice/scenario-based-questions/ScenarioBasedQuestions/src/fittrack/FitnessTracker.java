package fittrack;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker implements ITrackable {

    private List<Workout> workoutLogs; 
    private double dailyTarget;

    public FitnessTracker(double dailyTarget) {
        this.dailyTarget = dailyTarget;
        workoutLogs = new ArrayList<>();
    }

    public void addWorkout(Workout workout) {
        workout.calculateCalories();
        workoutLogs.add(workout);
    }

    @Override
    public void startWorkout() {
        System.out.println("Workout started...");
    }

    @Override
    public void stopWorkout() {
        System.out.println("Workout stopped.");
    }

    public double calculateProgress() {
        double totalBurned = 0;
        for (Workout w : workoutLogs) {
            totalBurned += w.getCaloriesBurned();
        }
        return dailyTarget - totalBurned; 
    }

    public void showSummary() {
        System.out.println("Daily Target: " + dailyTarget);
        System.out.println("Remaining Calories: " + calculateProgress());
    }
}

