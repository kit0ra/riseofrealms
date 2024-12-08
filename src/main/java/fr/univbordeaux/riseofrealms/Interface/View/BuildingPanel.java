package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

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