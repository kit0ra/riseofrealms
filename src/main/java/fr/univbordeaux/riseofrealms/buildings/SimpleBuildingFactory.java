package fr.univbordeaux.riseofrealms.buildings;

public class SimpleBuildingFactory implements BuildingFactory {
    @Override
    public Building createBuilding(String type) {
        return switch (type.toLowerCase()) {
            case "farm" -> new Farm();
            case "lumbermill" -> new LumberMill();
            default -> throw new IllegalArgumentException("Unknown building type: " + type);
        };
    }
}