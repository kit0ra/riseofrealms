package fr.univbordeaux.riseofrealms;

import fr.univbordeaux.riseofrealms.manager.GameManager;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Initialize the game
        GameManager gameManager = GameManager.getInstance();
        gameManager.startGame();

        // Simulate player interaction
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. View Grid");
            System.out.println("2. Add Resources");
            System.out.println("3. Assign Work");
            System.out.println("4. Build Structure");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> gameManager.displayGrid();
                case 2 -> {
                    System.out.print("Enter resource type: ");
                    String resourceType = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    int amount = scanner.nextInt();
                    gameManager.getResourceManager().addResource(resourceType, amount);
                    System.out.println("Added " + amount + " " + resourceType + " to resources.");
                }
                case 3 -> {
                    System.out.println("Assigning work...");
                    // Example: Assign work to the first available person
                    gameManager.getPeopleManager().executeBehaviors();
                }
                case 4 -> {
                    System.out.println("Building structure...");
                    // Example: Add a building via BuildingManager
                    System.out.print("Enter building type (e.g., Farm): ");
                    String buildingType = scanner.nextLine();
                    System.out.print("Enter grid coordinates (row col): ");
                    int row = scanner.nextInt();
                    int col = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    var building = gameManager.getBuildingManager().createBuilding(buildingType);
                    if (building != null) { // Check if building creation was successful
                        gameManager.getGridManager().placeBuilding(row, col, building);
                        System.out.println(buildingType + " has been built at (" + row + ", " + col + ").");
                    } else {
                        System.out.println("Failed to create building. Please check the building type.");
                    }
                }
                case 5 -> {
                    System.out.println("Exiting game. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
