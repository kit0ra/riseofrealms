package fr.univbordeaux.riseofrealms.people;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void performAction() {
        System.out.println(name + " is working to produce resources.");
    }
}
