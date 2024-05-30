package gradle.Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LoginScene {
    private Stage stage;

    public LoginScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
    // private Scene loginScene(Stage stage) {
        Label welcome = new Label("Welcome to MyLifeStyle");
        welcome.getStyleClass().add("judul1");
        welcome.relocate(200, 110);

        Image logo = new Image(getClass().getResourceAsStream("/Style/foto/logo2.jpg"));
        ImageView viewLogo = new ImageView(logo);
        viewLogo.setPreserveRatio(true);
        viewLogo.setFitWidth(170);
        viewLogo.setFitHeight(170);
        viewLogo.relocate(285, 130);

        Label deskripsiWelcome = new Label("It's time to check your lifestyle \n      to make a healthy life");
        deskripsiWelcome.getStyleClass().add("deskripsiWelcome");
        deskripsiWelcome.relocate(225, 290);

        Button buttonHistory = new Button("History");
        buttonHistory.getStyleClass().add("buttonWelcome");
        buttonHistory.relocate(155, 390);
        buttonHistory.setOnAction(e -> {
            HistoryScene historyScene = new HistoryScene(stage);
                historyScene.show();
        });

        Button buttonNext = new Button("Next >>");
        buttonNext.getStyleClass().add("buttonWelcome");
        buttonNext.relocate(435, 390);
        buttonNext.setOnAction(e -> {
            InputScene inputScene = new InputScene(stage);
                inputScene.show();
        });

        Image logoBack = new Image(getClass().getResourceAsStream("/Style/foto/home.jpg"));
        ImageView imageBack = new ImageView(logoBack);
        imageBack.setPreserveRatio(true);
        imageBack.setFitWidth(30);
        imageBack.setFitHeight(30);
        Button btnBack = new Button();
        btnBack.setGraphic(imageBack);
        btnBack.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
        btnBack.relocate(342, 440);
        btnBack.setOnAction(e -> {
            MainScene mainScene = new MainScene(stage);
                mainScene.show();
        });

        Rectangle rectangle = new Rectangle(550, 400);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(95);
        rectangle.setLayoutY(90);

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, welcome, viewLogo, deskripsiWelcome, btnBack, buttonHistory, buttonNext);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        // return scene;
    }
}