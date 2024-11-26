package fr.univbordeaux.riseofrealms.resources;

// ResourceFactory.java
public class ResourceFactory {
    public static Resource createResource(String resourceType, int quantity) {
        switch (resourceType.toLowerCase()) {
            case "food" -> {
                return new Food(quantity);
            }
            case "wood" -> {
                return new Wood(quantity);
            }
            case "stone" -> {
                return new Stone(quantity);
            }
            case "iron" -> {
                return new Iron(quantity);
            }
            case "coal" -> {
                return new Coal(quantity);
            }
            case "lumber" -> {
                return new Lumber(quantity);
            }
            case "steel" -> {
                return new Steel(quantity);
            }
            case "tools" -> {
                return new Tools(quantity);
            }
            case "cement" -> {
                return new Cement(quantity);
            }
            default -> throw new IllegalArgumentException("Unknown resource type: " + resourceType);
        }
    }
}
