package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView {
    private final Stage primaryStage;
    private final ResourcePanel resourcePanel;
    private final GameArea gameArea;
    private final BuildingPanel buildingPanel;

    public MainView(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.resourcePanel = new ResourcePanel();
        this.gameArea = new GameArea();
        this.buildingPanel = new BuildingPanel();
    }

    public void initialize() {
        BorderPane root = new BorderPane();
        root.setTop(resourcePanel);
        root.setCenter(gameArea);
        root.setBottom(buildingPanel);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rise of Realms");
        primaryStage.show();
    }

    public ResourcePanel getResourcePanel() {
        return resourcePanel;
    }

    public GameArea getGameArea() {
        return gameArea;
    }
}
