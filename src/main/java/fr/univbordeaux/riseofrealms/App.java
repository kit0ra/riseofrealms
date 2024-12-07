package fr.univbordeaux.riseofrealms;

import fr.univbordeaux.riseofrealms.Interface.Controller.GameController;
import fr.univbordeaux.riseofrealms.Interface.View.MainView;
import fr.univbordeaux.riseofrealms.resources.ResourceManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    @Override
    public void start(Stage primaryStage) {
        ResourceManager resourceManager = ResourceManager.getInstance();
        MainView mainView = new MainView(primaryStage);
        GameController gameController = new GameController(resourceManager, mainView);

        mainView.initialize();
        gameController.initialize();
    }

    public static void main( String[] args )
    {
        Application.launch(args);
    }
}
