package menu;

import bean.Config;
import services.LogOutService;
import services.LoginService;
import services.RegisterService;
import services.StartGame;
import services.interfaces.Process;

public enum Menu {
    LOGIN(1, "Login", new LoginService()),
    ADDPLAYERS(2, "Add players", new RegisterService()),
    STARTGAME(3, "Start game", new StartGame()),
    LOGOUTSERVICE(4, "Log Out", new LogOutService()),
    EXIT(5, "Exit Game", new SystemExit()),
    UNKNOWN;

    private int number;
    private String label;
    private Process service;

    private Menu() {
    }

    private Menu(int number, String label, Process service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public String getLabel() {
        return this.label;
    }

    public int getNumber() {
        return this.number;
    }

    public String toString() {
        return this.number + " " + this.label;
    }

    public void process() {
        this.service.process();
        CompetitionMenuFactory.showMenu();
    }

    public static Menu find(int number) {
        Menu[] menus = values();

        for (int i = 0; i < menus.length; ++i) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }

        return UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = values();

        for (int i = 0; i < menus.length; ++i) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN) {
                    System.out.println(menus[i]);
                }else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }

    }

    static class SystemExit implements Process {
        SystemExit() {
        }

        public void process() {
            System.exit(0);
        }
    }
}
