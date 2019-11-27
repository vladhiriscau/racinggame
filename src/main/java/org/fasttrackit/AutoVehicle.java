package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

public class AutoVehicle extends  Vehicle{
    // "has-a" relationship
    Engine engine;

    public  AutoVehicle(Engine engine) {
        this.engine = engine;

        System.out.println("Creating an auto-vehicle");

    }
}
