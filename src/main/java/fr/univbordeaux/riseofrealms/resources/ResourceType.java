package fr.univbordeaux.riseofrealms.resources;

public enum ResourceType {
    FOOD(10),
    WOOD(5),
    STONE(8),
    IRON(15),
    COAL(12),
    LUMBER(7),
    STEEL(20),
    TOOLS(3),
    CEMENT(5),
    WEAPON(5);

    private final int threshold;

    ResourceType(int threshold) {
        this.threshold = threshold;
    }

    public int getThreshold() {
        return threshold;
    }
}
