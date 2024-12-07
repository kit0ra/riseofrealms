package fr.univbordeaux.riseofrealms.core.strategy;

import fr.univbordeaux.riseofrealms.people.Person;

public class WorkBehavior implements Behavior {
    @Override
    public void execute(Person person) {
        System.out.println(person.getName() + " is working to produce resources.");
    }
}
