package fr.univbordeaux.riseofrealms.person;

import fr.univbordeaux.riseofrealms.strategy.Behavior;

public abstract class Person {
    protected String name;
    protected int age;
    protected Behavior behavior;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
