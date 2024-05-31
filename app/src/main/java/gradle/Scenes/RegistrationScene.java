package gradle.Scenes;

import gradle.controllers.UserControllers;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RegistrationScene extends AbstractScene {

    public RegistrationScene(Stage stage) {
        super(stage);
    }

    @Override
    public void show() {
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
        rePasswordInput.relocate(250, 305);
        rePasswordInput.getStyleClass().add("judulInput");
        PasswordField tabelRepassword = new PasswordField();
        tabelRepassword.relocate(250, 325);
        tabelRepassword.getStyleClass().add("tabelInput");

        Label error1 = new Label();
        error1.getStyleClass().add("warning");
        error1.relocate(190, 300);

        Image logoBack = new Image(getClass().getResourceAsStream("/Style/foto/exit.jpg"));
        ImageView imageBack = new ImageView(logoBack);
        imageBack.setPreserveRatio(true);
        imageBack.setFitWidth(60);
        imageBack.setFitHeight(60);
        Button btnBack = new Button();
        btnBack.setGraphic(imageBack);
        btnBack.getStyleClass().add("buttonBack");
        btnBack.relocate(75, 450);
        btnBack.setOnAction(e -> {
            MainScene mainScene = new MainScene(stage);
            mainScene.show();
        });

        Button signUp = new Button("Sign Up");
        signUp.getStyleClass().add("buttonLogin");
        signUp.relocate(275, 410);
        signUp.setOnAction(e -> {
            String fullname = tabelFullname.getText();
            String username = tabelUsername.getText();
            String password = tabelPassword.getText();
            String repassword = tabelRepassword.getText();
            String phonenumber = tabelPhonenumber.getText();

            if (fullname.isEmpty() || username.isEmpty() || password.isEmpty() || repassword.isEmpty()
                    || phonenumber.isEmpty()) {
                error1.setText("All fields are required!");
                error1.relocate(305, 450);
                return;
            } else if (!password.equals(repassword)) {
                error1.setText("Passwords do not match! Please re-enter");
                error1.relocate(255, 450);
                return;
            } else if (password.length() < 8){
                error1.setText("Passwords at least 8 character");
                error1.relocate(285, 450);
                return;
            }

            if (UserControllers.validasiRegister(fullname, phonenumber, username, password, repassword)) {
                RegisterSuccess registerSuccess = new RegisterSuccess(stage);
                registerSuccess.show();
            } else {
                error1.setText("Registration Failed. Please check your data");
                error1.relocate(247, 450);
            }

        });

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, signUp, btnBack, registerLabel, fullnameInput, tabelFullname,
                usernameInput, tabelUsername, passwordInput, tabelPassword, phoneNumberInput, tabelPhonenumber,
                rePasswordInput, tabelRepassword, error1);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
