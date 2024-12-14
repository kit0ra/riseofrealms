package fr.univbordeaux.riseofrealms.manager;

import fr.univbordeaux.riseofrealms.core.strategy.Behavior;
import fr.univbordeaux.riseofrealms.people.Person;
import java.util.ArrayList;
import java.util.List;

public class PeopleManager {
    private final List<Person> people;

    public PeopleManager() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
        System.out.println(person.getName() + " has been added.");
    }

    public void removePerson(Person person) {
        people.remove(person);
        System.out.println(person.getName() + " has been removed.");
    }

    public List<Person> getAllPeople() {
        return new ArrayList<>(people); // Return a copy to avoid direct modification
    }

    public void assignBehaviorToPerson(Person person, Behavior behavior) {
        person.assignBehavior(behavior);
    }

    public void executeBehaviors() {
        for (Person person : people) {
            person.executeBehavior();
        }
    }
}
