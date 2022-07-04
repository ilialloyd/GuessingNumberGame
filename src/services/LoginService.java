package services;

import bean.Config;

import java.util.Scanner;

import services.interfaces.LoginProcessInter;

public class LoginService implements LoginProcessInter {
    public LoginService() {
    }

    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter password");
        String password = sc2.nextLine();
        if (username.equals("user") && password.equals("1111")) {
            Config.setLoggedIn(true);
        }else {
            throw new IllegalArgumentException("Username or password is wrong!\nEnter again.");
        }
    }
}
