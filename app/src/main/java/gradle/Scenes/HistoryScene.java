package gradle.Scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HistoryScene {
    private Stage stage;
    private LocalDate accessDate;

    public HistoryScene(Stage stage, LocalDate accessDate) {
        this.stage = stage;
        this.accessDate = (accessDate != null) ? accessDate : LocalDate.now();  // Menggunakan tanggal saat ini jika accessDate null
    }
    

    public void show(int id) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = accessDate.format(formatter);

        Label judulHistory = new Label("Your Lifestyle History");
        judulHistory.getStyleClass().add("judul1");
        judulHistory.relocate(205, 30);

        Rectangle rectangle = new Rectangle(550, 400);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(95);
        rectangle.setLayoutY(90);

        Label labelH1 = new Label("Date: " + formattedDate);
        labelH1.getStyleClass().add("history");

        Button btnH1 = new Button("Result");
        btnH1.getStyleClass().add("buttonHistory");

        HBox history1 = new HBox(10); // Mengubah spacing sesuai kebutuhan
        history1.getStyleClass().add("hboxHistory");
        history1.getChildren().addAll(labelH1, btnH1);
        history1.setLayoutX(120);
        history1.setLayoutY(100);
        history1.setAlignment(Pos.CENTER_LEFT);

        

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
        root.getChildren().addAll(rectangle, judulHistory, btnBack, history1);
        root.getStyleClass().add("background");
        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
