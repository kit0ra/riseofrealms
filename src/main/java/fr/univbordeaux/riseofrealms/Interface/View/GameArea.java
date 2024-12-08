package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.control.ScrollPane;

public class GameArea extends ScrollPane {
    private final GameGrid gameGrid;

    public GameArea() {
        this.gameGrid = new GameGrid();

        this.setContent(this.gameGrid);

        // permet de se déplacer avec la souris
        this.setPannable(true);
        this.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        this.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);

        this.setPrefViewportHeight(600);
        this.setPrefViewportWidth(800);
    }

    public GameGrid getGameGrid() {
        return gameGrid;
    }
}
