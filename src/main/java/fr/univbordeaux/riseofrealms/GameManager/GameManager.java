package fr.univbordeaux.riseofrealms.GameManager;

public class GameManager {


    private static GameManager gameManager;

    private GameManager(){

    }

    public static GameManager getInstance(){
        if(gameManager == null){
            gameManager = new GameManager();
        }
        return gameManager;
    }
}
