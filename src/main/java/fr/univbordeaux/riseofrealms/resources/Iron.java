package fr.univbordeaux.riseofrealms.resources;

public class Iron extends Resource {
    public Iron(int quantity) {
        super("Iron", quantity);
    }

    @Override
    public void produce() {
        produceAndNotify(2); // ajouter 1 unité
    }

}
