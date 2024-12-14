package fr.univbordeaux.riseofrealms.people;

public class Resident extends Person {
    public Resident(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(String resource, int quantity) {
        // Call the generic notification logic
        super.update(resource, quantity);

        // Specific resource handling logic for residents
        if ("Food".equalsIgnoreCase(resource) && quantity < 10) {
            System.out.println(name + " is very worried: Food is critically low!");
        }
    }

    @Override
    public String toString() {
        return "Resident: " + name + ", Age: " + age;
    }
}
