package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void  start() {
        System.out.println("Starting game...");

        int playerCount = getPlayerCountFromUser();
        System.out.println("Number of players:" + playerCount);

        String vehicleName = getVehicleNmeFromUser();
        System.out.println("Name from user:" + vehicleName);

    }

    private String getVehicleNmeFromUser() {
        System.out.println("Please enter vehicle name.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
        private int getPlayerCountFromUser() {
            System.out.println("Please enter vehicle number.");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();

        }


    }