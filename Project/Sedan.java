/*
 * @(#)Sedan.java 1.0 16/01/2017 
 *
 * This software is in public access
 */
package project;

/**
 * Class Sedan to create sedan object, which extends Car class.
 * 
 * @version 1.0 16 January 2017
 * @author Vitalii Pylypenko
 * 
 */
public class Sedan extends Car {
    /**
	 * Private String wheelDrive to set/get forward or rear - wheel drive of car.
	 */
    private String wheelDrive;
    /**
	 * Private double fuelConsumption need to calculate fuel consumption .
	 */
    private double fuelConsumption;
    /**
	 * Private double capacity to set/get the capacity of car engine, also uses in fuel consumption .
	 */
    private double capacity;
    /**
	 * Public constructor of Sedan class.
	 */
    public Sedan(double capacity, CarBrands brand, int maxSpeed, String wheelDrive) {
	super(brand, maxSpeed);
	this.wheelDrive = wheelDrive;
	this.capacity = capacity;
    }
    /**
   	 * Getters and setters.
   	 */
    public String getWheelDrive() {
	return wheelDrive;
    }

    public void setWheelDrive(String wheelDrive) {
	this.wheelDrive = wheelDrive;
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
	 * Public method info display sedan info.
	 */
    @Override
    public void info() {
	System.out.print("Sedan extends ");
	super.info();
    }
}
