package org.fasttrackit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> comepetitors = new ArrayList<>();


    public void start() {
        System.out.println("Starting game...");

        initializeTracks();
        displayTracks();

        initializeCompetitors();

        // enhanced for
        for (Vehicle vehicle : comepetitors) {
            System.out.println("It's " + vehicle.getName() + "'s turn.");
        }
    }

    private void initializeCompetitors() {
        int playerCount = getPlayerCountFromUser();
        System.out.println("Number of players:" + playerCount);

        for (int i = 1; i <= playerCount; i++) {
            System.out.println("Added player " + i);

            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(6, 15));
            vehicle.setMaxSpeed(300);

            System.out.println("Vehicle for player" + i + ": " + vehicle.getName() + "- Mileage:" + vehicle.getMileage());

            comepetitors.add(vehicle);
        }

    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Silverstone");
        track1.setLenght(4.2);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Transylvania");
        track2.setLenght(400.2);

        tracks[1] = track2;

        System.out.println(tracks[0].getName());


    }

    private void displayTracks() {
        System.out.println("Available tracks:");
        System.out.println(tracks);

        // classic for loop
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLenght() + "km");
            }
        }

    }

    private String getVehicleNameFromUser() {

        System.out.println("Please enter vehicle name.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    private int getPlayerCountFromUser() {

        LocalDateTime.now();

        System.out.println("Please enter vehicle number.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }


}