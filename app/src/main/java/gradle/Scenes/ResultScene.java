package gradle.Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ResultScene {
    private Stage stage;

    public ResultScene(Stage stage) {
        this.stage = stage;
    }

    public Scene show() {
        Label judulHistory = new Label("Your LifeStyle History");
        judulHistory.getStyleClass().add("judul1");
        judulHistory.relocate(190, 30);

        Rectangle rectangle = new Rectangle(550, 400);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(95);
        rectangle.setLayoutY(90);
        
        Button buttonHome = new Button("Home");
        buttonHome.getStyleClass().add("buttonLogin");
        buttonHome.relocate(260, 450);
        buttonHome.setOnAction(e -> {
            LoginScene loginScene = new LoginScene(stage);
                loginScene.show();
        });

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, judulHistory, buttonHome);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        return scene;
    }
}
