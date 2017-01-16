/*
 * @(#)GeneralMotors.java 1.0 16/01/2017 
 *
 * This software is in public access
 */
package project;

/**
 * Class GeneralMotors to create GeneralMotors object which extends sedan class
 * and implements CalculateFuelConsumption interface.
 * 
 * @version 1.0 16 January 2017
 * @author Vitalii Pylypenko
 * 
 */
public class GeneralMotors extends Sedan implements CalculateFuelConsumption {
    /**
     * Private String model to set/get the model of car.
     */
    private String model;

    /**
     * Public constructor of GeneralMotors class.
     */
    public GeneralMotors(double capacity, CarBrands brand, int maxSpeed, String wheelDrive, String model) {
	super(capacity, brand, maxSpeed, wheelDrive);
	this.model = model;
    }

    /**
     * Getters and setters.
     */
    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    /**
     * toString override
     */
    @Override
    public String toString() {
	return "GeneralMotors [model=" + model + ", WheelDrive=" + getWheelDrive() + ", Capacity=" + getCapacity()
		+ "]";
    }

    /**
     * calculateFuelConsumption method override. 
     * Calculate fuel consumptions of General Motors sedans.
     */
    @Override
    public double calculateFuelConsumption(double speed) {
	super.setFuelConsumption(getCapacity() * speed / 25);
	return super.getFuelConsumption();
    }

    /**
     * Public method info display General Motors info.
     */
    @Override
    public void info() {
	System.out.print("General Motors extends ");
	super.info();
    }
}
