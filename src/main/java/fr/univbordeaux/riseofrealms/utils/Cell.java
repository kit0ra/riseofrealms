package fr.univbordeaux.riseofrealms.utils;

import fr.univbordeaux.riseofrealms.buildings.Building;
import fr.univbordeaux.riseofrealms.people.Person;
import fr.univbordeaux.riseofrealms.resources.Resource;

public class Cell {
    private Resource resource;
    private Building building;
    private Person person;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        if (building != null)
            return "B"; // Building
        if (resource != null)
            return "R"; // Resource
        if (person != null)
            return "P"; // Person
        return "."; // Empty
    }
}
