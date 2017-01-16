/*
 * @(#)Jeep.java 1.0 16/01/2017 
 *
 * This software is in public access
 */
package project;

/**
 * Class Jeep to create jeep object, which extends Car class.
 * 
 * @version 1.0 16 January 2017
 * @author Vitalii Pylypenko
 * 
 */
public class Jeep extends Car {
    /**
     * Private boolean allWheelDrive to set true/false if the car have the All
     * Wheel Drive.
     */
    private boolean allWheelDrive;
    /**
     * Private double capacity to set/get the capacity of car engine, also uses
     * in fuel consumption .
     */
    private double capacity;
    /**
     * Private double fuelConsumption need to calculate fuel consumption .
     */
    private double fuelConsumption;

    /**
     * Public constructor of Jeep class.
     */
    public Jeep(double capacity, CarBrands brand, int maxSpeed, boolean allWheelDrive) {
	super(brand, maxSpeed);
	this.allWheelDrive = allWheelDrive;
	this.capacity = capacity;
    }

    /**
     * Getters and setters.
     */
    public boolean isAllWheelDrive() {
	return allWheelDrive;
    }

    public void setAllWheelDrive(boolean allWheelDrive) {
	this.allWheelDrive = allWheelDrive;
    }

    public double getFuelConsumption() {
	return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
	this.fuelConsumption = fuelConsumption;
    }

    public double getCapacity() {
	return capacity;
    }

    public void setCapacity(double capacity) {
	this.capacity = capacity;
    }

    /**
     * Public method info display jeep info.
     */
    @Override
    public void info() {
	System.out.print("Jeep extends ");
	super.info();
    }

}
