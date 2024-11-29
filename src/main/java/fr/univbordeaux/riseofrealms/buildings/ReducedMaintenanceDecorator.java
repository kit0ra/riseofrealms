package fr.univbordeaux.riseofrealms.buildings;

public class ReducedMaintenanceDecorator extends BuildingDecorator {
    public ReducedMaintenanceDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    protected void produce() {
        System.out.println("Reducing maintenance costs for " + decoratedBuilding.getName());
        decoratedBuilding.produce(); // Déléguer au bâtiment d'origine
    }
}
