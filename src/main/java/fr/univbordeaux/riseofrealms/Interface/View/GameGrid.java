package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import fr.univbordeaux.riseofrealms.Interface.Controller.GameController;

import java.awt.*;

public class GameGrid extends GridPane {
    private static final int TILE_SIZE = 32;
    private static final int HEIGHT = 150;
    private static final int WIDTH = 150;

    private final Rectangle[][] tiles = new Rectangle[WIDTH][HEIGHT];

    private final GameController gameController;

    public GameGrid(GameController gameController) {
        this.gameController = gameController;
        for (int row = 0; row < HEIGHT; row++) {
            for (int col = 0; col < WIDTH; col++) {
                Rectangle tile = new Rectangle(TILE_SIZE, TILE_SIZE);
                tile.setFill(Color.LIGHTGRAY);
                tile.setStroke(Color.BLACK);
                this.add(tile, col, row);

                tiles[col][row] = tile;

                int finalCol = col;
                int finalRow = row;
                tile.setOnMouseEntered(event -> gameController.mouseEnterCell(finalCol, finalRow));
                tile.setOnMouseExited(event -> gameController.mouseExitCell());
                tile.setOnMouseClicked(event -> {gameController.mouseClickCell(finalCol, finalRow);});
            }
        }
    }

    public Rectangle getTile(int row, int col) {
        return tiles[row][col];
    }

    public void setTileBackgroundImage(int row, int col, Image image) {
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(TILE_SIZE);
        imageView.setFitHeight(TILE_SIZE);
        this.tiles[row][col].setFill(new ImagePattern(image));
    }
}
