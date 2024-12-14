package fr.univbordeaux.riseofrealms.Interface.View;

import fr.univbordeaux.riseofrealms.Interface.Controller.GameController;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;

public class BuildingPanel extends ScrollPane {
    GameController gameController;
    public BuildingPanel(GameController gameController) {
        this.gameController = gameController;
        this.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        this.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        HBox buildingContainer = new HBox();
        buildingContainer.setSpacing(10);

        BuildingPanelItem panelItem = new BuildingPanelItem("cabin", gameController);
        buildingContainer.getChildren().add(panelItem);

        BuildingPanelItem panelItem2 = new BuildingPanelItem("house", gameController);
        buildingContainer.getChildren().add(panelItem2);

        buildingContainer.setStyle("-fx-padding: 10;");

        this.setFitToHeight(true);
        this.setFitToWidth(false);

        this.setContent(buildingContainer);
    }
}