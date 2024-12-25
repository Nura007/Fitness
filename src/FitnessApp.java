import java.util.Scanner;

public class FitnessApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Fitness Tracker App!");

        // Create a user
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        User user = new User(userName, userAge);
        System.out.println("User created: " + user);

        // Create a workout plan
        System.ogit clone https://github.com/NUra007/FitnessTracker.git
        ut.print("Enter the name of your workout plan: ");
        String workoutName = scanner.nextLine();

        System.out.print("Enter the duration of the workout (in minutes): ");
        int workoutDuration = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the difficulty level (Beginner, Intermediate, Advanced): ");
        String difficulty = scanner.nextLine();

        WorkoutPlan workoutPlan = new WorkoutPlan(workoutName, workoutDuration, difficulty);
        System.out.println("Workout Plan created: " + workoutPlan);

        // Summary
        System.out.println("\n=== Summary ===");
        System.out.println("User Details: " + user);
        System.out.println("Workout Plan: " + workoutPlan);

        // Closing message
        System.out.println("\nThank you for using the Fitness Tracker App!");
        scanner.close();
    }
}
