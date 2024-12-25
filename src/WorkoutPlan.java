public class WorkoutPlan {
    private String name;
    private int duration; // in minutes
    private String difficulty;

    public WorkoutPlan(String name, int duration, String difficulty) {
        this.name = name;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "WorkoutPlan{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}