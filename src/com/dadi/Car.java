package com.dadi;

/**
 * Created by Dadi on 29/12/2016.
 */
public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
