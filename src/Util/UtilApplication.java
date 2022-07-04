package Util;

import bean.Competitors;
import bean.Config;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class UtilApplication {
    public UtilApplication() {
    }

    public static Competitors fillCompetitors() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name: \n");
        String name = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter surname: \n");
        String surName = sc2.nextLine();
        return new Competitors(name, surName);
    }

    public static void printInfo() {
        System.out.println("Competitors added ");

        for (int a = 0; a < Config.competitors.length; ++a) {
            System.out.println(a + 1 + ". Competitor: " + Config.getInstance().getCompetitors()[a].getfullInfo());
        }

    }

    public static void registerPlayers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please register players below:\n");
        System.out.println("How many player do you want to register? \n");
        int playersNumbers = sc.nextInt();
        Config.competitors = new Competitors[playersNumbers];

        for (int i = 0; i < Config.competitors.length; ++i) {
            System.out.println(i + 1 + ". Register competitor");
            Config.competitors[i] = fillCompetitors();
            Config.getInstance().setCompetitors(Config.competitors);
        }

    }

    public static void startGame() {
        System.out.println("Welcome to the game!");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomValue = random.nextInt(1, 5);

        for (int i = 0; i < Config.competitors.length; ++i) {
            PrintStream var10000 = System.out;
            String var10001 = Config.getInstance().getCompetitors()[i].getfullInfo();
            var10000.println(var10001 + ": please enter your lucky number between 1-5\n");
            int estimate = sc.nextInt();
            if (estimate == randomValue) {
                var10000 = System.out;
                var10001 = Config.getInstance().getCompetitors()[i].getfullInfo();
                var10000.println("Player " + var10001 + ": You Won!");
            }else {
                var10000 = System.err;
                var10001 = Config.getInstance().getCompetitors()[i].getfullInfo();
                var10000.println(var10001 + " Your estimate was wrong! The number was " + randomValue);
            }
        }

    }
}
