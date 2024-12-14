package fr.univbordeaux.riseofrealms.Interface.Controller;

import fr.univbordeaux.riseofrealms.Interface.View.GameGrid;
import fr.univbordeaux.riseofrealms.Interface.View.MainView;
import fr.univbordeaux.riseofrealms.Interface.View.ResourcePanel;
import fr.univbordeaux.riseofrealms.buildings.Building;
import fr.univbordeaux.riseofrealms.buildings.Cabin;
import fr.univbordeaux.riseofrealms.buildings.House;
import fr.univbordeaux.riseofrealms.manager.GameManager;
import fr.univbordeaux.riseofrealms.manager.ResourceManager;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.*;

public class GameController {

    private final ResourceManager resourceManager;
    private final MainView mainView;
    private final GameMap map;
    private GameManager gameManager;

    private Building currentBuilding;

    private Set<Rectangle> coulouredTilesList = new LinkedHashSet<>();

    public GameController(ResourceManager resourceManager, Stage primaryStage) {

        this.gameManager = GameManager.getInstance();

        MainView mainView = new MainView(primaryStage, this);
        mainView.initialize();

        this.resourceManager = resourceManager;
        this.mainView = mainView;
        this.map = new GameMap();
        this.currentBuilding = null;
    }

    public void initialize() {
        ResourcePanel resourcePanel = mainView.getResourcePanel();

        updateResourcePanel(resourcePanel);

        resourceManager.addResource("food", 50);
        resourceManager.addResource("wood", 15);
        resourceManager.addResource("stone", 15);

        updateResourcePanel(resourcePanel);
    }

    private void updateResourcePanel(ResourcePanel resourcePanel) {
        Map<String, Integer> resources = new HashMap<>();

        for (String resource: new String[]{"food", "wood", "stone", "iron", "coal", "lumber", "steel", "tools", "cement"}) {
            resources.put(resource, resourceManager.getResourceCount(resource));
        }

        resourcePanel.updateResources(resources);
    }

    public void setCurrentBuilding(String buildingName) {
        switch (buildingName){
            case "house":
                this.currentBuilding = new House();
                break;
            case "cabin":
                this.currentBuilding = new Cabin();
                break;
        }
    }

    public void mouseEnterCell(int row, int col) {
        if (this.currentBuilding != null) {
            GameGrid grid = this.mainView.getGameArea().getGameGrid();
            coulouredTilesList.clear(); // Clear previously colored tiles to avoid duplicates

            // Iterate over the building's area
            for (int r = 0; r < this.currentBuilding.getSize(); r++) {
                for (int c = 0; c < this.currentBuilding.getSize(); c++) {
                    int targetRow = row + r;
                    int targetCol = col + c;

                    // Check if the tile is within grid bounds
                    if (targetRow >= 0 && targetRow < map.getHEIGHT() && targetCol >= 0 && targetCol < map.getWIDTH()) {
                        Rectangle tile = grid.getTile(targetRow, targetCol);

                        // Determine the color based on placement validity
                        if (map.canPlaceBuilding(this.currentBuilding, row, col)) {
                            tile.setFill(Color.LIGHTGREEN); // Valid placement
                        } else {
                            tile.setFill(Color.LIGHTCORAL); // Invalid placement
                        }

                        coulouredTilesList.add(tile); // Track the tile
                    }
                }
            }
        }
    }

    public void mouseExitCell() {
        Iterator<Rectangle> iterator = coulouredTilesList.iterator();
        while(iterator.hasNext()){
            Rectangle tile = iterator.next();
            tile.setFill(Color.LIGHTGRAY);
            iterator.remove();
        }
    }

    public void mouseClickCell(int row, int col) {
        if(this.currentBuilding != null && map.canPlaceBuilding(this.currentBuilding, row, col)){
            mouseExitCell();
            map.placeBuilding(this.currentBuilding, row, col);
            gameManager.getBuildingManager().addBuilding(this.currentBuilding);

            Image[][] splitedImage = ImageSplitter.splitImages(new Image(this.currentBuilding.getImagePath()), this.currentBuilding.getSize(), this.currentBuilding.getSize());

            for(int r = 0; r < this.currentBuilding.getSize(); r++){
                for(int c = 0; c < this.currentBuilding.getSize(); c++){
                    int targetRow = row + r;
                    int targetCol = col + c;

                    if (targetRow >= 0 && targetRow < map.getHEIGHT() && targetCol >= 0 && targetCol < map.getWIDTH()) {
//                        Rectangle tile = mainView.getGameArea().getGameGrid().getTile(targetRow, targetCol);
                        mainView.getGameArea().getGameGrid().setTileBackgroundImage(targetRow, targetCol, splitedImage[r][c]);
                    }
                }
            }

            this.currentBuilding = null;
        }
    }
}
