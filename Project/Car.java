/*
 * @(#)Car.java 1.0 16/01/2017 
 *
 * This software is in public access
 */
package project;

/**
 * Class Car to create Car object.
 * 
 * @version 1.0 16 January 2017
 * @author Vitalii Pylypenko
 * 
 */
public abstract class Car {
    /**
     * Private String variable brand to set the brand of car.
     */
    private CarBrands brand;
    /**
     * Private int variable maxSpeed to set the maximum speed of car.
     */
    private int maxSpeed;

    /**
     * Public constructor of Car class.
     */
    public Car(CarBrands brand, int maxSpeed) {
	super();
	this.brand = brand;
	this.maxSpeed = maxSpeed;
    }

    /**
     * Public method info display car info.
     */
    public void info() {
	System.out.println("Car");
	System.out.println("Properties:");
	System.out.println("Brand " + this.brand + ", Max Speed " + this.maxSpeed);
    }

    

}
