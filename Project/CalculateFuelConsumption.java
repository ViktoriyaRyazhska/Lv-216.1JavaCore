/*
 * @(#)CalculateFuelConsumption.java 1.0 16/01/2017 
 *
 * This software is in public access
 */
package project;

/**
 * Interface CalculateFuelConsumption to calculate fuel expense.
 * 
 * @version 1.0 16 January 2017
 * @author Vitalii Pylypenko
 * 
 */
public interface CalculateFuelConsumption {
    /**
     * Public method.
     * 
     * @param speed
     *            double variable, which need to calculate fuel consumption
     */
    public double calculateFuelConsumption(double speed);
}
