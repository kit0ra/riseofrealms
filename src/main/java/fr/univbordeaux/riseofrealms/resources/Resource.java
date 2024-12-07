package fr.univbordeaux.riseofrealms.resources;

import fr.univbordeaux.riseofrealms.core.observer.Observable;

public abstract class Resource extends Observable {
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
            notifyObservers(name, quantity); // Notifie les observateurs après la consommation
        } else {
            System.out.println("Not enough " + name + " available!");
        }
    }

    public void add(int amount) {
        quantity += amount;
        notifyObservers(name, quantity); // Notifie les observateurs après l'ajout
    }

    // Méthode utilitaire pour produire et notifier
    protected void produceAndNotify(int amount) {
        System.out.println("Producing " + name + "...");
        add(amount); // Utilise la méthode `add` pour notifier les observateurs
    }

    // Méthode abstraite pour produire de la ressource (comportement spécifique à
    // chaque ressource)
    public abstract void produce();
}
