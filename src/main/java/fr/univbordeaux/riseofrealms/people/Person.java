package fr.univbordeaux.riseofrealms.people;

import fr.univbordeaux.riseofrealms.core.strategy.Behavior;
import fr.univbordeaux.riseofrealms.manager.ResourceManager;
import fr.univbordeaux.riseofrealms.resources.ResourceType;
import fr.univbordeaux.riseofrealms.core.observer.Observer;

public abstract class Person implements Observer {
    protected String name;
    protected int age;
    protected Behavior behavior;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // Assign a new behavior dynamically
    public void assignBehavior(Behavior behavior) {
        this.behavior = behavior;
        System.out.println(name + " has been assigned a new behavior: " + behavior.getClass().getSimpleName());
    }

    // Execute the current behavior
    public void executeBehavior() {
        if (behavior != null) {
            behavior.execute(this);
        } else {
            System.out.println(name + " has no behavior assigned!");
        }
    }

    // Comportement par défaut de la méthode update
    @Override
    public void update(String resource, int quantity) {
        ResourceManager resourceManager = ResourceManager.getInstance(); // Access the singleton instance
        int threshold = resourceManager.getThreshold(resource);

        if (quantity < threshold) {
            System.out.println(name + " noticed: " + resource + " is running low (" + quantity + ").");
        } else {
            System.out.println(name + " noticed a change in " + resource + ": new quantity = " + quantity);
        }
    }

}
