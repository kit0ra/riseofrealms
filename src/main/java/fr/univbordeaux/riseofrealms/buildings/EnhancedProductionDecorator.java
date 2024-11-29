package fr.univbordeaux.riseofrealms.buildings;

public class EnhancedProductionDecorator extends BuildingDecorator {
    public EnhancedProductionDecorator(Building decoratedBuilding) {
        super(decoratedBuilding);
    }

    @Override
    protected void prepare() {
        // Ajouter une étape supplémentaire à la préparation
        System.out.println("Enhanced preparation for " + decoratedBuilding.getName());
        decoratedBuilding.prepare(); // Délégation à l'objet décoré
    }

    @Override
    protected void produce() {
        // Ajouter un comportement spécifique avant la production
        System.out.println("Boosting production for " + decoratedBuilding.getName());
        decoratedBuilding.produce(); // Délégation à l'objet décoré
    }

    @Override
    protected void finish() {
        // Ajouter un comportement spécifique après la production
        decoratedBuilding.finish(); // Délégation à l'objet décoré
        System.out.println("Finalizing enhanced production for " + decoratedBuilding.getName());
    }
}
