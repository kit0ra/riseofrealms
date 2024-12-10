package fr.univbordeaux.riseofrealms.manager;

import fr.univbordeaux.riseofrealms.buildings.Building;
import fr.univbordeaux.riseofrealms.people.Person;
import fr.univbordeaux.riseofrealms.resources.Resource;
import fr.univbordeaux.riseofrealms.resources.ResourceFactory;
import fr.univbordeaux.riseofrealms.resources.ResourceType;
import fr.univbordeaux.riseofrealms.utils.Cell;

import java.util.Random;

public class GridManager {
    private final int rows;
    private final int cols;
    private final Cell[][] grid;
    private final ResourceManager resourceManager; // Add ResourceManager as a dependency

    public GridManager(int rows, int cols, ResourceManager resourceManager) {
        this.rows = rows;
        this.cols = cols;
        this.resourceManager = resourceManager; // Initialize ResourceManager
        this.grid = new Cell[rows][cols];

        // Initialize empty cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public void placeResource(int row, int col, Resource resource) {
        grid[row][col].setResource(resource);
    }

    public void placeBuilding(int row, int col, Building building) {
        grid[row][col].setBuilding(building);
    }

    public void placePerson(int row, int col, Person person) {
        grid[row][col].setPerson(person);
    }

    public void spawnResources(int count) {
        Random random = new Random();
        ResourceType[] resourceTypes = ResourceType.values(); // All available resource types

        for (int i = 0; i < count; i++) {
            int row = random.nextInt(rows);
            int col = random.nextInt(cols);

            // Generate a random resource type and quantity
            ResourceType randomType = resourceTypes[random.nextInt(resourceTypes.length)];
            int quantity = random.nextInt(10) + 1; // Quantity between 1 and 10

            // Create the resource
            Resource resource = ResourceFactory.createResource(randomType, quantity);

            // Place the resource on the grid
            placeResource(row, col, resource);

            // Add the resource type to ResourceManager (if not already present)
            resourceManager.addResource(randomType.name().toLowerCase(), 0); // Ensure it's tracked globally
        }
    }

    public void displayGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
