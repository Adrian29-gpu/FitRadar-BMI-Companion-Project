package gradle.Scenes;

import gradle.controllers.UserControllers;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainScene {
    private Stage stage;

    public MainScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
    // private Scene mainScene(Stage stage) {
        Image logo = new Image(getClass().getResourceAsStream("/Style/foto/logo2.jpg"));
        ImageView viewLogo = new ImageView(logo);
        viewLogo.setPreserveRatio(true);
        viewLogo.setFitWidth(270);
        viewLogo.setFitHeight(270);
        viewLogo.relocate(55, 120);
        
        Label deskripsi1 = new Label("Routine Checking Application");
        deskripsi1.getStyleClass().add("deskripsiMylifestyle1");
        deskripsi1.relocate(75, 350);
        Label deskripsi2 = new Label("It's time to start a healthy routinity");
        deskripsi2.getStyleClass().add("deskripsiMylifestyle2");
        deskripsi2.relocate(81, 375);

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

        Hyperlink signUp = new Hyperlink("Don’t have an account? Sign up");
        signUp.getStyleClass().add("judulKlik");
        signUp.relocate(445, 450);
        signUp.setOnAction(e -> {
            RegistrationScene registrationScene = new RegistrationScene(stage);
                registrationScene.show();
        });

        Label error = new Label();
        error.getStyleClass().add("error");
        error.relocate(190, 300);

        Button buttonLogin = new Button("Login");
        buttonLogin.getStyleClass().add("buttonLogin");
        buttonLogin.relocate(440, 415);
        buttonLogin.setOnAction(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();

            if (UserControllers.validasiLogin(username, password)){
                // stage.setScene(loginScene(stage));
                LoginScene loginScene = new LoginScene(stage);
                loginScene.show();
            } else {
                error.setText("Invalid username or password");
                error.getStyleClass().add("warning");
                error.relocate(410, 333);
            }
        });

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, viewLogo,  deskripsi1, deskripsi2, signIn, usernameJudul, garisUsername, passwordJudul, garisPassword, buttonLogin, signUp, usernameInput, passwordInput, error);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setTitle("MyLifeStyle");
        stage.setScene(scene);
        stage.show();
    }
}
