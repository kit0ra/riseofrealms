package fr.univbordeaux.riseofrealms.people;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Méthode abstraite pour définir le comportement de l’habitant
    public abstract void performAction();
}

