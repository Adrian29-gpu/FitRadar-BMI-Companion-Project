package gradle.Scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import gradle.Models.History;
import gradle.controllers.HistoryControllers;

public class HistoryScene {
    private Stage stage;

    public HistoryScene(Stage stage, LocalDate accessDate) {
        this.stage = stage;
    }

    public void show(int id) {
        List<History> histories = HistoryControllers.getAllHistoryByUserId(id);
        Collections.reverse(histories);

        Label judulHistory = new Label("Your Lifestyle History");
        judulHistory.getStyleClass().add("judul1");
        judulHistory.relocate(205, 30);

        VBox riwayat = new VBox();
        riwayat.setSpacing(10);
        riwayat.setAlignment(Pos.TOP_CENTER);

        for (History history : histories) {
            Label labelH1 = new Label("Date: " + history.getDate());
            labelH1.getStyleClass().add("history");
            labelH1.setPrefWidth(250);

            Button btnH1 = new Button("Result");
            btnH1.getStyleClass().add("buttonHistory");

            btnH1.setOnAction(e -> {
                HistoryDetailScene historyDetailScene = new HistoryDetailScene(stage);
                historyDetailScene.show(id, history.getId());
            });

            HBox history1 = new HBox(10);
            history1.getStyleClass().add("hboxHistory");
            history1.getChildren().addAll(labelH1, btnH1);
            history1.setAlignment(Pos.CENTER_LEFT);

            riwayat.getChildren().add(history1);
        }

        ScrollPane scrollPane = new ScrollPane(riwayat);
        scrollPane.setFitToWidth(true);
        scrollPane.setPrefViewportHeight(370);
        scrollPane.setLayoutX(114);
        scrollPane.setLayoutY(100);
        scrollPane.getStyleClass().add("custom-scroll-pane");

        Pane root = new Pane();

        Rectangle rectangle = new Rectangle(550, 400 + 150);
        rectangle.setFill(Color.web("#1A28A3"));
        rectangle.setOpacity(0.50);
        rectangle.setStrokeWidth(2);
        rectangle.setLayoutX(95);
        rectangle.setLayoutY(90);

        Image logoBack = new Image(getClass().getResourceAsStream("/Style/foto/home2.jpg"));
        ImageView imageBack = new ImageView(logoBack);
        imageBack.setPreserveRatio(true);
        imageBack.setFitWidth(80);
        imageBack.setFitHeight(80);
        Button btnBack = new Button();
        btnBack.setGraphic(imageBack);
        btnBack.getStyleClass().add("buttonBack");
        btnBack.setLayoutX(322);
        btnBack.setLayoutY(rectangle.getHeight() - 60); 
        btnBack.setOnAction(e -> {
            LoginScene loginScene = new LoginScene(stage);
            loginScene.show(id);
        });

        root.getChildren().addAll(rectangle, judulHistory, scrollPane, btnBack);
        root.getStyleClass().add("background");
        root.setPrefWidth(740);
        root.setPrefHeight(rectangle.getHeight() + 100);

        Scene scene = new Scene(root, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
