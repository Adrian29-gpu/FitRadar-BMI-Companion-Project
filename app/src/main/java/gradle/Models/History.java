package gradle.Models;

public class History extends Model {
    private int userId;
    private String water, exercise, sleep, vegetable, junkfood, smooking;

    public History(int id, int userId, String water, String exercise, String sleep,
            String vegetable, String junkfood, String smooking) {
        super(id);
        this.userId = userId;
        this.water = water;
        this.exercise = exercise;
        this.sleep = sleep;
        this.vegetable = vegetable;
        this.junkfood = junkfood;
        this.smooking = smooking;
    }
    
    public int getuserId() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public String getJunkfood() {
        return junkfood;
    }

    public void setJunkfood(String junkfood) {
        this.junkfood = junkfood;
    }

    public String getSmooking() {
        return smooking;
    }

    public void setSmooking(String smooking) {
        this.smooking = smooking;
    }

}