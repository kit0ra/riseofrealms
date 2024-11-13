package fr.univbordeaux.riseofrealms.resources;

public class Food extends Resource {
    public Food(int quantity) {
        super("Food", quantity);
    }

    @Override
    public void produce() {
        quantity += 5;  //ajouter 5 unités
    }

}
