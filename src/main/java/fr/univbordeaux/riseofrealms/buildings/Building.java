package fr.univbordeaux.riseofrealms.buildings;

public abstract class Building {
    protected String name;
    protected int size;
    protected String imagePath;

    public Building(String name, int size, String imagePath) {
        this.name = name;
        this.size = size;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getImagePath() {
        return imagePath;
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
