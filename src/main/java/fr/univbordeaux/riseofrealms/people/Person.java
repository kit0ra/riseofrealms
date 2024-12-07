package fr.univbordeaux.riseofrealms.people;

import fr.univbordeaux.riseofrealms.core.strategy.Behavior;
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

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void performAction() {
        if (behavior != null) {
            behavior.execute(this);
        } else {
            System.out.println(name + " has no behavior defined.");
        }
    }

    // Comportement par défaut de la méthode update
    @Override
    public void update(String resource, int quantity) {
        try {
            ResourceType resourceType = ResourceType.valueOf(resource.toUpperCase());
            int threshold = resourceType.getThreshold();

            if (quantity < threshold) {
                System.out.println(name + " noticed: " + resource + " is running low (" + quantity + ").");
            } else {
                System.out.println(name + " noticed a change in " + resource + ": new quantity = " + quantity);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(name + " noticed a change in an unknown resource (" + resource + "): " + quantity);
        }
    }

}
