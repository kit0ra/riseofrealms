package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BuildingPanelItem extends VBox {
    private final Image buildingImage;

    public BuildingPanelItem(String buildingName) {
        this.buildingImage = new Image("/images/buildings/" + buildingName + ".png");
        ImageView buildingImageView = new ImageView(buildingImage);
        buildingImageView.setFitHeight(100);
        buildingImageView.setPreserveRatio(true);

        Text buildingNameText = new Text(buildingName);
        this.getChildren().addAll(buildingImageView, buildingNameText);

        this.setAlignment(javafx.geometry.Pos.CENTER);
    }
}