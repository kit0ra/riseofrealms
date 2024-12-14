package fr.univbordeaux.riseofrealms.Interface.Controller;

import fr.univbordeaux.riseofrealms.Interface.View.MainView;
import fr.univbordeaux.riseofrealms.Interface.View.ResourcePanel;
import fr.univbordeaux.riseofrealms.manager.ResourceManager;
import java.util.HashMap;
import java.util.Map;

public class GameController {

    private final ResourceManager resourceManager;
    private final MainView mainView;

    public GameController(ResourceManager resourceManager, MainView mainView) {
        this.resourceManager = resourceManager;
        this.mainView = mainView;
    }

    public void initialize() {
        ResourcePanel resourcePanel = mainView.getResourcePanel();

        updateResourcePanel(resourcePanel);

        resourceManager.addResource("food", 50);
        resourceManager.addResource("wood", 15);
        resourceManager.addResource("stone", 15);

        updateResourcePanel(resourcePanel);
    }

    private void updateResourcePanel(ResourcePanel resourcePanel) {
        Map<String, Integer> resources = new HashMap<>();

        for (String resource : new String[] { "food", "wood", "stone", "iron", "coal", "lumber", "steel", "tools",
                "cement" }) {
            resources.put(resource, resourceManager.getResourceCount(resource));
        }

        resourcePanel.updateResources(resources);
    }
}
