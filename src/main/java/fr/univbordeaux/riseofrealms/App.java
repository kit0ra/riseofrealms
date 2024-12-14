package fr.univbordeaux.riseofrealms;

import fr.univbordeaux.riseofrealms.manager.GameManager;

import java.util.InputMismatchException;
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

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine(); // Clear invalid input
                continue; // Restart the loop
            }

            switch (choice) {
                case 1 -> gameManager.displayGrid();
                case 2 -> {
                    System.out.print("Enter resource type: ");
                    String resourceType = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    int amount;
                    try {
                        amount = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        gameManager.getResourceManager().addResource(resourceType, amount);
                        System.out.println("Added " + amount + " " + resourceType + " to resources.");
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid amount. Please enter a valid number.");
                        scanner.nextLine(); // Clear invalid input
                    }
                }
                case 3 -> {
                    System.out.println("Assigning work...");
                    gameManager.getPeopleManager().executeBehaviors();
                }
                case 4 -> {
                    System.out.println("Building structure...");
                    System.out.print("Enter building type (e.g., Farm): ");
                    String buildingType = scanner.nextLine();
                    System.out.print("Enter grid coordinates (row col): ");
                    try {
                        int row = scanner.nextInt();
                        int col = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        var building = gameManager.getBuildingManager().createBuilding(buildingType);
                        if (building != null) {
                            gameManager.getGridManager().placeBuilding(row, col, building);
                            System.out.println(buildingType + " has been built at (" + row + ", " + col + ").");
                        } else {
                            System.out.println("Failed to create building. Please check the building type.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid coordinates. Please enter valid numbers for row and column.");
                        scanner.nextLine(); // Clear invalid input
                    }
                }
                case 5 -> {
                    System.out.println("Exiting game. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
