package fr.univbordeaux.riseofrealms.Interface.View;

import fr.univbordeaux.riseofrealms.Interface.Controller.GameController;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class BuildingPanelItem extends VBox {
    private final Image buildingImage;
    private final String buildingName;
    private final GameController gameController;

    public BuildingPanelItem(String buildingName, GameController gameController) {
        this.buildingName = buildingName;
        this.gameController = gameController;
        this.buildingImage = new Image("/images/buildings/" + buildingName + ".png");
        ImageView buildingImageView = new ImageView(buildingImage);
        buildingImageView.setFitHeight(100);
        buildingImageView.setPreserveRatio(true);

        Text buildingNameText = new Text(buildingName.toUpperCase());
        this.getChildren().addAll(buildingImageView, buildingNameText);

        this.setAlignment(javafx.geometry.Pos.CENTER);
        this.setPrefHeight(150);

//        this.setOnMouseClicked(event -> {        )));});
        this.setOnMouseClicked(event->{
            gameController.setCurrentBuilding(this.buildingName);
            this.setBackground(new Background(new BackgroundFill(
                Color.LIGHTBLUE,
                CornerRadii.EMPTY,
                Insets.EMPTY)));

        });
    }

    public Image getBuildingImage() {
        return buildingImage;
    }

    public String getBuildingName() {
        return buildingName;
    }
}