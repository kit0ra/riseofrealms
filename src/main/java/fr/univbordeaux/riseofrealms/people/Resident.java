package fr.univbordeaux.riseofrealms.people;

public class Resident extends Person {
    public Resident(String name, int age) {
        super(name, age);
    }

    @Override
    public void performAction() {
        System.out.println(name + " is consuming resources.");
    }
}