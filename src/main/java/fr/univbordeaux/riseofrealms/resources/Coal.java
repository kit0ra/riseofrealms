package fr.univbordeaux.riseofrealms.resources;

public class Coal extends Resource {
    public Coal(int quantity) {
        super("Coal", quantity);
    }

    @Override
    public void produce() {
        produceAndNotify(1); // ajouter 1 unité
    }

}
