package gradle.Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Map;

public class ResultScene {
    private Stage stage;
    private Map<Integer, String> responses;
    private Label hydrationResult;
    private Label exerciseResult;
    private Label sleepResult;
    private Label junkFoodResult;
    private Label smokeResult;
    private Label vegetableResult;
    

    public ResultScene(Stage stage, Map<Integer, String> responses) {
        this.stage = stage;
        this.responses = responses;
    }

    public Scene show(int id) {
        Label judulHistory = new Label("MyLifeStyle");
        judulHistory.getStyleClass().add("judul2");
        judulHistory.relocate(253, 15);

        Label summary = new Label("Your Personal Summary Based on Your\n                          answers");
        summary.getStyleClass().add("judul1");
        summary.relocate(90, 69);

        Label hydration = new Label("Hydration");
        hydration.getStyleClass().add("judul1");
        hydration.relocate(15, 140);

        Label option1 = new Label(responses.getOrDefault(0, "No response")); 
        option1.getStyleClass().add("judul3");
        option1.relocate(20, 180);

        hydrationResult = new Label(getHydrationResult());
        hydrationResult.getStyleClass().add("judul3");
        hydrationResult.relocate(100, 220);
        hydrationResult.setWrapText(true);
        hydrationResult.getStyleClass().add("impact");

        Image air = new Image(getClass().getResourceAsStream("/Style/foto/water.jpg"));
        ImageView viewImage = new ImageView(air);
        viewImage.setPreserveRatio(true);
        viewImage.setFitWidth(100);
        viewImage.setFitHeight(100);
        viewImage.relocate(15, 180);
        
        Label exercise = new Label("Exercise");
        exercise.getStyleClass().add("judul1");
        exercise.relocate(15, 400);
        
        Label option2 = new Label(responses.getOrDefault(1, "No response")); 
        option2.getStyleClass().add("judul3");
        option2.relocate(15, 440);

        exerciseResult = new Label(getExerciseResult());
        exerciseResult.getStyleClass().add("judul3");
        exerciseResult.relocate(100, 460);
        exerciseResult.setWrapText(true);
        exerciseResult.getStyleClass().add("impact");
        
        Label sleep = new Label("Sleep");
        sleep.getStyleClass().add("judul1");
        sleep.relocate(15, 660);
        
        Label option3 = new Label(responses.getOrDefault(2, "No response")); 
        option3.getStyleClass().add("judul3");
        option3.relocate(15, 700);

        sleepResult = new Label(getSleepResult());
        sleepResult.getStyleClass().add("judul3");
        sleepResult.relocate(100, 720);
        sleepResult.setWrapText(true);
        sleepResult.getStyleClass().add("impact");
        
        Label junkFood = new Label("Junk Food");
        junkFood.getStyleClass().add("judul1");
        junkFood.relocate(15, 900);
        
        Label option4 = new Label(responses.getOrDefault(3, "No response")); 
        option4.getStyleClass().add("judul3");
        option4.relocate(15, 940);

        junkFoodResult = new Label(getJunkfoodResult());
        junkFoodResult.getStyleClass().add("judul3");
        junkFoodResult.relocate(100, 960);
        junkFoodResult.setWrapText(true);
        junkFoodResult.getStyleClass().add("impact");
        
        Label fruits = new Label("Fruits and Vegetables");
        fruits.getStyleClass().add("judul1");
        fruits.relocate(15, 1140);
        
        Label option5 = new Label(responses.getOrDefault(5, "No response")); 
        option5.getStyleClass().add("judul3");
        option5.relocate(15, 1180);
        
        vegetableResult = new Label(getVegetableResult());
        vegetableResult.getStyleClass().add("judul3");
        vegetableResult.relocate(100, 1200);
        vegetableResult.setWrapText(true);
        vegetableResult.getStyleClass().add("impact");
        
        Label smoke = new Label("Smoke");
        smoke.getStyleClass().add("judul1");
        smoke.relocate(15, 1380);
        
        Label option6 = new Label(responses.getOrDefault(6, "No response")); 
        option6.getStyleClass().add("judul3");
        option6.relocate(15, 1420);

        smokeResult = new Label(getSmokeResult());
        smokeResult.getStyleClass().add("judul3");
        smokeResult.relocate(100, 1440);
        smokeResult.setWrapText(true);
        smokeResult.getStyleClass().add("impact");
        
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
        root.getChildren().addAll(rectangle, judulHistory, summary, buttonHome, hydration, hydrationResult, viewImage, option1,
                exercise, exerciseResult, option2, sleep, sleepResult, option3, junkFood, junkFoodResult, option4, fruits, vegetableResult, option5, smoke,
                smokeResult, option6);
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

    private String getHydrationResult() {
        String hydrationResponse = responses.getOrDefault(0, "No response");
        switch (hydrationResponse) {
            case "Less than 1.5 L/day":
                return "•\tImpact:\n   Dehydration, decreased kidney function, dry skin, constipation, and reduced ability of the body to regulate temperature. Chronic dehydration can lead to long-term health issues like kidney stones and urinary tract infections.";
            case "1.5 L - 3 L/day":
                return "•\tImpact: Generally considered adequate for most people, depending on physical activity and environmental conditions. Proper hydration supports optimal body functions, including digestion, circulation, and temperature regulation.";
            case "More than 3 L/day":
                return "•\tImpact: While good hydration is important, excessive water intake can cause electrolyte imbalances, such as hyponatremia. This is more common in athletes or those who drink large amounts of water quickly without adequate electrolyte intake.";
            default:
                return "No response provided for hydration.";
        }
    }

    private String getExerciseResult() {
        String exerciseResponse = responses.getOrDefault(1, "No response");
        switch (exerciseResponse) {
            case "Less than 1 hour":
                return "•\tImpact: Exercising less than 1 hour per day still provides health benefits such as improved cardiovascular fitness, and muscle strength. However, if too infrequent or too little, it may not be sufficient to effectively prevent chronic diseases.";
            case "1-2 hours":
                return "•\tImpact: This duration of exercise is considered ideal for most people. It helps maintain a healthy weight, reduces the risk of chronic diseases such as heart disease, type 2 diabetes, and cancer, and sleep quality.\n";
            case "2-3 hours":
                return "•\tImpact: Exercising for 2 to 3 hours per day can be very beneficial, especially for those aiming for high fitness levels or having specific fitness goals. However, too much exercise without adequate rest can lead to injuries, fatigue, and other health issues.\n";
            case "Never":
                return "•\tImpact: Not exercising at all can lead to various health problems such as obesity, cardiovascular diseases, type 2 diabetes, muscle and bone weakness, and mental health issues like depression and anxiety.";
            default:
                return "No response provided for exercise.";
        }
    }

    private String getSleepResult() {
        String sleepResponse = responses.getOrDefault(2, "No response");
        switch (sleepResponse) {
            case "Less than 3 hour":
                return "•\tImpact: Chronic sleep deprivation can lead to serious issues such as cognitive impairments, decreased productivity, depression, weakened immune system, obesity, diabetes, and cardiovascular diseases";
            case "3-6 hours":
                return "•\tImpact: Insufficient sleep can still result in decreased cognitive and physical performance, increased risk of accidents, mental health issues, and higher risk of chronic diseases like hypertension and diabetes.";
            case "6-9 hours":
                return "•\tImpact: This is the recommended sleep duration for most adults. Getting enough sleep helps maintain cognitive and physical functions, improves mental health, strengthens the immune system, and reduces the risk of chronic diseases.";
            case "More  than 9 hours":
                return "•	Impact: Excessive sleep can be associated with health issues such as depression, heart disease, and diabetes. It can also be a sign of underlying health problems like sleep apnea or other medical conditions.";
            default:
                return "No response provided for sleep.";
        }
    }

    private String getJunkfoodResult() {
        String junkFoodResponse = responses.getOrDefault(3, "No response");
        switch (junkFoodResponse) {
            case "Rarely":
                return "•\tImpact: Consuming junk food infrequently allows for a more balanced and healthy diet, helping in the prevention of chronic diseases and maintaining a healthy weight.";
            case "Never":
                return "•\tImpact: Avoiding junk food completely supports optimal health, reduces the risk of obesity, heart disease, diabetes, and other chronic conditions. It also helps maintain a balanced diet and healthy weight.";
            case "Often":
                return "•\tImpact: Frequent consumption of junk food is associated with an increased risk of obesity, cardiovascular diseases, type 2 diabetes, hypertension, and mental health problems such as depression. Junk food is typically high in calories, sugar, salt, and unhealthy fats.";
            default:
                return "No response provided for junkfood.";
        }
    }

    private String getVegetableResult() {
        String vegetableResponse = responses.getOrDefault(5, "No response");
        switch (vegetableResponse) {
            case "Rarely":
                return "•\tImpact: A diet low in vegetables and fruits can increase the risk of chronic diseases, nutrient deficiencies, and digestive issues. Lack of fiber from vegetables and fruits can also cause digestive problems like constipation.";
            case "Never":
                return "•\tImpact: Not consuming vegetables and fruits can lead to severe nutrient deficiencies, significant digestive problems, and a substantially increased risk of chronic diseases like heart disease, stroke, cancer, and diabetes.";
            case "Often":
                return "•\tImpact: A diet rich in vegetables and fruits is linked to a lower risk of chronic diseases such as heart disease, stroke, cancer, and type 2 diabetes. It also helps in weight management and improves digestive health.";
            default:
                return "No response provided for fruits and vegetables.";
        }
    }

    private String getSmokeResult() {
        String smokeResponse = responses.getOrDefault(6, "No response");
        switch (smokeResponse) {
            case "Yes":
                return "•\tImpact: Smoking is a leading cause of various serious diseases, including lung cancer, heart disease, stroke, chronic obstructive pulmonary disease (COPD), and multiple other cancers. Smoking also accelerates skin aging and can damage nearly every organ in the body.";
            case "No":
                return "•\tImpact: Not smoking is highly beneficial for long-term health. It reduces the risk of smoking-related chronic diseases, improves quality of life, and extends life expectancy.";
            default:
                return "No response provided for smoke.";
        }
    }
}
