package fr.univbordeaux.riseofrealms.building;

public class EnergySaverDecorator extends BuildingDecorator {
    private final double energyReductionPercentage;

    public EnergySaverDecorator(Building decoratedBuilding, double energyReductionPercentage) {
        super(decoratedBuilding);
        this.energyReductionPercentage = energyReductionPercentage;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing with energy-saving mode for " + decoratedBuilding.getName());
        decoratedBuilding.prepare();
    }

    @Override
    protected void produce() {
        System.out.println("Producing with " + energyReductionPercentage + "% less energy for " + decoratedBuilding.getName());
        decoratedBuilding.produce();
    }

    @Override
    protected void finish() {
        decoratedBuilding.finish();
    }
}
