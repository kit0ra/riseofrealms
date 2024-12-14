package fr.univbordeaux.riseofrealms.manager;

import fr.univbordeaux.riseofrealms.buildings.AutomatedBuildingDecorator;
import fr.univbordeaux.riseofrealms.buildings.Building;
import fr.univbordeaux.riseofrealms.buildings.BuildingColorDecorator;
import fr.univbordeaux.riseofrealms.buildings.BuildingFactory;
import fr.univbordeaux.riseofrealms.buildings.DisasterResistantDecorator;
import fr.univbordeaux.riseofrealms.buildings.EnergySaverDecorator;
import fr.univbordeaux.riseofrealms.buildings.EnhancedProductionDecorator;
import fr.univbordeaux.riseofrealms.buildings.MultiYieldDecorator;
import fr.univbordeaux.riseofrealms.buildings.ReducedMaintenanceDecorator;
import fr.univbordeaux.riseofrealms.buildings.ResourceEfficiencyDecorator;
import fr.univbordeaux.riseofrealms.buildings.SimpleBuildingFactory;
import fr.univbordeaux.riseofrealms.buildings.SpeedBoostDecorator;
import fr.univbordeaux.riseofrealms.buildings.TimeReducerDecorator;

import java.util.ArrayList;
import java.util.List;

public class BuildingManager {
    private final List<Building> buildings; // List of buildings
    private final BuildingFactory buildingFactory; // Factory to create buildings
    private final ResourceManager resourceManager; // Link to the ResourceManager

    public BuildingManager(ResourceManager resourceManager) {
        this.buildings = new ArrayList<>();
        this.buildingFactory = new SimpleBuildingFactory();
        this.resourceManager = resourceManager;
        // this.buildingFactory = new BuildingFactory(); // Create an instance
    }

    // Add a building to the list
    public void addBuilding(Building building) {
        buildings.add(building);
        System.out.println(building.getName() + " has been added.");
    }

    // Create a building dynamically using the factory
    public Building createBuilding(String type) {
        try {
            // Example factory logic to create a building
            return buildingFactory.createBuilding(type);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return null; // Return null if creation fails
        }
    }

    // Enhance a building dynamically
    public void enhanceBuilding(Building building, String enhancementType, double value) {
        switch (enhancementType.toLowerCase()) {
            case "automated" -> building = new AutomatedBuildingDecorator(building);
            case "color" -> building = new BuildingColorDecorator(building, "Red"); // Example: adding color
            case "disaster_resistant" -> building = new DisasterResistantDecorator(building);
            case "energy_saver" -> building = new EnergySaverDecorator(building, value);
            case "enhanced_production" -> building = new EnhancedProductionDecorator(building);
            case "multi_yield" -> building = new MultiYieldDecorator(building);
            case "reduced_maintenance" -> building = new ReducedMaintenanceDecorator(building);
            case "resource_efficiency" -> building = new ResourceEfficiencyDecorator(building, value);
            case "speed_boost" -> building = new SpeedBoostDecorator(building, value);
            case "time_reducer" -> building = new TimeReducerDecorator(building, value);
            default -> throw new IllegalArgumentException("Unknown enhancement type: " + enhancementType);
        }
        System.out.println(building.getName() + " has been enhanced with " + enhancementType + ".");
    }

    // Operate all buildings
    public void operateBuildings() {
        for (Building building : buildings) {
            building.operate();

            // Simulate production and add resources
            if (building.getName().equalsIgnoreCase("Farm")) {
                resourceManager.addResource("food", 10);
            } else if (building.getName().equalsIgnoreCase("LumberMill")) {
                resourceManager.addResource("wood", 5);
            }
        }
    }

    public List<Building> getBuildings() {
        return new ArrayList<>(buildings); // Return a copy to avoid external modification
    }
}
