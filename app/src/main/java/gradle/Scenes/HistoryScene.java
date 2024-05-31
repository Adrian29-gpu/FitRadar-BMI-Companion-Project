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

public class HistoryScene {
    private Stage stage;

    public HistoryScene(Stage stage) {
        this.stage = stage;
    }

    public void show(int id) {
        Label judulHistory = new Label("Your LifesTyle History");
        judulHistory.getStyleClass().add("judul1");
        judulHistory.relocate(213, 30);

        Rectangle rectangle = new Rectangle(550, 400);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(95);
        rectangle.setLayoutY(90);

        Image logoBack = new Image(getClass().getResourceAsStream("/Style/foto/home2.jpg"));
        ImageView imageBack = new ImageView(logoBack);
        imageBack.setPreserveRatio(true);
        imageBack.setFitWidth(75);
        imageBack.setFitHeight(75);
        Button btnBack = new Button();
        btnBack.setGraphic(imageBack);
        btnBack.getStyleClass().add("buttonBack");
        btnBack.relocate(322, 445);
        btnBack.setOnAction(e -> {
            LoginScene loginScene = new LoginScene(stage);
            loginScene.show(id);
        });

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, judulHistory, btnBack);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

}
