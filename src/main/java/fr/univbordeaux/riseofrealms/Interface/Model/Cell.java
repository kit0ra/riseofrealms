package fr.univbordeaux.riseofrealms.Interface.Model;

import fr.univbordeaux.riseofrealms.buildings.Building;

public class Cell {
    private Building building;

    public Cell(){
        this.building = null;
    }

    public Boolean isEmpty(){
        return this.building == null;
    }

    public void setBuilding(Building building){
        this.building = building;
    }

    public Building getBuilding(){
        return this.building;
    }

    public void clear(){
        this.building = null;
    }
}
