package org.fasttrackit;

public class Vehicle {

    // class variable
    static int totalCount;

    // instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

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

}