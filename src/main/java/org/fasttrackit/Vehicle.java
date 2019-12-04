package org.fasttrackit;

import java.security.PublicKey;

public class Vehicle {

    // class variable
    static int totalCount;

    // instance variables
   private String name;
   private String color;
   private double mileage;
   private double maxSpeed;
   private double fuelLevel;
   private double traveledDistance;
   private boolean running;

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        double mileageMultiplier = 1;

        System.out.println(name + " is accelerating with "
                + speed + " for " + durationInHours + "h.");

        if (speed > maxSpeed) {
            System.out.println("Sorry. Maximum speed exceeded.");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Careful! Max speed reached.");
        } else {
            System.out.println("Valid speed entered.");
        }

        if (fuelLevel <= 0) {
            System.out.println("You don't have enough fuel.");
            return 0;
        }

        if (speed > 120) {
            System.out.println("Going fast... you'll use more fuel.");

            // increasing mileage multiplier with percentage of acceleration's speed
            mileageMultiplier = speed / 100;
        }

        // local variable (declared inside a method)
        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;
        // same result as the statement above
//        traveledDistance += distance;

        System.out.println("Total traveled distance: " + traveledDistance);

        double usedFuelWithStandardMileage = distance * mileage / 100;
        System.out.println("Used fuel with standard mileage: " + usedFuelWithStandardMileage);

        double usedFuelWithCurrentMileage =
                usedFuelWithStandardMileage * mileageMultiplier;

        System.out.println("Used fuel with current mileage: "
                + usedFuelWithCurrentMileage);

        fuelLevel -= usedFuelWithCurrentMileage;

        System.out.println("Remaining fuel level: " + fuelLevel);

        return distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                ", running=" + running +
                '}';
    }
}