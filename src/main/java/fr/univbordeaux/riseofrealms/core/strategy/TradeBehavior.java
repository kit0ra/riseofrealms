package fr.univbordeaux.riseofrealms.core.strategy;

import fr.univbordeaux.riseofrealms.people.Person;

public class TradeBehavior implements Behavior {
    @Override
    public void execute(Person person) {
        System.out.println(person.getName() + " is trading goods to generate income.");
    }
}
