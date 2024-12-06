package fr.univbordeaux.riseofrealms.person;

import fr.univbordeaux.riseofrealms.observer.Observer;

public class Resident extends Person implements Observer {
    public Resident(String name, int age) {
        super(name, age);
    }

    @Override
    public void performAction() {
        System.out.println(name + " is consuming resources.");
    }

    @Override
    public void update(String resource, int quantity) {
        System.out.println(name + " noticed that " + resource + " changed to " + quantity);
    }
}
