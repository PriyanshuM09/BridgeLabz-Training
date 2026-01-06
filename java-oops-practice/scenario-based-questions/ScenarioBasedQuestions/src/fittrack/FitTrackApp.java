package fittrack;

public class FitTrackApp {
    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Priyanshu",
                22,
                70,
                "Weight Loss"
        );

        FitnessTracker tracker = new FitnessTracker(500);

        tracker.startWorkout();

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(20);

        tracker.addWorkout(cardio);
        tracker.addWorkout(strength);

        tracker.stopWorkout();

        tracker.showSummary();
    }
}

