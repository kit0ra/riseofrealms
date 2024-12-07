package fr.univbordeaux.riseofrealms.people;

public class Merchant extends Person {
    public Merchant(String name, int age) {
        super(name, age);
    }

    @Override
    public void performAction() {
        System.out.println(name + " is trading goods and generating income.");
    }

    @Override
    public void update(String resource, int quantity) {
        if ("Gold".equalsIgnoreCase(resource) && quantity < 10) {
            System.out.println(name + " is concerned: Gold reserves are low (" + quantity + ").");
        } else {
            System.out.println(name + " noticed a change in " + resource + ": " + quantity);
        }
    }

}
