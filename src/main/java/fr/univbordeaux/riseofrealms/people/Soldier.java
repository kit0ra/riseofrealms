package fr.univbordeaux.riseofrealms.people;

public class Soldier extends Person {
    public Soldier(String name, int age) {
        super(name, age);
    }

    @Override
    public void performAction() {
        System.out.println(name + " is defending the realm.");
    }

    @Override
    public void update(String resource, int quantity) {
        if ("Weapons".equalsIgnoreCase(resource) && quantity < 5) {
            System.out.println(name + " is worried: Weapon stock is critically low (" + quantity + ").");
        } else {
            System.out.println(name + " noticed a change in " + resource + ": " + quantity);
        }
    }

}
