package fr.univbordeaux.riseofrealms.buildings;

public class Cabin extends Building {
    public Cabin() {
        super("Cabin", 1, "/images/buildings/cabin.png"); // Nom et taille & image
    }

    @Override
    protected void prepare() {
        System.out.println("Plowing fields...");
    }

    @Override
    protected void produce() {
        System.out.println("Producing wood...");
        System.out.println("Producing food...");
    }

    @Override
    protected void finish() {
        System.out.println("Harvesting crops.");
    }
}