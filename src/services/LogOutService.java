package services;

import services.interfaces.LogOutInter;

public class LogOutService implements LogOutInter {
    public LogOutService() {
    }

    public void process() {
        LoginService backToLog = new LoginService();
        backToLog.process();
    }
}
