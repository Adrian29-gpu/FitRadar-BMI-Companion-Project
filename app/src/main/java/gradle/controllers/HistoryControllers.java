package gradle.controllers;

import java.util.ArrayList;
import java.util.List;

import gradle.config.DbConfig;
import gradle.Models.History;

public class HistoryControllers extends DbConfig {

    // CREATE
    public static boolean addHistory(int user_id, String water, String exercise, String sleep, String vegetable,
            String junkfood, String smooking, String date) {
        query = "INSERT INTO history (user_id, water, exercise, sleep, vegetable, junkfood, smooking, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, user_id);
            preparedStatement.setString(2, water);
            preparedStatement.setString(3, exercise);
            preparedStatement.setString(4, sleep);
            preparedStatement.setString(5, vegetable);
            preparedStatement.setString(6, junkfood);
            preparedStatement.setString(7, smooking);
            preparedStatement.setString(8, date);
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // READ
    public static List<History> getAllHistoryByUserId(int user_id) {
        List<History> histories = new ArrayList<>();
        query = "SELECT * FROM history WHERE user_id=?";
        try {
            getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, user_id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String water = resultSet.getString("water");
                String exercise = resultSet.getString("exercise");
                String sleep = resultSet.getString("sleep");
                String vegetable = resultSet.getString("vegetable");
                String junkfood = resultSet.getString("junkfood");
                String smooking = resultSet.getString("smooking");
                String date = resultSet.getString("date");
                History history = new History(id, user_id, water, exercise, sleep, vegetable, junkfood, smooking, date);
                histories.add(history);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return histories;
    }

    // READ
    public static History getHistoryById(int id) {
        History history = null;
        query = "SELECT * FROM history WHERE id=?";
        try {
            getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userid = resultSet.getInt("user_id");
                String water = resultSet.getString("water");
                String exercise = resultSet.getString("exercise");
                String sleep = resultSet.getString("sleep");
                String vegetable = resultSet.getString("vegetable");
                String junkfood = resultSet.getString("junkfood");
                String smooking = resultSet.getString("smooking");
                String date = resultSet.getString("date");
                history = new History(id, userid, water, exercise, sleep, vegetable, junkfood, smooking, date);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return history;
    }

    // // DELETE
    // public static boolean deleteHistory(int user_id) {
    // query = "DELETE FROM books WHERE user_id=?";
    // try {
    // getConnection();
    // preparedStatement = connection.prepareStatement(query);
    // preparedStatement.setInt(1, user_id);
    // preparedStatement.executeUpdate();
    // return true;
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // return false;
    // }
}
