package fr.univbordeaux.riseofrealms.resources;

public class Stone extends Resource {
    public Stone(int quantity) {
        super("Stone", quantity);
    }

    @Override
    public void produce() {
        produceAndNotify(2); // ajouter 2 unité
    }
}
