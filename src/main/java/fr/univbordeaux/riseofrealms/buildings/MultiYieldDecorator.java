package fr.univbordeaux.riseofrealms.buildings;

public class MultiYieldDecorator extends BuildingDecorator {
    public MultiYieldDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    protected void prepare() {
        decoratedBuilding.prepare();
    }

    @Override
    protected void produce() {
        decoratedBuilding.produce();
        System.out.println("Producing additional yield for " + decoratedBuilding.getName());
    }

    @Override
    protected void finish() {
        decoratedBuilding.finish();
    }
}
