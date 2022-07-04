package services;

import Util.UtilApplication;
import services.interfaces.RegisterServiceInter;

public class RegisterService implements RegisterServiceInter {
    public RegisterService() {
    }

    public void process() {
        UtilApplication.registerPlayers();
        UtilApplication.printInfo();
    }
}
