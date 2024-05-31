package gradle.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import gradle.Models.User;
import gradle.config.DbConfig;

public class UserControllers extends DbConfig {
    public static User validasiLogin(String username, String password) {
        getConnection();
        query = "SELECT * FROM users WHERE username=? AND password=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet login = preparedStatement.executeQuery()) {
                int id = login.getInt("id");
                String dataUsername = login.getString("username");
                String fullnumber = login.getString("fullname");
                String phonenumber = login.getString("phonenumber");
                User user = new User(id, dataUsername, fullnumber, phonenumber);
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean validasiRegister(String fullname, String phonenumber, String username, String password,
            String repassword) {
        query = "INSERT INTO users (fullname, phonenumber, username, password, repassword) VALUES (?, ?, ?, ?, ?)";
        try {
            getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, fullname);
            preparedStatement.setString(2, phonenumber);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, repassword);
            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
