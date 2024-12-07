package fr.univbordeaux.riseofrealms.people;

public interface PersonFactory {
    Person createPerson(String type, String name, int age);
}
