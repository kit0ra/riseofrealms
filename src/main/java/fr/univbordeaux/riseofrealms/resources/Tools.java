package fr.univbordeaux.riseofrealms.resources;

public class Tools extends Resource {
    public Tools(int quantity) {
        super("Tools", quantity);
    }

    @Override
    public void produce() {
        produceAndNotify(1); // ajouter 1 unité
    }
}
