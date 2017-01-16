/*
 * @(#)FiatChryslerAutomobiles.java 1.0 16/01/2017 
 *
 * This software is in public access
 */
package project;

/**
 * Class FiatChryslerAutomobiles to createFiatChryslerAutomobiles object which
 * extends jeep class and implements CalculateFuelConsumption interface.
 * 
 * @version 1.0 16 January 2017
 * @author Vitalii Pylypenko
 * 
 */
public class FiatChryslerAutomobiles extends Jeep implements CalculateFuelConsumption {
    /**
     * Private String model to set/get the model of car.
     */
    private String model;

    /**
     * Public constructor of GeneralMotors class.
     */
    public FiatChryslerAutomobiles(double capacity, CarBrands brand, int maxSpeed, boolean allWheelDrive, String model) {
	super(capacity, brand, maxSpeed, allWheelDrive);
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
	return "FiatChryslerAutomobiles [model=" + model + ", AllWheelDrive=" + isAllWheelDrive() + ", Capacity="
		+ getCapacity() + "]";
    }

    /**
     * calculateFuelConsumption method override. 
     * Calculate fuel consumptions of Fiat Chrysler Automobiles jeeps.
     */
    @Override
    public double calculateFuelConsumption(double speed) {
	if (isAllWheelDrive() == true) {
	    super.setFuelConsumption(getCapacity() * speed / 10);
	    return super.getFuelConsumption();
	} else {
	    super.setFuelConsumption(getCapacity() * speed / 20);
	    return super.getFuelConsumption();
	}
    }

    /**
     * Public method info display Fiat Chrysler Automobiles info.
     */
    @Override
    public void info() {
	System.out.print("FiatChryslerAutomobiles extends ");
	super.info();
    }

}
