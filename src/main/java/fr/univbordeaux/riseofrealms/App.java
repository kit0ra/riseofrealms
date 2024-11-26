package fr.univbordeaux.riseofrealms;

import fr.univbordeaux.riseofrealms.resources.ResourceManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Access the singleton instance
        ResourceManager resourceManager = ResourceManager.getInstance();

        // Add resources
        resourceManager.addResource("food", 10);
        resourceManager.addResource("wood", 15);

        // Retrieve resource count
        System.out.println("Food count: " + resourceManager.getResourceCount("food"));
        System.out.println("Wood count: " + resourceManager.getResourceCount("wood"));

        // Remove resources
        resourceManager.removeResource("wood", 5);
        System.out.println("Wood count after removal: " + resourceManager.getResourceCount("wood"));

    }
}
