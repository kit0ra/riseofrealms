package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameGrid extends GridPane {
    private static final int TILE_SIZE = 32;
    private static final int HEIGHT = 150;
    private static final int WIDTH = 150;

    public GameGrid() {
        for (int row = 0; row < HEIGHT; row++) {
            for (int col = 0; col < WIDTH; col++) {
                Rectangle tile = new Rectangle(TILE_SIZE, TILE_SIZE);
                tile.setFill(Color.LIGHTGRAY);
                tile.setStroke(Color.BLACK);
                this.add(tile, col, row);

                tile.setOnMouseEntered(event -> handleTileHover(tile));
                tile.setOnMouseExited(event -> handleTileExit(tile));
            }
        }
    }
    //todo PUT IT IN CONTROLLER
    private void handleTileHover(Rectangle tile) {
        tile.setFill(Color.LIGHTGREEN);
    }
    private void handleTileExit(Rectangle tile) {
        tile.setFill(Color.LIGHTGRAY);
    }
}
