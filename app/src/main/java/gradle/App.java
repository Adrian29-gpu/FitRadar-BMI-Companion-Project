/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle;

import gradle.Scenes.LoginScene;
import gradle.config.DbConfig;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setScene(mainScene(stage));
        stage.show();
        stage.setResizable(false);
    }

    private Scene mainScene(Stage stage) {
        Label aplikasiMy = new Label("My");
        aplikasiMy.getStyleClass().add("mylifestyle");
        aplikasiMy.relocate(80, 200);
        Label aplikasiLifeStyle = new Label("LifeStyle");
        aplikasiLifeStyle.getStyleClass().add("mylifestyle");
        aplikasiLifeStyle.relocate(95, 245);
        Label deskripsi1 = new Label("Routine Checking Application");
        deskripsi1.getStyleClass().add("deskripsiMylifestyle1");
        deskripsi1.relocate(80, 300);
        Label deskripsi2 = new Label("It's time to start a healthy routinity");
        deskripsi2.getStyleClass().add("deskripsiMylifestyle2");
        deskripsi2.relocate(80, 323);

        Rectangle rectangle = new Rectangle(320, 450);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(375);
        rectangle.setLayoutY(65);

        Label signIn = new Label("Sign In");
        signIn.getStyleClass().add("judul");
        signIn.relocate(490, 90);

        Label usernameJudul = new Label("Username");
        usernameJudul.getStyleClass().add("judulInput");
        usernameJudul.relocate(410, 185);
        TextField usernameInput = new TextField();
        usernameInput.setPromptText("Enter username");
        usernameInput.getStyleClass().add("transparanInput");
        usernameInput.setPrefWidth(262);
        usernameInput.relocate(405, 200);
        Line garisUsername = new Line();
        garisUsername.setStartX(410);
        garisUsername.setStartY(228);
        garisUsername.setEndX(660);
        garisUsername.setEndY(228);
        garisUsername.setStroke(Color.WHITE);
        garisUsername.setStrokeWidth(1.5);

        Label passwordJudul = new Label("Password");
        passwordJudul.getStyleClass().add("judulInput");
        passwordJudul.relocate(410, 285);
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("Enter password");
        passwordInput.getStyleClass().add("transparanInput");
        passwordInput.setPrefWidth(262);
        passwordInput.relocate(405, 300);
        Line garisPassword = new Line();
        garisPassword.setStartX(410);
        garisPassword.setStartY(328);
        garisPassword.setEndX(660);
        garisPassword.setEndY(328);
        garisPassword.setStroke(Color.WHITE);
        garisPassword.setStrokeWidth(1.5);

        Hyperlink signUp = new Hyperlink("Sign Up");
        signUp.getStyleClass().add("judulKlik");
        signUp.relocate(610, 330);
        signUp.setOnAction(e -> stage.setScene(registrationScene(stage)));

        Label error = new Label();
        error.getStyleClass().add("error");
        error.relocate(190, 300);

        Button buttonLogin = new Button("Login");
        buttonLogin.getStyleClass().add("buttonLogin");
        buttonLogin.relocate(440, 415);
        buttonLogin.setOnAction(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();

            if (DbConfig.validasiLogin(username, password)){
                stage.setScene(loginScene(stage));
            } else {
                error.setText("Invalid username or password");
                error.getStyleClass().add("warning");
                error.relocate(410, 333);
            }
        });

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, aplikasiMy, aplikasiLifeStyle, deskripsi1, deskripsi2, signIn, usernameJudul, garisUsername, passwordJudul, garisPassword, buttonLogin, signUp, usernameInput, passwordInput, error);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setTitle("MyLifeStyle");
        return scene;
    }

    private Scene loginScene(Stage stage) {
        Label welcome = new Label("Welcome to MyLifeStyle");
        welcome.getStyleClass().add("judul1");
        welcome.relocate(200, 140);

        Label deskripsiWelcome = new Label("It's time to check your lifestyle \n      to make a healthy life");
        deskripsiWelcome.getStyleClass().add("deskripsiWelcome");
        deskripsiWelcome.relocate(225, 190);

        Button buttonHistory = new Button("History");
        buttonHistory.getStyleClass().add("buttonWelcome");
        buttonHistory.relocate(155, 390);
        // buttonHistory.setOnAction(e -> stage.setScene(loginScene(stage)));

        Button buttonNext = new Button("Next >>");
        buttonNext.getStyleClass().add("buttonWelcome");
        buttonNext.relocate(435, 390);
        // buttonHistory.setOnAction(e -> stage.setScene(loginScene(stage)));

        Rectangle rectangle = new Rectangle(500, 350);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(120);
        rectangle.setLayoutY(115);

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, welcome, deskripsiWelcome, buttonHistory, buttonNext);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        return scene;
    }

    private Scene registrationScene(Stage stage) {
        Label registerLabel = new Label("Registration");
        registerLabel.getStyleClass().add("judul1");
        registerLabel.relocate(290, 80);
        
        Rectangle rectangle = new Rectangle(600, 450);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(70);
        rectangle.setLayoutY(65);

        Label fullnameInput = new Label("Full Name");
        fullnameInput.relocate(110, 155);
        fullnameInput.getStyleClass().add("judulInput");
        TextField tabelFullname = new TextField();
        tabelFullname.relocate(110, 175);
        tabelFullname.getStyleClass().add("tabelInput");

        Label usernameInput = new Label("Username");
        usernameInput.relocate(390, 155);
        usernameInput.getStyleClass().add("judulInput");
        TextField tabelUsername = new TextField();
        tabelUsername.relocate(390, 175);
        tabelUsername.getStyleClass().add("tabelInput");

        Label passwordInput = new Label("Password");
        passwordInput.relocate(390, 230);
        passwordInput.getStyleClass().add("judulInput");
        PasswordField tabelPassword = new PasswordField();
        tabelPassword.relocate(390, 250);
        tabelPassword.getStyleClass().add("tabelInput");

        Label phoneNumberInput = new Label("Phone Number");
        phoneNumberInput.relocate(110, 230);
        phoneNumberInput.getStyleClass().add("judulInput");
        TextField tabelPhonenumber = new TextField();
        tabelPhonenumber.relocate(110, 250);
        tabelPhonenumber.getStyleClass().add("tabelInput");

        Label rePasswordInput = new Label("Re-Password");
        rePasswordInput.relocate(390, 305);
        rePasswordInput.getStyleClass().add("judulInput");
        PasswordField tabelRepassword = new PasswordField();
        tabelRepassword.relocate(390, 325);
        tabelRepassword.getStyleClass().add("tabelInput");
        
        Label error1 = new Label();
        error1.getStyleClass().add("error");
        error1.relocate(190, 300);

        Button signUp = new Button("Sign Up");
        signUp.getStyleClass().add("buttonLogin");
        signUp.relocate(275, 410);
        signUp.setOnAction(e -> {
            String fullname = fullnameInput.getText();
            String username = usernameInput.getText();
            String password = passwordInput.getText();
            String repassword = rePasswordInput.getText();
            String phonenumber = phoneNumberInput.getText();

            if (fullname.isEmpty() || username.isEmpty() || password.isEmpty() || repassword.isEmpty() || phonenumber.isEmpty()) {
                error1.setText("Data must be required!");
                // return;
            } if (DbConfig.validasiRegister(fullname, phonenumber, password, repassword, username)) {
                stage.setScene(registerSuccess(stage));
            } else {
                error1.setText("Registered Failed. Data must be correct");}
        });

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, signUp, registerLabel, fullnameInput, tabelFullname, usernameInput, tabelUsername, passwordInput, tabelPassword, phoneNumberInput, tabelPhonenumber, rePasswordInput, tabelRepassword, error1);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        return scene;
    }

    private Scene registerSuccess(Stage stage) {
        Label success = new Label("Register Successful!");
        success.getStyleClass().add("judul1");
        success.relocate(230, 140);

        Rectangle rectangle = new Rectangle(550, 400);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(95);
        rectangle.setLayoutY(90);

        Label deskripsi1 = new Label("Congratulation, your account has been");
        deskripsi1.getStyleClass().add("deskripsiRegister");
        deskripsi1.relocate(230, 250);
        Label deskripsi2 = new Label("successfully created");
        deskripsi2.getStyleClass().add("deskripsiRegister");
        deskripsi2.relocate(300, 273);

        Button buttonContinue = new Button("Continue");
        buttonContinue.getStyleClass().add("buttonLogin");
        buttonContinue.relocate(275, 400);
        buttonContinue.setOnAction(e -> stage.setScene(mainScene(stage)));

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, success,deskripsi1, deskripsi2, buttonContinue);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        return scene;
    }

    public static void main(String[] args) {
        launch();
    }

}
