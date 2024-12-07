package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.Map;

public class ResourcePanel extends HBox {
    public ResourcePanel() {
        this.setSpacing(10);
    }

    public void updateResources(Map<String, Integer> resources){
        this.getChildren().clear();
        resources.forEach((resource, amount) -> {
            Label resourceLabel = new javafx.scene.control.Label(resource + " - " + amount);
            this.getChildren().add(resourceLabel);
        });
    }
}
