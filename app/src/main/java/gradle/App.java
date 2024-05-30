/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle;

// import gradle.Scenes.LoginScene;
import gradle.Scenes.MainScene;
import gradle.Scenes.SplashScreen;
// import gradle.Scenes.LoginScene;
// import gradle.config.DbConfig;
// import gradle.controllers.UserControllers;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Hyperlink;
// import javafx.scene.control.Label;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.ScrollPane;
// import javafx.scene.control.TextField;
import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.Line;
// import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        // stage.setScene(mainScene(stage));
        stage.show();
        stage.setResizable(false);
        Image imageIcon = new Image(getClass().getClassLoader().getResourceAsStream("Style/foto/logo.jpg"));
            stage.getIcons().add(imageIcon);

            // BONUS: Show SplashScreen before show LoginScene
        SplashScreen splashScreen = new SplashScreen(stage);
        splashScreen.show();

        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Update UI on JavaFX Application Thread
            Platform.runLater(() -> {
                stage.close();

                VBox root = new VBox();
                Scene scene = new Scene(root, 740, 580);
                // stage.initStyle(StageStyle.DECORATED);
                stage.setScene(scene);
                stage.show();

                MainScene mainScene = new MainScene(stage);
                mainScene.show();
            });
        }).start();
    }


    // private Scene mainScene(Stage stage) {
    //     Image logo = new Image(getClass().getResourceAsStream("/Style/foto/logo2.jpg"));
    //     ImageView viewLogo = new ImageView(logo);
    //     viewLogo.setPreserveRatio(true);
    //     viewLogo.setFitWidth(270);
    //     viewLogo.setFitHeight(270);
    //     viewLogo.relocate(55, 120);
        
    //     Label deskripsi1 = new Label("Routine Checking Application");
    //     deskripsi1.getStyleClass().add("deskripsiMylifestyle1");
    //     deskripsi1.relocate(75, 350);
    //     Label deskripsi2 = new Label("It's time to start a healthy routinity");
    //     deskripsi2.getStyleClass().add("deskripsiMylifestyle2");
    //     deskripsi2.relocate(81, 375);

    //     Rectangle rectangle = new Rectangle(320, 450);
    //     rectangle.setFill(Color.web("#1A28A3"));
    //     rectangle.setOpacity(0.50);
    //     rectangle.setStrokeWidth(2);
    //     rectangle.setLayoutX(375);
    //     rectangle.setLayoutY(65);

    //     Label signIn = new Label("Sign In");
    //     signIn.getStyleClass().add("judul");
    //     signIn.relocate(490, 90);

    //     Label usernameJudul = new Label("Username");
    //     usernameJudul.getStyleClass().add("judulInput");
    //     usernameJudul.relocate(410, 185);
    //     TextField usernameInput = new TextField();
    //     usernameInput.setPromptText("Enter username");
    //     usernameInput.getStyleClass().add("transparanInput");
    //     usernameInput.setPrefWidth(262);
    //     usernameInput.relocate(405, 200);
    //     Line garisUsername = new Line();
    //     garisUsername.setStartX(410);
    //     garisUsername.setStartY(228);
    //     garisUsername.setEndX(660);
    //     garisUsername.setEndY(228);
    //     garisUsername.setStroke(Color.WHITE);
    //     garisUsername.setStrokeWidth(1.5);

    //     Label passwordJudul = new Label("Password");
    //     passwordJudul.getStyleClass().add("judulInput");
    //     passwordJudul.relocate(410, 285);
    //     PasswordField passwordInput = new PasswordField();
    //     passwordInput.setPromptText("Enter password");
    //     passwordInput.getStyleClass().add("transparanInput");
    //     passwordInput.setPrefWidth(262);
    //     passwordInput.relocate(405, 300);
    //     Line garisPassword = new Line();
    //     garisPassword.setStartX(410);
    //     garisPassword.setStartY(328);
    //     garisPassword.setEndX(660);
    //     garisPassword.setEndY(328);
    //     garisPassword.setStroke(Color.WHITE);
    //     garisPassword.setStrokeWidth(1.5);

    //     Hyperlink signUp = new Hyperlink("Don’t have an account? Sign up");
    //     signUp.getStyleClass().add("judulKlik");
    //     signUp.relocate(445, 450);
    //     signUp.setOnAction(e -> stage.setScene(registrationScene(stage)));

    //     Label error = new Label();
    //     error.getStyleClass().add("error");
    //     error.relocate(190, 300);

    //     Button buttonLogin = new Button("Login");
    //     buttonLogin.getStyleClass().add("buttonLogin");
    //     buttonLogin.relocate(440, 415);
    //     buttonLogin.setOnAction(e -> {
    //         String username = usernameInput.getText();
    //         String password = passwordInput.getText();

    //         if (UserControllers.validasiLogin(username, password)){
    //             stage.setScene(loginScene(stage));
    //         } else {
    //             error.setText("Invalid username or password");
    //             error.getStyleClass().add("warning");
    //             error.relocate(410, 333);
    //         }
    //     });

    //     // Image imageIcon = new Image(getClass().getClassLoader().getResourceAsStream("Style/foto/logo.jpg"));
    //     //     stage.getIcons().add(imageIcon);

    //     Pane root = new Pane();
    //     root.getChildren().addAll(rectangle, viewLogo,  deskripsi1, deskripsi2, signIn, usernameJudul, garisUsername, passwordJudul, garisPassword, buttonLogin, signUp, usernameInput, passwordInput, error);
    //     root.getStyleClass().add("background");
    //     Scene scene = new Scene(root, 740, 580);
    //     scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
    //     stage.setTitle("MyLifeStyle");
    //     return scene;
    // }

    // private Scene loginScene(Stage stage) {
    //     Label welcome = new Label("Welcome to MyLifeStyle");
    //     welcome.getStyleClass().add("judul1");
    //     welcome.relocate(200, 110);

    //     Image logo = new Image(getClass().getResourceAsStream("/Style/foto/logo2.jpg"));
    //     ImageView viewLogo = new ImageView(logo);
    //     viewLogo.setPreserveRatio(true);
    //     viewLogo.setFitWidth(170);
    //     viewLogo.setFitHeight(170);
    //     viewLogo.relocate(285, 130);

    //     Label deskripsiWelcome = new Label("It's time to check your lifestyle \n      to make a healthy life");
    //     deskripsiWelcome.getStyleClass().add("deskripsiWelcome");
    //     deskripsiWelcome.relocate(225, 290);

    //     Button buttonHistory = new Button("History");
    //     buttonHistory.getStyleClass().add("buttonWelcome");
    //     buttonHistory.relocate(155, 390);
    //     buttonHistory.setOnAction(e -> stage.setScene(historyScene(stage)));

    //     Button buttonNext = new Button("Next >>");
    //     buttonNext.getStyleClass().add("buttonWelcome");
    //     buttonNext.relocate(435, 390);
    //     buttonNext.setOnAction(e -> stage.setScene(inputScene(stage)));

    //     Image logoBack = new Image(getClass().getResourceAsStream("/Style/foto/home.jpg"));
    //     ImageView imageBack = new ImageView(logoBack);
    //     imageBack.setPreserveRatio(true);
    //     imageBack.setFitWidth(30);
    //     imageBack.setFitHeight(30);
    //     Button btnBack = new Button();
    //     btnBack.setGraphic(imageBack);
    //     btnBack.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
    //     btnBack.relocate(342, 440);
    //     btnBack.setOnAction(e -> {
    //         MainScene mainScene = new MainScene(stage);
    //             mainScene.show();
    //     });

    //     Rectangle rectangle = new Rectangle(550, 400);
    //     rectangle.setFill(Color.web("#1A28A3"));
    //     rectangle.setOpacity(0.50);
    //     rectangle.setStrokeWidth(2);
    //     rectangle.setLayoutX(95);
    //     rectangle.setLayoutY(90);

    //     Pane root = new Pane();
    //     root.getChildren().addAll(rectangle, welcome, viewLogo, deskripsiWelcome, btnBack, buttonHistory, buttonNext);
    //     root.getStyleClass().add("background");
    //     Scene scene = new Scene(root, 740, 580);
    //     scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
    //     return scene;
    // }

    // private Scene registrationScene(Stage stage) {
    //     Label registerLabel = new Label("Registration");
    //     registerLabel.getStyleClass().add("judul1");
    //     registerLabel.relocate(290, 80);
        
    //     Rectangle rectangle = new Rectangle(600, 450);
    //     rectangle.setFill(Color.web("#1A28A3"));
    //     rectangle.setOpacity(0.50);
    //     rectangle.setStrokeWidth(2);
    //     rectangle.setLayoutX(70);
    //     rectangle.setLayoutY(65);

    //     Label fullnameInput = new Label("Full Name");
    //     fullnameInput.relocate(110, 155);
    //     fullnameInput.getStyleClass().add("judulInput");
    //     TextField tabelFullname = new TextField();
    //     tabelFullname.relocate(110, 175);
    //     tabelFullname.getStyleClass().add("tabelInput");

    //     Label usernameInput = new Label("Username");
    //     usernameInput.relocate(390, 155);
    //     usernameInput.getStyleClass().add("judulInput");
    //     TextField tabelUsername = new TextField();
    //     tabelUsername.relocate(390, 175);
    //     tabelUsername.getStyleClass().add("tabelInput");

    //     Label passwordInput = new Label("Password");
    //     passwordInput.relocate(390, 230);
    //     passwordInput.getStyleClass().add("judulInput");
    //     PasswordField tabelPassword = new PasswordField();
    //     tabelPassword.relocate(390, 250);
    //     tabelPassword.getStyleClass().add("tabelInput");

    //     Label phoneNumberInput = new Label("Phone Number");
    //     phoneNumberInput.relocate(110, 230);
    //     phoneNumberInput.getStyleClass().add("judulInput");
    //     TextField tabelPhonenumber = new TextField();
    //     tabelPhonenumber.relocate(110, 250);
    //     tabelPhonenumber.getStyleClass().add("tabelInput");

    //     Label rePasswordInput = new Label("Re-Password");
    //     rePasswordInput.relocate(250, 305);
    //     rePasswordInput.getStyleClass().add("judulInput");
    //     PasswordField tabelRepassword = new PasswordField();
    //     tabelRepassword.relocate(250, 325);
    //     tabelRepassword.getStyleClass().add("tabelInput");
        
    //     Label error1 = new Label();
    //     error1.getStyleClass().add("warning");
    //     error1.relocate(190, 300);

        // Image logoBack = new Image(getClass().getResourceAsStream("/Style/foto/home2.jpg"));
        // ImageView imageBack = new ImageView(logoBack);
        // imageBack.setPreserveRatio(true);
        // imageBack.setFitWidth(40);
        // imageBack.setFitHeight(40);
        // Button btnBack = new Button();
        // btnBack.setGraphic(imageBack);
        // btnBack.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
        // btnBack.relocate(75, 450);
        // btnBack.setOnAction(e -> stage.setScene(mainScene(stage)));

    //     Button signUp = new Button("Sign Up");
    //     signUp.getStyleClass().add("buttonLogin");
    //     signUp.relocate(275, 410);
    //     signUp.setOnAction(e -> {
    //         String fullname = tabelFullname.getText();
    //         String username = tabelUsername.getText();
    //         String password = tabelPassword.getText();
    //         String repassword = tabelRepassword.getText();
    //         String phonenumber = tabelPhonenumber.getText();

    //         if (fullname.isEmpty() || username.isEmpty() || password.isEmpty() || repassword.isEmpty() || phonenumber.isEmpty()) {
    //             error1.setText("Data must be required!");
    //             error1.relocate(305, 450);
    //             return;
    //         } if (UserControllers.validasiRegister(fullname, phonenumber, username, password, repassword)) {
    //             stage.setScene(registerSuccess(stage));
    //         } else {
    //             error1.setText("Registration Failed. Please check your data");}
    //             error1.relocate(247, 450);
    //     });

    //     Pane root = new Pane();
    //     root.getChildren().addAll(rectangle, signUp, btnBack, registerLabel, fullnameInput, tabelFullname, usernameInput, tabelUsername, passwordInput, tabelPassword, phoneNumberInput, tabelPhonenumber, rePasswordInput, tabelRepassword, error1);
    //     root.getStyleClass().add("background");
    //     Scene scene = new Scene(root, 740, 580);
    //     scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
    //     return scene;
    // }

    // private Scene registerSuccess(Stage stage) {
    //     Label success = new Label("Register Successful!");
    //     success.getStyleClass().add("judul1");
    //     success.relocate(230, 140);

    //     Rectangle rectangle = new Rectangle(550, 400);
    //     rectangle.setFill(Color.web("#1A28A3"));
    //     rectangle.setOpacity(0.50);
    //     rectangle.setStrokeWidth(2);
    //     rectangle.setLayoutX(95);
    //     rectangle.setLayoutY(90);

    //     Label deskripsi1 = new Label("Congratulation, your account has been");
    //     deskripsi1.getStyleClass().add("deskripsiRegister");
    //     deskripsi1.relocate(230, 250);
    //     Label deskripsi2 = new Label("successfully created");
    //     deskripsi2.getStyleClass().add("deskripsiRegister");
    //     deskripsi2.relocate(300, 273);

    //     Button buttonContinue = new Button("Continue");
    //     buttonContinue.getStyleClass().add("buttonLogin");
    //     buttonContinue.relocate(275, 400);
    //     buttonContinue.setOnAction(e -> stage.setScene(mainScene(stage)));

    //     Pane root = new Pane();
    //     root.getChildren().addAll(rectangle, success,deskripsi1, deskripsi2, buttonContinue);
    //     root.getStyleClass().add("background");
    //     Scene scene = new Scene(root, 740, 580);
    //     scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
    //     return scene;
    // }

    // private Scene historyScene(Stage stage) {
    //     Label judulHistory = new Label("Your LifesTyle History");
    //     judulHistory.getStyleClass().add("judul1");
    //     judulHistory.relocate(213, 30);

    //     Rectangle rectangle = new Rectangle(550, 400);
    //     rectangle.setFill(Color.web("#1A28A3"));
    //     rectangle.setOpacity(0.50);
    //     rectangle.setStrokeWidth(2);
    //     rectangle.setLayoutX(95);
    //     rectangle.setLayoutY(90);

    //     Image logoBack = new Image(getClass().getResourceAsStream("/Style/foto/home2.jpg"));
    //     ImageView imageBack = new ImageView(logoBack);
    //     imageBack.setPreserveRatio(true);
    //     imageBack.setFitWidth(75);
    //     imageBack.setFitHeight(75);
    //     Button btnBack = new Button();
    //     btnBack.setGraphic(imageBack);
    //     btnBack.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
    //     btnBack.relocate(322, 445);
    //     btnBack.setOnAction(e -> stage.setScene(loginScene(stage)));

    //     Pane root = new Pane();
    //     root.getChildren().addAll(rectangle, judulHistory, btnBack);
    //     root.getStyleClass().add("background");
    //     Scene scene = new Scene(root, 740, 580);
    //     scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
    //     return scene;
    // }

    // private Scene resultScane(Stage stage) {
    //     Label judulHistory = new Label("Your LifeStyle History");
    //     judulHistory.getStyleClass().add("judul1");
    //     judulHistory.relocate(190, 30);

    //     Rectangle rectangle = new Rectangle(550, 400);
    //     rectangle.setFill(Color.web("#1A28A3"));
    //     rectangle.setOpacity(0.50);
    //     rectangle.setStrokeWidth(2);
    //     rectangle.setLayoutX(95);
    //     rectangle.setLayoutY(90);
        
    //     Button buttonHome = new Button("Home");
    //     buttonHome.getStyleClass().add("buttonLogin");
    //     buttonHome.relocate(260, 450);
    //     buttonHome.setOnAction(e -> stage.setScene(loginScene(stage)));

    //     Pane root = new Pane();
    //     root.getChildren().addAll(rectangle, judulHistory, buttonHome);
    //     root.getStyleClass().add("background");
    //     Scene scene = new Scene(root, 740, 580);
    //     scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
    //     return scene;
    // }

    // private Scene inputScene(Stage stage) {
    //     Label input = new Label("How much water do you");
    //     input.getStyleClass().add("judul1");
    //     input.relocate(210, 40); 
        
    //     Label input2 = new Label("drink daily?");
    //     input2.getStyleClass().add("judul1");
    //     input2.relocate(309, 75); 
        
    //     Label input3 = new Label("How long do you exercise");
    //     input3.getStyleClass().add("judul1");
    //     input3.relocate(200, 220); 
        
    //     Label input4 = new Label("per week?");
    //     input4.getStyleClass().add("judul1");
    //     input4.relocate(300, 255); 
        
    //     Label input5 = new Label("How many hours do you sleep on");
    //     input5.getStyleClass().add("judul1");
    //     input5.relocate(130, 465); 
        
    //     Label input6 = new Label("average each night?");
    //     input6.getStyleClass().add("judul1");
    //     input6.relocate(220, 500); 
        
    //     Label input7 = new Label("How often do you eat");
    //     input7.getStyleClass().add("judul1");
    //     input7.relocate(220, 700); 
        
    //     Label input8 = new Label("junk food?");
    //     input8.getStyleClass().add("judul1");
    //     input8.relocate(295, 735); 
        
    //     Label input9 = new Label("How often do you eat or");
    //     input9.getStyleClass().add("judul1");
    //     input9.relocate(210, 870); 
        
    //     Label input10 = new Label("drink sugary foods?");
    //     input10.getStyleClass().add("judul1");
    //     input10.relocate(245, 905); 
        
    //     Label input11 = new Label("How often do you eat fruits");
    //     input11.getStyleClass().add("judul1");
    //     input11.relocate(185, 1045); 
        
    //     Label input12 = new Label("and vegetables?");
    //     input12.getStyleClass().add("judul1");
    //     input12.relocate(245, 1080); 
        
    //     Label input13 = new Label("Do you smoke?");
    //     input13.getStyleClass().add("judul1");
    //     input13.relocate(255, 1230); 

    //     // Membuat HBox untuk tombol
    //     HBox buttonBox = new HBox(35); 
    //     buttonBox.setLayoutX(30);
    //     buttonBox.setLayoutY(130); 
        
    //     HBox buttonBox2 = new HBox(35); 
    //     buttonBox2.setLayoutX(30); 
    //     buttonBox2.setLayoutY(310); 
        
    //     HBox buttonBox3 = new HBox(35); 
    //     buttonBox3.setLayoutX(30); 
    //     buttonBox3.setLayoutY(550); 
        
    //     HBox buttonBox4 = new HBox(35); 
    //     buttonBox4.setLayoutX(30); 
    //     buttonBox4.setLayoutY(785); 
        
    //     // HBox buttonBox5 = new HBox(35); 
    //     // buttonBox5.setLayoutX(30); 
    //     // buttonBox5.setLayoutY(960); 
        
    //     HBox buttonBox6 = new HBox(35); 
    //     buttonBox6.setLayoutX(30); 
    //     buttonBox6.setLayoutY(960); 
        
    //     HBox buttonBox7 = new HBox(30); 
    //     buttonBox7.setLayoutX(145); 
    //     buttonBox7.setLayoutY(1140); 

    //     // Membuat tombol
    //     Button option1 = new Button("Less than 1.5 L/day");
    //     option1.getStyleClass().add("buttonInput");
    
    //     Button option2 = new Button("1.5 L - 3 L/day");
    //     option2.getStyleClass().add("buttonInput");
    
    //     Button option3 = new Button("More than 3 L/day");
    //     option3.getStyleClass().add("buttonInput");
        
    
    //     Button option4 = new Button("Less than 1 hour");
    //     option4.getStyleClass().add("buttonInput");
    
    //     Button option5 = new Button("1-2 hours");
    //     option5.getStyleClass().add("buttonInput");
    
    //     Button option6 = new Button("2-3 hours");
    //     option6.getStyleClass().add("buttonInput");
        
    //     Button option7 = new Button("Never");
    //     option7.getStyleClass().add("buttonInput");
    //     option7.relocate(265, 380);
        
    //     Button option8 = new Button("Less than 3 hour");
    //     option8.getStyleClass().add("buttonInput");
        
    //     Button option9 = new Button("3-6 hours");
    //     option9.getStyleClass().add("buttonInput");
        
    //     Button option10 = new Button("6-9 hours");
    //     option10.getStyleClass().add("buttonInput");
        
    //     Button option11 = new Button("More  than 9 hours");
    //     option11.getStyleClass().add("buttonInput");
    //     option11.relocate(265, 620);
        
    //     Button option12 = new Button("Rarely");
    //     option12.getStyleClass().add("buttonInput");
        
    //     Button option13 = new Button("Never");
    //     option13.getStyleClass().add("buttonInput");
    
    //     Button option14 = new Button("Often");
    //     option14.getStyleClass().add("buttonInput");
        
    //     // Button option15 = new Button("Rarely");
    //     // option15.getStyleClass().add("buttonInput");
        
    //     // Button option16 = new Button("Never");
    //     // option16.getStyleClass().add("buttonInput");
    
    //     // Button option17 = new Button("Often");
    //     // option17.getStyleClass().add("buttonInput");
        
    //     Button option18 = new Button("Rarely");
    //     option18.getStyleClass().add("buttonInput");
        
    //     Button option19 = new Button("Never");
    //     option19.getStyleClass().add("buttonInput");
    
    //     Button option20 = new Button("Often");
    //     option20.getStyleClass().add("buttonInput");
        
    //     Button option21 = new Button("Yes");
    //     option21.getStyleClass().add("buttonInput");
        
    //     Button option22 = new Button("No");
    //     option22.getStyleClass().add("buttonInput");

    //     // Menambahkan tombol ke HBox
    //     buttonBox.getChildren().addAll(option1, option2, option3);
    //     buttonBox2.getChildren().addAll(option4, option5, option6);
    //     buttonBox3.getChildren().addAll(option8, option9, option10);
    //     buttonBox4.getChildren().addAll(option12, option13, option14);
    //     buttonBox6.getChildren().addAll(option18, option19, option20);
    //     buttonBox7.getChildren().addAll(option21, option22);

    //     Button buttonResult = new Button("Result");
    //     buttonResult.getStyleClass().add("buttonLogin");
    //     buttonResult.relocate(275, 1400);
    //     buttonResult.setOnAction(e -> stage.setScene(resultScane(stage)));
        
        // Pane root = new Pane();
        // root.getChildren().addAll(input, input2, buttonBox, input3, input4, buttonBox2, option7, input5, input6, buttonBox3, option11, input7, input8, buttonBox4, input9, input10, buttonBox5, input11, input12, buttonBox6, input13, buttonBox7, buttonResult);
        // root.getStyleClass().add("background");
        // root.setPrefWidth(740);
        // root.setPrefHeight(1500);
    
    //     ScrollPane scrollPane = new ScrollPane(root);
    //     // scrollPane.setFitToWidth(true);
    //     // scrollPane.setFitToHeight(true);
    
    //     // Image imageBackground = new Image(getClass().getResourceAsStream("/Style/foto/MyLifeStyle.jpg"));
    //     // ImageView imageViewBackground = new ImageView(imageBackground);
    //     // StackPane stackPane = new StackPane(scrollPane,imageViewBackground);
    
    //     Scene scene = new Scene(scrollPane, 740, 580);
    //     scene.getStylesheets().add(getClass().getResource("/Style/Style.css").toExternalForm());
    //     return scene;
    // }

    public static void main(String[] args) {
        launch();
    }

}
