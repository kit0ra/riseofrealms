package fr.univbordeaux.riseofrealms.Interface.View;

import fr.univbordeaux.riseofrealms.Interface.Controller.GameController;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView {
    private final Stage primaryStage;
    private final ResourcePanel resourcePanel;
    private final GameArea gameArea;
    private final BuildingPanel buildingPanel;

    public MainView(Stage primaryStage, GameController gameController) {
        this.primaryStage = primaryStage;
        this.resourcePanel = new ResourcePanel(gameController);
        this.gameArea = new GameArea(gameController);
        this.buildingPanel = new BuildingPanel(gameController);
    }

    public void initialize() {
        BorderPane root = new BorderPane();
        root.setTop(resourcePanel);
        root.setCenter(gameArea);
        root.setBottom(buildingPanel);

        Scene scene = new Scene(root, 800, 600);

        // On ajoute ce css pour enlever la bordure bleue du focus
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());

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
