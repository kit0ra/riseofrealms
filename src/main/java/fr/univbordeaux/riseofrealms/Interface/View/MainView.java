package fr.univbordeaux.riseofrealms.Interface.View;

import fr.univbordeaux.riseofrealms.resources.ResourceManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainView extends Application{
    private ResourceManager resourceManager;

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Label label = new Label("Welcome to Rise of Realms");
        root.getChildren().add(label);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Rise of Realms");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
