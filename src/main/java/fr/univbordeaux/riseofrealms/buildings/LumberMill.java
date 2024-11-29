package fr.univbordeaux.riseofrealms.buildings;

public class LumberMill extends Building {
    public LumberMill() {
        super("Lumber Mill", 15);
    }

    @Override
    protected void prepare() {
        System.out.println("Sharpening axes...");
    }

    @Override
    protected void produce() {
        System.out.println("Cutting logs...");
    }

    @Override
    protected void finish() {
        System.out.println("Stacking lumber.");
    }
}