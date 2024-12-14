package fr.univbordeaux.riseofrealms.Interface.Controller;

import fr.univbordeaux.riseofrealms.Interface.Model.Cell;
import fr.univbordeaux.riseofrealms.buildings.Building;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private static final int HEIGHT = 150;
    private static final int WIDTH = 150;
    private final Cell[][] grid;
    private final List<Building> buildingList;

    public GameMap() {
        this.grid = new Cell[HEIGHT][WIDTH];
        this.buildingList = new ArrayList<>();

        for (int row = 0; row < HEIGHT; row++) {
            for (int col = 0; col < WIDTH; col++) {
                this.grid[row][col] = new Cell();
            }
        }
    }

    public Boolean canPlaceBuilding(Building building, int row, int col) {
        // TO REFACTOR IN BUILDING HEIGHT + WIDTH
        int buildingSize = building.getSize();

        if(row < 0 || col < 0 || row + buildingSize > HEIGHT || col + buildingSize > WIDTH) {
            return false;
        }

        for(int r = row; r < row + buildingSize; r++) {
            for(int c = col; c < col + buildingSize; c++) {
                if(!grid[r][c].isEmpty()) {
                    return false;
                }
            }
        }

        return true;
    }

    public Boolean placeBuilding(Building building, int row, int col) {
        // TO REFACTOR IN BUILDING HEIGHT + WIDTH
        int buildingSize = building.getSize();

        if(!canPlaceBuilding(building, row, col)) {
            return false;
        }

        for(int r = row; r < row + buildingSize; r++) {
            for(int c = col; c < col + buildingSize; c++) {
                grid[r][c].setBuilding(building);
            }
        }
        buildingList.add(building);
        return true;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    // TODO LATER
//    public boolean removeBuilding(Building building, int row, int col) {
//
//    }

}
