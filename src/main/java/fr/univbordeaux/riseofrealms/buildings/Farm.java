package fr.univbordeaux.riseofrealms.building;

public class Farm extends Building {
    public Farm() {
        super("Farm", 10); // Nom et taille
    }

    @Override
    protected void prepare() {
        System.out.println("Plowing fields...");
    }

    @Override
    protected void produce() {
        System.out.println("Producing food...");
    }

    @Override
    protected void finish() {
        System.out.println("Harvesting crops.");
    }
}
