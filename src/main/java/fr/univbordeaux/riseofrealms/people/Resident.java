package fr.univbordeaux.riseofrealms.people;

public class Resident extends Person {
    public Resident(String name, int age) {
        super(name, age);
    }

    @Override
    public void performAction() {
        if (behavior != null) {
            behavior.execute(this); // Exécute le comportement assigné via le Strategy Pattern
        } else {
            System.out.println(name + " has no defined behavior.");
        }
    }

    @Override
    public void update(String resource, int quantity) {
        super.update(resource, quantity); // Appel du comportement générique
        if ("Food".equalsIgnoreCase(resource) && quantity < 10) {
            System.out.println(name + " is very worried: Food is critically low!");
        }
    }
}
