package fr.univbordeaux.riseofrealms.resources;

public class Lumber extends Resource {
    public Lumber(int quantity) {
        super("Lumber", quantity);
    }

    @Override
    public void produce() {
        produceAndNotify(3); // ajouter 3 unités
    }
}
