package gradle.Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class InputScene {
    private Stage stage;

    public InputScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
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
        option1.getStyleClass().add("buttonInput");
    
        Button option2 = new Button("1.5 L - 3 L/day");
        option2.getStyleClass().add("buttonInput");
    
        Button option3 = new Button("More than 3 L/day");
        option3.getStyleClass().add("buttonInput");
        
    
        Button option4 = new Button("Less than 1 hour");
        option4.getStyleClass().add("buttonInput");
    
        Button option5 = new Button("1-2 hours");
        option5.getStyleClass().add("buttonInput");
    
        Button option6 = new Button("2-3 hours");
        option6.getStyleClass().add("buttonInput");
        
        Button option7 = new Button("Never");
        option7.getStyleClass().add("buttonInput");
        option7.relocate(265, 380);
        
        Button option8 = new Button("Less than 3 hour");
        option8.getStyleClass().add("buttonInput");
        
        Button option9 = new Button("3-6 hours");
        option9.getStyleClass().add("buttonInput");
        
        Button option10 = new Button("6-9 hours");
        option10.getStyleClass().add("buttonInput");
        
        Button option11 = new Button("More  than 9 hours");
        option11.getStyleClass().add("buttonInput");
        option11.relocate(265, 620);
        
        Button option12 = new Button("Rarely");
        option12.getStyleClass().add("buttonInput");
        
        Button option13 = new Button("Never");
        option13.getStyleClass().add("buttonInput");
    
        Button option14 = new Button("Often");
        option14.getStyleClass().add("buttonInput");
        
        // Button option15 = new Button("Rarely");
        // option15.getStyleClass().add("buttonInput");
        
        // Button option16 = new Button("Never");
        // option16.getStyleClass().add("buttonInput");
    
        // Button option17 = new Button("Often");
        // option17.getStyleClass().add("buttonInput");
        
        Button option18 = new Button("Rarely");
        option18.getStyleClass().add("buttonInput");
        
        Button option19 = new Button("Never");
        option19.getStyleClass().add("buttonInput");
    
        Button option20 = new Button("Often");
        option20.getStyleClass().add("buttonInput");
        
        Button option21 = new Button("Yes");
        option21.getStyleClass().add("buttonInput");
        
        Button option22 = new Button("No");
        option22.getStyleClass().add("buttonInput");

        // Menambahkan tombol ke HBox
        buttonBox.getChildren().addAll(option1, option2, option3);
        buttonBox2.getChildren().addAll(option4, option5, option6);
        buttonBox3.getChildren().addAll(option8, option9, option10);
        buttonBox4.getChildren().addAll(option12, option13, option14);
        buttonBox6.getChildren().addAll(option18, option19, option20);
        buttonBox7.getChildren().addAll(option21, option22);

        Button buttonResult = new Button("Result");
        buttonResult.getStyleClass().add("buttonLogin");
        buttonResult.relocate(275, 1400);
        buttonResult.setOnAction(e -> {
            ResultScene resultScene = new ResultScene(stage);
                resultScene.show();
        });
        
        Pane root = new Pane();
        root.getChildren().addAll(input, buttonBox, input2, buttonBox2, option7, input3, buttonBox3, option11, input4, buttonBox4, input6, buttonBox6, input7, buttonBox7, buttonResult);
        root.getStyleClass().add("background");
        root.setPrefWidth(740);
        root.setPrefHeight(1500);
    
        ScrollPane scrollPane = new ScrollPane(root);
        // scrollPane.setFitToWidth(true);
        // scrollPane.setFitToHeight(true);
    
        // Image imageBackground = new Image(getClass().getResourceAsStream("/Style/foto/MyLifeStyle.jpg"));
        // ImageView imageViewBackground = new ImageView(imageBackground);
        // StackPane stackPane = new StackPane(scrollPane,imageViewBackground);
    
        Scene scene = new Scene(scrollPane, 740, 580);
        scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
