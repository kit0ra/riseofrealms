package fr.univbordeaux.riseofrealms.resources;

public class ResourceFactory {
    public static Resource createResource(ResourceType resourceType, int quantity) {
        return switch (resourceType) {
            case FOOD -> new Food(quantity);
            case WOOD -> new Wood(quantity);
            case STONE -> new Stone(quantity);
            case IRON -> new Iron(quantity);
            case COAL -> new Coal(quantity);
            case LUMBER -> new Lumber(quantity);
            case STEEL -> new Steel(quantity);
            case TOOLS -> new Tools(quantity);
            case CEMENT -> new Cement(quantity);
            case WEAPON -> new Weapon(quantity); // Support for new resources
        };
    }
}
