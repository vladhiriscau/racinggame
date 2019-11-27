package org.fasttrackit;

// inheritance or "is-a"  relationship

public class Car extends AutoVehicle {

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }
    // CONTRUCTOR OVERLOADING
    public Car() {
        super(new Engine());
    }
}
