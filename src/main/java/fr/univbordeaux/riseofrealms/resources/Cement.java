package fr.univbordeaux.riseofrealms.resources;

public class Cement extends Resource {
    public Cement(int quantity) {
        super("Cement", quantity);
    }

    @Override
    public void produce() {
        produceAndNotify(1); // ajouter 1 unité
    }
}
