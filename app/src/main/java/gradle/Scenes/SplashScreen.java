package gradle.Scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class SplashScreen extends AbstractScene {

    public SplashScreen(Stage stage) {
        super(stage);
    }

    @Override
    public void show() {
        Image image = new Image(getClass().getResourceAsStream("/Style/foto/logo.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(580);
        imageView.setFitHeight(580);
        imageView.setPreserveRatio(true);

        Label labelLoading = new Label("Loading...");
        labelLoading.setFont(Font.font("Arial", FontWeight.BOLD, 35));
        labelLoading.setTextFill(Color.WHITE);
        VBox vBoxLoading = new VBox(labelLoading);
        vBoxLoading.setAlignment(Pos.BOTTOM_CENTER);
        vBoxLoading.setPadding(new Insets(0, 0, 20, 0));

        StackPane stackPane = new StackPane(imageView, vBoxLoading);

        VBox root = new VBox(stackPane);
        Scene scene = new Scene(root, 580, 580);
        stage.setScene(scene);
        stage.show();
    }

}
