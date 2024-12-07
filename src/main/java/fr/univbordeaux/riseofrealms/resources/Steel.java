package fr.univbordeaux.riseofrealms.resources;

public class Steel extends Resource {
    public Steel(int quantity) {
        super("Steel", quantity);
    }

    @Override
    public void produce() {
        produceAndNotify(1); // ajouter 1 unité
    }

}
