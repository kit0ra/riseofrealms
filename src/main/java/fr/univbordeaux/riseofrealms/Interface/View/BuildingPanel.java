package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;

public class BuildingPanel extends ScrollPane {

    public BuildingPanel() {
        this.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        this.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        HBox buildingContainer = new HBox();
        buildingContainer.setSpacing(10);

        BuildingPanelItem panelItem = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem);

        BuildingPanelItem panelItem2 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem2);

        BuildingPanelItem panelItem3 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem3);

        BuildingPanelItem panelItem4 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem4);

        BuildingPanelItem panelItem5 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem5);

        BuildingPanelItem panelItem6 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem6);

        BuildingPanelItem panelItem7 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem7);

        BuildingPanelItem panelItem8 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem8);

        BuildingPanelItem panelItem9 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem9);

        BuildingPanelItem panelItem10 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem10);

        BuildingPanelItem panelItem11 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem11);

        BuildingPanelItem panelItem12 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem12);

        BuildingPanelItem panelItem13 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem13);

        BuildingPanelItem panelItem14 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem14);

        BuildingPanelItem panelItem15 = new BuildingPanelItem("house");
        buildingContainer.getChildren().add(panelItem15);

        buildingContainer.setStyle("-fx-padding: 10;");

        this.setFitToHeight(true);
        this.setFitToWidth(false);

        this.setContent(buildingContainer);
    }
}