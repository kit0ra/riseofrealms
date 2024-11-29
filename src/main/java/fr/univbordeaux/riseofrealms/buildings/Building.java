package fr.univbordeaux.riseofrealms.buildings;

public abstract class Building {
    protected String name;
    protected int size;

    public Building(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    // Méthode template
    public void operate() {
        prepare();
        produce();
        finish();
    }

    // Étapes spécifiques (implémentées dans les sous-classes)
    protected abstract void prepare();
    protected abstract void produce();
    protected abstract void finish();
}
