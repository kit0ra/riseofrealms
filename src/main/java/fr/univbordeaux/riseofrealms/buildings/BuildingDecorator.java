package fr.univbordeaux.riseofrealms.buildings;

public abstract class BuildingDecorator extends Building {
    protected Building decoratedBuilding;

    public BuildingDecorator(Building decoratedBuilding) {
        super(decoratedBuilding.getName(), decoratedBuilding.getSize());
        this.decoratedBuilding = decoratedBuilding;
    }

    @Override
    protected void prepare() {
        decoratedBuilding.prepare(); // Par défaut, déléguer
    }

    @Override
    protected void produce() {
        decoratedBuilding.produce(); // Par défaut, déléguer
    }

    @Override
    protected void finish() {
        decoratedBuilding.finish(); // Par défaut, déléguer
    }
}
