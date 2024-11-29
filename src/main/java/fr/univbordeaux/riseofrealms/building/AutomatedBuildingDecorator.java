package fr.univbordeaux.riseofrealms.building;

public class AutomatedBuildingDecorator extends BuildingDecorator {
    public AutomatedBuildingDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    protected void prepare() {
        System.out.println("Automating preparation for " + decoratedBuilding.getName());
        decoratedBuilding.prepare();
    }

    @Override
    protected void produce() {
        System.out.println("Running automated production for " + decoratedBuilding.getName());
        decoratedBuilding.produce();
    }

    @Override
    protected void finish() {
        System.out.println("Automating finalization for " + decoratedBuilding.getName());
        decoratedBuilding.finish();
    }
}
