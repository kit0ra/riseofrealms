package fr.univbordeaux.riseofrealms.building;

public class TimeReducerDecorator extends BuildingDecorator {
    private final double reductionPercentage;

    public TimeReducerDecorator(Building decoratedBuilding, double reductionPercentage) {
        super(decoratedBuilding);
        this.reductionPercentage = reductionPercentage;
    }

    @Override
    protected void prepare() {
        System.out.println("Reducing preparation time by " + reductionPercentage + "% for " + decoratedBuilding.getName());
        decoratedBuilding.prepare();
    }

    @Override
    protected void produce() {
        System.out.println("Reducing production time by " + reductionPercentage + "% for " + decoratedBuilding.getName());
        decoratedBuilding.produce();
    }

    @Override
    protected void finish() {
        System.out.println("Reducing finish time by " + reductionPercentage + "% for " + decoratedBuilding.getName());
        decoratedBuilding.finish();
    }
}
