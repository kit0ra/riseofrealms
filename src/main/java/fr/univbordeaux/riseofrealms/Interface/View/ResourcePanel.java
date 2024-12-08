package fr.univbordeaux.riseofrealms.Interface.View;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;

import java.util.Map;

public class ResourcePanel extends HBox {
    public ResourcePanel() {
        this.setSpacing(10);
        this.setBackground(Background.fill(Paint.valueOf("#b3d0ff")));
        this.setPadding(new Insets(5 ,0, 5, 5));
    }

    public void updateResources(Map<String, Integer> resources){
        this.getChildren().clear();
        resources.forEach((resource, amount) -> {
            Label resourceLabel = new javafx.scene.control.Label(resource + " - " + amount);
            this.getChildren().add(resourceLabel);
        });
    }
}
