package fr.univbordeaux.riseofrealms.building;

public class BuildingColorDecorator extends BuildingDecorator {
    private String color;

    public BuildingColorDecorator(Building decoratedBuilding, String color) {
        super(decoratedBuilding);
        this.color = color;
    }

    @Override
    protected void prepare() {
        System.out.println("Coloring " + decoratedBuilding.getName() + " with " + color + " during preparation.");
        decoratedBuilding.prepare();
    }

    @Override
    protected void produce() {
        decoratedBuilding.produce();
    }

    @Override
    protected void finish() {
        decoratedBuilding.finish();
        System.out.println("Applying final touches with " + color + " to " + decoratedBuilding.getName());
    }
}
