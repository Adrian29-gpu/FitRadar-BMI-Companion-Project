package gradle.Models;

public class History extends Model {
    private int user_id;
    private String water, exercise, sleep, vegetable, junkfood, smooking;
    
    public History(int user_id, int user_id2, String water, String exercise, String sleep,
            String vegetable, String junkfood, String smooking) {
        super(user_id);
        user_id = user_id2;
        this.water = water;
        this.exercise = exercise;
        this.sleep = sleep;
        this.vegetable = vegetable;
        this.junkfood = junkfood;
        this.smooking = smooking;
    }
}