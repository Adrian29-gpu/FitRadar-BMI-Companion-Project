package gradle.controllers;

import gradle.config.DbConfig;

public class HistoryControllers extends DbConfig {
    public static boolean addHistory(int user_id, String water, String exercise, String sleep, String sweet_food, String vegetable, String junkfood, String smooking){
        query = "INSERT INTO history (user_id, water, exercise, sleep, sweet_food, vegetable, junkfood, smooking) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
