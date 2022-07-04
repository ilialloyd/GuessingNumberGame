package services;

import Util.UtilApplication;
import services.interfaces.StartGameInter;

public class StartGame implements StartGameInter {
    public StartGame() {
    }

    public void process() {
        UtilApplication.startGame();
    }
}
