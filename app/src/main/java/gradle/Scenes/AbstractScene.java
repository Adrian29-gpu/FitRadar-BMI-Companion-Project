package gradle.Scenes;


import javafx.stage.Stage;

public abstract class AbstractScene {
    protected Stage stage = new Stage();

    public AbstractScene(Stage stage) {
        this.stage = stage;
    }

    public abstract void show();
}
