package fr.univbordeaux.riseofrealms.buildings;

public class SpeedBoostDecorator extends BuildingDecorator {
    private final double speedMultiplier;

    public SpeedBoostDecorator(Building decoratedBuilding, double speedMultiplier) {
        super(decoratedBuilding);
        this.speedMultiplier = speedMultiplier;
    }

    @Override
    protected void prepare() {
        System.out.println("Boosting preparation speed for " + decoratedBuilding.getName() + " by " + speedMultiplier + "x.");
        decoratedBuilding.prepare();
    }

    @Override
    protected void produce() {
        System.out.println("Producing at " + speedMultiplier + "x speed for " + decoratedBuilding.getName());
        decoratedBuilding.produce();
    }

    @Override
    protected void finish() {
        System.out.println("Finishing at " + speedMultiplier + "x speed for " + decoratedBuilding.getName());
        decoratedBuilding.finish();
    }
}
