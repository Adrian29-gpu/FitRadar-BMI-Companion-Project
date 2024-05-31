package gradle.Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Map;

public class ResultScene {
    private Stage stage;
    private Map<Integer, String> responses;

    public ResultScene(Stage stage, Map<Integer, String> responses) {
        this.stage = stage;
        this.responses = responses;
    }

    public Scene show(int id) {
        Label judulHistory = new Label("MyLifeStyle");
        judulHistory.getStyleClass().add("judul2");
        judulHistory.relocate(260, 15);
        
        Label summary = new Label("Your Personal Summary Based on Your\n                          answers");
        summary.getStyleClass().add("judul1");
        summary.relocate(90, 69);
        
        Label hydration = new Label("Hydration");
        hydration.getStyleClass().add("judul1");
        hydration.relocate(15, 140);
        
        Label option1 = new Label(responses.getOrDefault(0, "No response")); 
        option1.getStyleClass().add("judul3");
        option1.relocate(20, 180);
        
        Label exercise = new Label("Exercise");
        exercise.getStyleClass().add("judul1");
        exercise.relocate(15, 400);
        
        Label option2 = new Label(responses.getOrDefault(1, "No response")); 
        option2.getStyleClass().add("judul3");
        option2.relocate(15, 440);
        
        Label sleep = new Label("Sleep");
        sleep.getStyleClass().add("judul1");
        sleep.relocate(15, 660);
        
        Label option3 = new Label(responses.getOrDefault(2, "No response")); 
        option3.getStyleClass().add("judul3");
        option3.relocate(15, 700);
        
        Label junkFood = new Label("Junk Food");
        junkFood.getStyleClass().add("judul1");
        junkFood.relocate(15, 900);
        
        Label option4 = new Label(responses.getOrDefault(3, "No response")); 
        option4.getStyleClass().add("judul3");
        option4.relocate(15, 940);
        
        Label fruits = new Label("Fruits and Vegetables");
        fruits.getStyleClass().add("judul1");
        fruits.relocate(15, 1140);
        
        Label option5 = new Label(responses.getOrDefault(5, "No response")); 
        option5.getStyleClass().add("judul3");
        option5.relocate(15, 1180);
        
        Label smoke = new Label("Smoke");
        smoke.getStyleClass().add("judul1");
        smoke.relocate(15, 1380);
        
        Label option6 = new Label(responses.getOrDefault(6, "No response")); 
        option6.getStyleClass().add("judul3");
        option6.relocate(15, 1420);

        Rectangle rectangle = new Rectangle(740, 1700);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(0);
        rectangle.setLayoutY(0);
        
        Button buttonHome = new Button("Home");
        buttonHome.getStyleClass().add("buttonLogin");
        buttonHome.relocate(260, 1650);
        buttonHome.setOnAction(e -> {
            LoginScene loginScene = new LoginScene(stage);
                loginScene.show(id);
        });

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, judulHistory, summary, buttonHome, hydration, option1, exercise, option2, sleep, option3, junkFood, option4, fruits, option5, smoke, option6 );
        root.getStyleClass().add("background");
        root.setPrefWidth(740);
        root.setPrefHeight(1700);
        ScrollPane scrollPane = new ScrollPane(root);

        Scene scene = new Scene(scrollPane, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        return scene;
    }
}
