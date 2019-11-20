package org.fasttrackit;


/**
 * Hello world!
 *
 */
public class App 
{

       // one line comment

    public static void main( String[] args )

    {
        System.out.println( "Welcome to the Racing game!" );

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1500;

        Car carReference = new Car(carEngine);
        carReference.name = "Dacia";
        carReference.color = "red";
        carReference.mileage = 9.8;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorCount = 2;


        carReference.engine = carEngine;


        System.out.println("Engine details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);

        double accelerationDistance = carReference.accelerate(60, 1);
        System.out.println("Acceleration distance:" + accelerationDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);
        System.out.println("Total traveled distance after repair:" + carReference.traveledDistance);

        Engine car2Engine = new Engine();
        car2Engine.manufacturer = "Bavaria Motors";
        car2Engine.capacity = 2;
        Car car2 = new Car(new Engine());
        car2.name = "BMW";
        car2.mileage = 14;
        // concatenation
        System.out.println(carReference);
        System.out.println("First car name: " + carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.running);
        System.out.println(carReference.doorCount);

        System.out.println("Second car name: " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.running);
        System.out.println(car2.doorCount);


        car2.name = "VW";
        System.out.println(car2.name);

        Car car3 = car2;
        car3.name = "Audi";
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car3 name: " + car3.name);

//          example for NullPointerException
//        Car car4 = null;
//        System.out.println(car4.name);

//        System.out.println("Modulo example:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//        System.out.println(4 % 2 == 0);

        System.out.println("Studying class variables (static variables)...");

        Vehicle vehicle1 = new Vehicle();
        vehicle1.totalCount = 10;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.totalCount = 20;

        Vehicle.totalCount = 30;

        System.out.println("Total vehicle count from vehicle1:" + vehicle1.totalCount);
        System.out.println("Total vehicle count from vehicle2:" + vehicle2.totalCount);
        System.out.println("Total vehicle count from Vehicle class:" + Vehicle.totalCount);
}
    }
