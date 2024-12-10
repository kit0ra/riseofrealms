package fr.univbordeaux.riseofrealms.manager;

import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private static ResourceManager instance;

    private final Map<String, Integer> resources;
    private final Map<String, Integer> thresholds; // Thresholds for resources

    private ResourceManager() {
        resources = new HashMap<>();

        // Initialize thresholds
        thresholds = new HashMap<>();
        thresholds.put("FOOD", 10);
        thresholds.put("WOOD", 5);
        thresholds.put("STONE", 8);
        thresholds.put("IRON", 15);
        thresholds.put("COAL", 12);
        thresholds.put("LUMBER", 6);
        thresholds.put("STEEL", 20);
        thresholds.put("TOOLS", 4);
        thresholds.put("CEMENT", 10);
        thresholds.put("WEAPON", 3);
    }

    public static ResourceManager getInstance() {
        if (instance == null) {
            synchronized (ResourceManager.class) {
                if (instance == null) {
                    instance = new ResourceManager();
                }
            }
        }
        return instance;
    }

    public void addResource(String resourceType, int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        resources.put(resourceType.toUpperCase(), resources.getOrDefault(resourceType.toUpperCase(), 0) + amount);
    }

    public void removeResource(String resourceType, int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        resources.put(resourceType.toUpperCase(),
                Math.max(0, resources.getOrDefault(resourceType.toUpperCase(), 0) - amount));
    }

    public int getResourceCount(String resourceType) {
        return resources.getOrDefault(resourceType.toUpperCase(), 0);
    }

    public Map<String, Integer> getAllResources() {
        return new HashMap<>(resources); // Return a copy to avoid external modification
    }

    public int getThreshold(String resourceType) {
        return thresholds.getOrDefault(resourceType.toUpperCase(), Integer.MAX_VALUE); // Default: no threshold
    }

    public Map<String, Integer> getAllThresholds() {
        return new HashMap<>(thresholds); // Return a copy to avoid external modification
    }
}
