package fr.univbordeaux.riseofrealms.building;

public class DisasterResistantDecorator extends BuildingDecorator {
    public DisasterResistantDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    protected void prepare() {
        System.out.println("Fortifying " + decoratedBuilding.getName() + " against disasters.");
        decoratedBuilding.prepare();
    }

    @Override
    protected void produce() {
        decoratedBuilding.produce();
    }

    @Override
    protected void finish() {
        decoratedBuilding.finish();
        System.out.println(decoratedBuilding.getName() + " is now disaster-resistant.");
    }
}
