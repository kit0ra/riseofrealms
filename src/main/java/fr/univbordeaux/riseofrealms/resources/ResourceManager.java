package fr.univbordeaux.riseofrealms.resources;

// ResourceManager.java
import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private static ResourceManager instance;

    // Store resource counts (or states)
    private final Map<String, Integer> resources;

    private ResourceManager() {
        resources = new HashMap<>();
        // Initialize default resource counts
        resources.put("food", 0);
        resources.put("wood", 0);
        resources.put("stone", 0);
        resources.put("iron", 0);
        resources.put("coal", 0);
        resources.put("lumber", 0);
        resources.put("steel", 0);
        resources.put("tools", 0);
        resources.put("cement", 0);
    }

    // Singleton instance getter
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

    // Methods to manage resources
    public void addResource(String resourceType, int amount) {
        resources.put(resourceType, resources.getOrDefault(resourceType, 0) + amount);
    }

    public void removeResource(String resourceType, int amount) {
        resources.put(resourceType, Math.max(0, resources.getOrDefault(resourceType, 0) - amount));
    }

    public int getResourceCount(String resourceType) {
        return resources.getOrDefault(resourceType, 0);
    }
}
