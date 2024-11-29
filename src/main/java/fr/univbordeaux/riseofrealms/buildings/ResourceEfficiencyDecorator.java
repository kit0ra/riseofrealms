package fr.univbordeaux.riseofrealms.buildings;

public class ResourceEfficiencyDecorator extends BuildingDecorator {
    private final double efficiencyPercentage;

    public ResourceEfficiencyDecorator(Building decoratedBuilding, double efficiencyPercentage) {
        super(decoratedBuilding);
        this.efficiencyPercentage = efficiencyPercentage;
    }

    @Override
    protected void prepare() {
        System.out.println("Optimizing resource usage by " + efficiencyPercentage + "% for " + decoratedBuilding.getName());
        decoratedBuilding.prepare();
    }

    @Override
    protected void produce() {
        System.out.println("Producing resources with reduced cost for " + decoratedBuilding.getName());
        decoratedBuilding.produce();
    }

    @Override
    protected void finish() {
        decoratedBuilding.finish();
    }
}
