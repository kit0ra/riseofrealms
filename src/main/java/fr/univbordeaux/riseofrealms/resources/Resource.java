package fr.univbordeaux.riseofrealms.resources;

public abstract class Resource {
    protected String name;
    protected int quantity;

    public Resource(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void consume(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Not enough " + name + " available!");
        }
    }

    public void add(int amount) {
        quantity += amount;
    }

    // Méthode abstraite pour produire de la ressource (comportement spécifique à chaque ressource)
    public abstract void produce();
}
