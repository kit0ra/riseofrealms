package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Map;

public class MainView {
    private final Stage primaryStage;
    private ResourcePanel resourcePanel;

    public MainView(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.resourcePanel = new ResourcePanel();
    }

    public void initialize() {
        BorderPane root = new BorderPane();
        root.setTop(resourcePanel);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rise of Realms");
        primaryStage.show();
    }

    public ResourcePanel getResourcePanel() {
        return resourcePanel;
    }
}
