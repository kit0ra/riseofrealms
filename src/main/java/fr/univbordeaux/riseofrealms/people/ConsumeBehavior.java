package fr.univbordeaux.riseofrealms.strategy;

import fr.univbordeaux.riseofrealms.person.Person;

public class ConsumeBehavior implements Behavior {
    @Override
    public void execute(Person person) {
        System.out.println(person.getName() + " is consuming resources.");
    }
}
