package fr.univbordeaux.riseofrealms.resources;

public class Wood extends Resource {
    public Wood(int quantity) {
        super("Wood", quantity);
    }

    @Override
    public void produce() {
        quantity += 3;  //ajouter 3 unités
    }

}
