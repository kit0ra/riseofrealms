package fr.univbordeaux.riseofrealms.people;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void update(String resource, int quantity) {
        // Call the generic notification logic
        super.update(resource, quantity);

        // Specific resource handling logic for workers
        if ("Wood".equalsIgnoreCase(resource) && quantity < 5) {
            System.out.println(name + " is struggling: Not enough Wood for production!");
        }
    }

    @Override
    public String toString() {
        return "Worker: " + name + ", Age: " + age;
    }
}
