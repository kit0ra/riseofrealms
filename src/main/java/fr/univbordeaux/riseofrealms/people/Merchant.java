package fr.univbordeaux.riseofrealms.people;

public class Merchant extends Person {
    public Merchant(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(String resource, int quantity) {
        // Call the generic notification logic
        super.update(resource, quantity);

        // Specific resource handling logic for merchants
        if ("Gold".equalsIgnoreCase(resource) && quantity < 10) {
            System.out.println(name + " is concerned: Gold reserves are low (" + quantity + ").");
        }
    }

    @Override
    public String toString() {
        return "Merchant: " + name + ", Age: " + age;
    }
}
