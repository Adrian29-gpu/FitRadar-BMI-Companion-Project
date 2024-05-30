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

public class SplashScreen {
    private Stage stage;

    public SplashScreen(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        /* ==> INSTANCE LAYOUT START <== */
        Image image = new Image(getClass().getResourceAsStream("Style/foto/logo.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(550);
        imageView.setFitHeight(550);
        imageView.setPreserveRatio(true);

        Label labelLoading = new Label("Loading...");
        labelLoading.setFont(Font.font("Arial", FontWeight.BOLD, 35));
        labelLoading.setTextFill(Color.WHITE);
        VBox vBoxLoading = new VBox(labelLoading);
        vBoxLoading.setAlignment(Pos.BOTTOM_CENTER);
        vBoxLoading.setPadding(new Insets(0, 0, 20, 0));

        StackPane stackPane = new StackPane(imageView, vBoxLoading);

        VBox root = new VBox(stackPane);
        Scene scene = new Scene(root, 550, 550);
        // stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
        // Remove stage title bar
        /* ==> INSTANCE LAYOUT END <== */
    }

}
