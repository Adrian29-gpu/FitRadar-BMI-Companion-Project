package gradle.Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
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
        option1.relocate(15, 310);

        hydrationResult = new Label(getHydrationResult());
        hydrationResult.getStyleClass().add("judul3");
        hydrationResult.relocate(160, 185);
        hydrationResult.setWrapText(true);
        hydrationResult.getStyleClass().add("impact");

        Line garis1 = new Line();
        garis1.setStartX(0);
        garis1.setStartY(366);
        garis1.setEndX(740);
        garis1.setEndY(366);
        garis1.setStroke(Color.WHITE);
        garis1.setStrokeWidth(1.5);

        Image air = new Image(getClass().getResourceAsStream("/Style/foto/Water.PNG"));
        ImageView viewImage = new ImageView(air);
        viewImage.setPreserveRatio(true);
        viewImage.setFitWidth(130);
        viewImage.setFitHeight(130);
        viewImage.relocate(15, 180);

        Label exercise = new Label("Exercise");
        exercise.getStyleClass().add("judul1");
        exercise.relocate(15, 400);

        Label option2 = new Label(responses.getOrDefault(1, "No response"));
        option2.getStyleClass().add("judul3");
        option2.relocate(15, 570);

        exerciseResult = new Label(getExerciseResult());
        exerciseResult.getStyleClass().add("judul3");
        exerciseResult.relocate(150, 445);
        exerciseResult.setWrapText(true);
        exerciseResult.getStyleClass().add("impact");

        Image exercisee = new Image(getClass().getResourceAsStream("/Style/foto/Exercise.PNG"));
        ImageView viewImage1 = new ImageView(exercisee);
        viewImage1.setPreserveRatio(true);
        viewImage1.setFitWidth(130);
        viewImage1.setFitHeight(130);
        viewImage1.relocate(15, 440);

        Line garis2 = new Line();
        garis2.setStartX(0);
        garis2.setStartY(626);
        garis2.setEndX(740);
        garis2.setEndY(626);
        garis2.setStroke(Color.WHITE);
        garis2.setStrokeWidth(1.5);

        Label sleep = new Label("Sleep");
        sleep.getStyleClass().add("judul1");
        sleep.relocate(15, 660);

        Label option3 = new Label(responses.getOrDefault(2, "No response"));
        option3.getStyleClass().add("judul3");
        option3.relocate(15, 830);

        sleepResult = new Label(getSleepResult());
        sleepResult.getStyleClass().add("judul3");
        sleepResult.relocate(150, 705);
        sleepResult.setWrapText(true);
        sleepResult.getStyleClass().add("impact");

        Image sleepp = new Image(getClass().getResourceAsStream("/Style/foto/Sleep.PNG"));
        ImageView viewImage2 = new ImageView(sleepp);
        viewImage2.setPreserveRatio(true);
        viewImage2.setFitWidth(130);
        viewImage2.setFitHeight(130);
        viewImage2.relocate(15, 700);

        Line garis3 = new Line();
        garis3.setStartX(0);
        garis3.setStartY(886);
        garis3.setEndX(740);
        garis3.setEndY(886);
        garis3.setStroke(Color.WHITE);
        garis3.setStrokeWidth(1.5);

        Label junkFood = new Label("Junk Food");
        junkFood.getStyleClass().add("judul1");
        junkFood.relocate(15, 900);

        Label option4 = new Label(responses.getOrDefault(3, "No response"));
        option4.getStyleClass().add("judul3");
        option4.relocate(15, 1070);

        junkFoodResult = new Label(getJunkfoodResult());
        junkFoodResult.getStyleClass().add("judul3");
        junkFoodResult.relocate(150, 945);
        junkFoodResult.setWrapText(true);
        junkFoodResult.getStyleClass().add("impact");

        Image junk = new Image(getClass().getResourceAsStream("/Style/foto/Junkfood.PNG"));
        ImageView viewImage3 = new ImageView(junk);
        viewImage3.setPreserveRatio(true);
        viewImage3.setFitWidth(130);
        viewImage3.setFitHeight(130);
        viewImage3.relocate(15, 940);

        Line garis4 = new Line();
        garis4.setStartX(0);
        garis4.setStartY(1126);
        garis4.setEndX(740);
        garis4.setEndY(1126);
        garis4.setStroke(Color.WHITE);
        garis4.setStrokeWidth(1.5);

        Label fruits = new Label("Fruits and Vegetables");
        fruits.getStyleClass().add("judul1");
        fruits.relocate(15, 1140);

        Label option5 = new Label(responses.getOrDefault(5, "No response"));
        option5.getStyleClass().add("judul3");
        option5.relocate(15, 1310);

        vegetableResult = new Label(getVegetableResult());
        vegetableResult.getStyleClass().add("judul3");
        vegetableResult.relocate(150, 1185);
        vegetableResult.setWrapText(true);
        vegetableResult.getStyleClass().add("impact");

        Image vegetable = new Image(getClass().getResourceAsStream("/Style/foto/Fruits.PNG"));
        ImageView viewImage4 = new ImageView(vegetable);
        viewImage4.setPreserveRatio(true);
        viewImage4.setFitWidth(130);
        viewImage4.setFitHeight(130);
        viewImage4.relocate(15, 1180);

        Line garis5 = new Line();
        garis5.setStartX(0);
        garis5.setStartY(1366);
        garis5.setEndX(740);
        garis5.setEndY(1366);
        garis5.setStroke(Color.WHITE);
        garis5.setStrokeWidth(1.5);

        Label smoke = new Label("Smoke");
        smoke.getStyleClass().add("judul1");
        smoke.relocate(15, 1380);

        Label option6 = new Label(responses.getOrDefault(6, "No response"));
        option6.getStyleClass().add("judul3");
        option6.relocate(15, 1550);

        smokeResult = new Label(getSmokeResult());
        smokeResult.getStyleClass().add("judul3");
        smokeResult.relocate(150, 1425);
        smokeResult.setWrapText(true);
        smokeResult.getStyleClass().add("impact");

        Image smoking = new Image(getClass().getResourceAsStream("/Style/foto/Smoke.PNG"));
        ImageView viewImage5 = new ImageView(smoking);
        viewImage5.setPreserveRatio(true);
        viewImage5.setFitWidth(130);
        viewImage5.setFitHeight(130);
        viewImage5.relocate(15, 1420);

        Line garis6 = new Line();
        garis6.setStartX(0);
        garis6.setStartY(1606);
        garis6.setEndX(740);
        garis6.setEndY(1606);
        garis6.setStroke(Color.WHITE);
        garis6.setStrokeWidth(1.5);

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
        root.getChildren().addAll(rectangle, judulHistory, summary, buttonHome, hydration, hydrationResult, viewImage,
                option1, garis1,
                exercise, exerciseResult, viewImage1, option2, garis2, sleep, sleepResult, viewImage2,
                option3, garis3, junkFood, junkFoodResult, viewImage3, option4, garis4, fruits, vegetableResult,
                viewImage4, option5, garis5, smoke,
                smokeResult, viewImage5, option6, garis6);
        root.getStyleClass().add("background");
        root.setPrefWidth(725);
        root.setPrefHeight(1700);
        ScrollPane scrollPane = new ScrollPane(root);
        scrollPane.setPrefWidth(720);
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
                return "• Impact:\nDehydration, decreased kidney function, dry skin,\nand reduced ability of the body to regulate\ntemperature. Chronic dehydration can lead to long-term\nhealth issues like kidney stones";
            case "1.5 L - 3 L/day":
                return "• Impact:\nGenerally considered adequate for most people,\ndepending on physical activity and environmental\nconditions. Proper hydration supports optimal body\nfunctions, including digestion, circulation, and\ntemperature regulation.";
            case "More than 3 L/day":
                return "• Impact:\n While good hydration is important, excessive water\nintake can cause electrolyte imbalances. This is\nmore common in those who drink large amounts of water\nquickly without adequate electrolyte intake.";
            default:
                return "No response provided for hydration.";
        }
    }

    private String getExerciseResult() {
        String exerciseResponse = responses.getOrDefault(1, "No response");
        switch (exerciseResponse) {
            case "Less than 1 hour":
                return "• Impact:\nExercising less than 1 hour per day still provides health\nbenefits such as improved cardiovascular fitness, and\nmuscle strength. However, if too infrequent, it may\nnot be sufficient to effectively preventchronic diseases.";
            case "1-2 hours":
                return "• Impact:\nThis duration of exercise is considered ideal for\nmost people. It helps maintain a healthy weight,\nreduces the risk of chronic diseases such as heart\ndisease, type 2 diabetes, and cancer, and\nsleep quality.";
            case "2-3 hours":
                return "• Impact:\nExercising for 2 to 3 hours per day can be very beneficial,\nespecially for those aiming for high fitness levels\nor having specific fitness goals. However, too\nmuch exercise without adequate rest can lead\nto injuries, fatigue, and other health issues.";
            case "Never":
                return "• Impact:\nNot exercising at all can lead to various healthn\nproblems such as obesity, cardiovascular diseases,\ntype 2 diabetes, muscle and bone weakness, and\nmental health issues like depression and anxiety.";
            default:
                return "No response provided for exercise.";
        }
    }

    private String getSleepResult() {
        String sleepResponse = responses.getOrDefault(2, "No response");
        switch (sleepResponse) {
            case "Less than 3 hour":
                return "• Impact:\nChronic sleep deprivation can lead to serious issues such\nas cognitive impairments, decreased productivity,\ndepression, weakened immune system, obesity, diabetes,\nand cardiovascular diseases";
            case "3-6 hours":
                return "• Impact:\nInsufficient sleep can still result in decreased cognitive\nand physical performance, increased risk of accidents,\nmental health issues, and higher risk of chronic\ndiseases like hypertension and diabetes.";
            case "6-9 hours":
                return "• Impact:\nThis is the recommended sleep duration for most adults.\nGetting enough sleep helps maintain cognitive and physical\nfunctions, improves mental health, strengthens\nthe immune system, and reduces the risk of chronic\ndiseases.";
            case "More  than 9 hours":
                return "• Impact:\nExcessive sleep can be associated with health issues such\nas depression, heart disease, and diabetes. It can also\nbe a sign of underlying health problems like\nsleep apnea or other medical conditions.";
            default:
                return "No response provided for sleep.";
        }
    }

    private String getJunkfoodResult() {
        String junkFoodResponse = responses.getOrDefault(3, "No response");
        switch (junkFoodResponse) {
            case "Rarely":
                return "• Impact:\nConsuming junk food infrequently allows for a more\nbalanced and healthy diet, helping in the prevention of\nchronic diseases and maintaining a healthy weight.";
            case "Never":
                return "• Impact:\nAvoiding junk food completely supports optimal health,\nreduces the risk of obesity, heart disease, diabetes, and\nother chronic conditions. It also helps maintain\na balanced diet and healthy weight.";
            case "Often":
                return "• Impact:\nFrequent consumption of junk food is associated with an\nincreased risk of obesity, cardiovascular diseases, type\n2 diabetes, hypertension, and mental health\nproblems such as depression. Junk food is typically high\nin calories, sugar, salt, and unhealthy fats.";
            default:
                return "No response provided for junkfood.";
        }
    }

    private String getVegetableResult() {
        String vegetableResponse = responses.getOrDefault(5, "No response");
        switch (vegetableResponse) {
            case "Rarely":
                return "• Impact:\nA diet low in vegetables and fruits can increase the\nrisk of chronic diseases, nutrient deficiencies, and\ndigestive issues. Lack of fiber from vegetables and\nfruits can also cause digestive problems like\nconstipation.";
            case "Never":
                return "• Impact:\nNot consuming vegetables and fruits can lead to severe\nnutrient deficiencies, significant digestive problems,\nand a substantially increased risk of chronic\ndiseases like heart disease, stroke, cancer, and\ndiabetes.";
            case "Often":
                return "• Impact:\nA diet rich in vegetables and fruits is linked to a\nlower risk of chronic diseases such as heart disease,\nstroke, cancer, and type 2 diabetes. It also helps\nin weight management and improves digestive health.";
            default:
                return "No response provided for fruits and vegetables.";
        }
    }

    private String getSmokeResult() {
        String smokeResponse = responses.getOrDefault(6, "No response");
        switch (smokeResponse) {
            case "Yes":
                return "• Impact:\nSmoking is a leading cause of various serious diseases,\nincluding lung cancer, heart disease, stroke,\nchronic obstructive pulmonary disease (COPD), and\nmultiple other cancers. Smoking also accelerates skin\naging and can damage nearly every organ in\nthe body.";
            case "No":
                return "• Impact:\nNot smoking is highly beneficial for long-term health.\nIt reduces the risk of smoking-related chronic\ndiseases, improves quality of life, and extends\nlife expectancy.";
            default:
                return "No response provided for smoke.";
        }
    }
}
