package gradle.Scenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import gradle.controllers.HistoryControllers;

public class InputScene {
    private Stage stage;
    private Map<Integer, Button> lastSelectedButtons = new HashMap<>();

    public InputScene(Stage stage) {
        this.stage = stage;
    }

    public void show(int id) {
        Map<Integer, String> responses = new HashMap<>(); // Untuk menyimpan respons sementara
        Set<Integer> confirmedResponses = new HashSet<>();

        EventHandler<ActionEvent> buttonHandler = event -> {
            Button clickedButton = (Button) event.getSource();
            int questionIndex = Integer.parseInt(clickedButton.getId().split("-")[0]);

            if (!confirmedResponses.contains(questionIndex)) {
                responses.put(questionIndex, clickedButton.getText());

                // Remove style from previously selected button, if any
                Button previousSelectedButton = lastSelectedButtons.get(questionIndex);
                if (previousSelectedButton != null) {
                    previousSelectedButton.getStyleClass().removeAll("buttonSelected");
                    previousSelectedButton.setStyle(""); // Remove any custom styles like borders
                }

                // Set style for the current selected button
                clickedButton.getStyleClass().add("buttonSelected");
                clickedButton.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-style: solid;");
                lastSelectedButtons.put(questionIndex, clickedButton); // Update the last selected button

                System.out.println(questionIndex + " " + clickedButton.getText());
            } else {
                System.out.println("Response for question " + questionIndex
                        + " has already been confirmed and cannot be changed.");
            }
        };

        Label input = new Label("How much water do you\n           drink daily?");
        input.getStyleClass().add("inputan");
        input.relocate(220, 40);

        Label input2 = new Label("How long do you exercise\n             per week?");
        input2.getStyleClass().add("inputan");
        input2.relocate(205, 220);

        Label input3 = new Label("How many hours do you sleep on\n           average each night?");
        input3.getStyleClass().add("inputan");
        input3.relocate(165, 465);

        Label input4 = new Label("How often do you eat\n         junk food?");
        input4.getStyleClass().add("inputan");
        input4.relocate(232, 700);

        Label input6 = new Label("How often do you eat fruits\n         and vegetables?");
        input6.getStyleClass().add("inputan");
        input6.relocate(200, 870);

        Label input7 = new Label("Do you smoke?");
        input7.getStyleClass().add("inputan");
        input7.relocate(273, 1045);

        // Membuat HBox untuk tombol
        HBox buttonBox = new HBox(35);
        buttonBox.setLayoutX(30);
        buttonBox.setLayoutY(130);

        HBox buttonBox2 = new HBox(35);
        buttonBox2.setLayoutX(30);
        buttonBox2.setLayoutY(310);

        HBox buttonBox3 = new HBox(35);
        buttonBox3.setLayoutX(30);
        buttonBox3.setLayoutY(550);

        HBox buttonBox4 = new HBox(35);
        buttonBox4.setLayoutX(30);
        buttonBox4.setLayoutY(785);

        // HBox buttonBox5 = new HBox(35);
        // buttonBox5.setLayoutX(30);
        // buttonBox5.setLayoutY(960);

        HBox buttonBox6 = new HBox(35);
        buttonBox6.setLayoutX(30);
        buttonBox6.setLayoutY(960);

        HBox buttonBox7 = new HBox(30);
        buttonBox7.setLayoutX(145);
        buttonBox7.setLayoutY(1140);

        // Membuat tombol
        Button option1 = new Button("Less than 1.5 L/day");
        option1.setId("0-1");
        option1.setOnAction(buttonHandler);
        option1.getStyleClass().add("buttonInput");

        Button option2 = new Button("1.5 L - 3 L/day");
        option2.setId("0-2");
        option2.setOnAction(buttonHandler);
        option2.getStyleClass().add("buttonInput");

        Button option3 = new Button("More than 3 L/day");
        option3.setId("0-3");
        option3.setOnAction(buttonHandler);
        option3.getStyleClass().add("buttonInput");

        Button option4 = new Button("Less than 1 hour");
        option4.setId("1-1");
        option4.setOnAction(buttonHandler);
        option4.getStyleClass().add("buttonInput");

        Button option5 = new Button("1-2 hours");
        option5.setId("1-2");
        option5.setOnAction(buttonHandler);
        option5.getStyleClass().add("buttonInput");

        Button option6 = new Button("2-3 hours");
        option6.setId("1-3");
        option6.setOnAction(buttonHandler);
        option6.getStyleClass().add("buttonInput");

        Button option7 = new Button("Never");
        option7.setId("1-4");
        option7.setOnAction(buttonHandler);
        option7.getStyleClass().add("buttonInput");
        option7.relocate(265, 380);

        Button option8 = new Button("Less than 3 hour");
        option8.setId("2-1");
        option8.setOnAction(buttonHandler);
        option8.getStyleClass().add("buttonInput");

        Button option9 = new Button("3-6 hours");
        option9.setId("2-2");
        option9.setOnAction(buttonHandler);
        option9.getStyleClass().add("buttonInput");

        Button option10 = new Button("6-9 hours");
        option10.setId("2-3");
        option10.setOnAction(buttonHandler);
        option10.getStyleClass().add("buttonInput");

        Button option11 = new Button("More  than 9 hours");
        option11.setId("2-4");
        option11.setOnAction(buttonHandler);
        option11.getStyleClass().add("buttonInput");
        option11.relocate(265, 620);

        Button option12 = new Button("Rarely");
        option12.setId("3-1");
        option12.setOnAction(buttonHandler);
        option12.getStyleClass().add("buttonInput");

        Button option13 = new Button("Never");
        option13.setId("3-2");
        option13.setOnAction(buttonHandler);
        option13.getStyleClass().add("buttonInput");

        Button option14 = new Button("Often");
        option14.setId("3-3");
        option14.setOnAction(buttonHandler);
        option14.getStyleClass().add("buttonInput");

        Button option18 = new Button("Rarely");
        option18.setId("5-1");
        option18.setOnAction(buttonHandler);
        option18.getStyleClass().add("buttonInput");

        Button option19 = new Button("Never");
        option19.setId("5-2");
        option19.setOnAction(buttonHandler);
        option19.getStyleClass().add("buttonInput");

        Button option20 = new Button("Often");
        option20.setId("5-3");
        option20.setOnAction(buttonHandler);
        option20.getStyleClass().add("buttonInput");

        Button option21 = new Button("Yes");
        option21.setId("6-1");
        option21.setOnAction(buttonHandler);
        option21.getStyleClass().add("buttonInput");

        Button option22 = new Button("No");
        option22.setId("6-2");
        option22.setOnAction(buttonHandler);
        option22.getStyleClass().add("buttonInput");

        Label errorLabel = new Label();
        errorLabel.setTextFill(Color.RED);
        errorLabel.setLayoutX(275);
        errorLabel.setLayoutY(1370);
        errorLabel.setVisible(false);

        // Menambahkan tombol ke HBox
        buttonBox.getChildren().addAll(option1, option2, option3);
        buttonBox2.getChildren().addAll(option4, option5, option6);
        buttonBox3.getChildren().addAll(option8, option9, option10);
        buttonBox4.getChildren().addAll(option12, option13, option14);
        buttonBox6.getChildren().addAll(option18, option19, option20);
        buttonBox7.getChildren().addAll(option21, option22);

        Button buttonResult = new Button("Result");
        buttonResult.getStyleClass().add("buttonLogin");
        buttonResult.setLayoutX(275);
        buttonResult.setLayoutY(1400);
        buttonResult.setOnAction(e -> {
            if (responses.size() < 6) { // Assuming there are 6 questions to answer
                errorLabel.setText("All data must be filled!");
                errorLabel.setVisible(true);
            } else {
                errorLabel.setVisible(false);
                confirmedResponses.addAll(responses.keySet());
                System.out.println("Confirmed responses: " + responses);
                boolean isSuccess = HistoryControllers.addHistory(id, responses.get(0), responses.get(1),
                        responses.get(2), responses.get(3), responses.get(5), responses.get(6));
                if (isSuccess) {
                    ResultScene resultScene = new ResultScene(stage, responses);
                    resultScene.show(id);
                }

            }
        });

        Pane root = new Pane();
        root.getChildren().addAll(input, buttonBox, input2, buttonBox2, option7, input3, buttonBox3, option11, input4,
                buttonBox4, input6, buttonBox6, input7, buttonBox7, buttonResult);
        root.getStyleClass().add("background");
        root.setPrefWidth(740);
        root.setPrefHeight(1500);

        ScrollPane scrollPane = new ScrollPane(root);
        // scrollPane.setFitToWidth(true);
        // scrollPane.setFitToHeight(true);

        // Image imageBackground = new
        // Image(getClass().getResourceAsStream("/Style/foto/MyLifeStyle.jpg"));
        // ImageView imageViewBackground = new ImageView(imageBackground);
        // StackPane stackPane = new StackPane(scrollPane,imageViewBackground);

        Scene scene = new Scene(scrollPane, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
