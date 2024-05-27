package gradle.Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        // return scene;
    }
}