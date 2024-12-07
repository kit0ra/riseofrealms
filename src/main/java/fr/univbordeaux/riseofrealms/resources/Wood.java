package fr.univbordeaux.riseofrealms.resources;

public class Wood extends Resource {
    public Wood(int quantity) {
        super("Wood", quantity);
    }

    @Override
    public void produce() {
        produceAndNotify(3); // ajouter 3 unités
    }

}
