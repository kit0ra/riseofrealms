package fr.univbordeaux.riseofrealms.people;

public class SimplePersonFactory implements PersonFactory {
    @Override
    public Person createPerson(String type, String name, int age) {
        return switch (type.toLowerCase()) {
            case "worker" -> new Worker(name, age);
            case "resident" -> new Resident(name, age);
            default -> throw new IllegalArgumentException("Unknown person type: " + type);
        };
    }
}
