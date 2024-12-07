package fr.univbordeaux.riseofrealms.core.strategy;

import fr.univbordeaux.riseofrealms.people.Person;

public class ConsumeBehavior implements Behavior {
    @Override
    public void execute(Person person) {
        System.out.println(person.getName() + " is consuming resources.");
    }
}
