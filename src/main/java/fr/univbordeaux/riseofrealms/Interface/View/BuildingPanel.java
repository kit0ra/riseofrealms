package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;

public class BuildingPanel extends ScrollPane {

    public BuildingPanel() {
        this.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        this.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        HBox buildingContainer = new HBox();
        buildingContainer.setSpacing(10);

        BuildingPanelItem panelItem = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem);

        this.setContent(buildingContainer);
    }
}