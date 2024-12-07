package fr.univbordeaux.riseofrealms.resources;

public class Weapon extends Resource {
    public Weapon(int initialQuantity) {
        super("Weapon", initialQuantity);
    }

    @Override
    public void produce() {
        produceAndNotify(3); // ajouter 3 unités
    }
}
