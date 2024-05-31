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

public class RegisterSuccess extends AbstractScene{

    public RegisterSuccess(Stage stage) {
        super(stage);
    }

    @Override
    public void show() {
        Label success = new Label("Register Successful!");
        success.getStyleClass().add("judul1");
        success.relocate(225, 115);

        Rectangle rectangle = new Rectangle(550, 400);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(95);
        rectangle.setLayoutY(90);

        Image image = new Image(getClass().getResourceAsStream("/Style/foto/succes.jpg"));
        ImageView viewImage = new ImageView(image);
        viewImage.setPreserveRatio(true);
        viewImage.setFitWidth(100);
        viewImage.setFitHeight(100);
        viewImage.relocate(325, 178);

        Label deskripsi1 = new Label("Congratulation, your account has been \n              successfully created");
        deskripsi1.getStyleClass().add("deskripsiRegister");
        deskripsi1.relocate(225, 310);

        Button buttonContinue = new Button("Continue");
        buttonContinue.getStyleClass().add("buttonLogin");
        buttonContinue.relocate(270, 400);
        buttonContinue.setOnAction(e -> {
            MainScene mainScene = new MainScene(stage);
            mainScene.show();
        });

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, success, viewImage, deskripsi1, buttonContinue);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
