package fr.univbordeaux.riseofrealms.manager;

import java.util.Scanner;

import fr.univbordeaux.riseofrealms.core.strategy.WorkBehavior;
import fr.univbordeaux.riseofrealms.people.Person;
import fr.univbordeaux.riseofrealms.people.Worker;
import fr.univbordeaux.riseofrealms.resources.ResourceType;

public class GameManager {
    private static GameManager instance;
    private ResourceManager resourceManager;
    private BuildingManager buildingManager;
    private PeopleManager peopleManager;
    private GridManager gridManager;
    private String playerName;

    private GameManager() {
        resourceManager = ResourceManager.getInstance();
        buildingManager = new BuildingManager(resourceManager);
        peopleManager = new PeopleManager();
        gridManager = new GridManager(5, 5, resourceManager); // Pass resourceManager to GridManager
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public ResourceManager getResourceManager() {
        return resourceManager;
    }

    public BuildingManager getBuildingManager() {
        return buildingManager;
    }

    public PeopleManager getPeopleManager() {
        return peopleManager;
    }

    public GridManager getGridManager() {
        return gridManager;
    }

    public void startGame() {
        initializePlayer();
        initializeGameWorld();
        displayGrid();

        System.out.println("Welcome to Rise of Realms, " + playerName + "!");
        System.out.println("The game begins now!");
    }

    private void initializePlayer() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            playerName = scanner.nextLine();
        }

        // Provide initial resources
        resourceManager.addResource("gold", 100);
        System.out.println("You have been given 100 gold to start!");

        // Provide initial characters
        Person worker = new Worker("Alice", 25);
        peopleManager.addPerson(worker);
        peopleManager.assignBehaviorToPerson(worker, new WorkBehavior());
    }

    private void initializeGameWorld() {
        System.out.println("Initializing game world...");
        spawnInitialResources();
        placeInitialPeople();
    }

    private void spawnInitialResources() {
        int initialResourceCount = 10; // Example: spawn 10 resources
        System.out.println("Spawning initial resources...");
        gridManager.spawnResources(initialResourceCount);
    }

    private void placeInitialPeople() {
        System.out.println("Placing initial characters...");
        // Example: Place worker on the grid
        Person worker = peopleManager.getAllPeople().get(0); // Assume the first person is the worker
        gridManager.placePerson(0, 0, worker); // Place worker at (0,0)
    }

    public void displayGrid() {
        System.out.println("Displaying the game grid...");
        gridManager.displayGrid();
    }

    public void performPlayerAction(String action) {
        switch (action.toLowerCase()) {
            case "gather" -> handleGatherAction();
            case "build" -> handleBuildAction();
            default -> System.out.println("Unknown action: " + action);
        }
    }

    private void handleGatherAction() {
        System.out.println("Executing gather action...");
        // Example: Assign worker to gather resources from a specific location
        // Add detailed implementation for gathering logic
    }

    private void handleBuildAction() {
        System.out.println("Executing build action...");
        // Example: Use BuildingManager to create a building
        // Add detailed implementation for building logic
    }
}
