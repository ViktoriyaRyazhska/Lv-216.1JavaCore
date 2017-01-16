/*
 * @(#)Main.java 1.0 16/01/2017 
 *
 * This software is in public access
 */
package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Class Main to create instances of all classes and to use methods.
 * 
 * @version 1.0 16 January 2017
 * @author Vitalii Pylypenko
 * 
 */
public class Main {

    private static Scanner sc;

    public static void main(String[] args) throws IOException {

	sc = new Scanner(System.in);
	/**
	 * double speed uses to calculate fuel consumption in a certain speed.
	 */
	double speed;
	/**
	 * int count uses to get a certain value of ArrayList
	 */
	int count = 0;

	List<GeneralMotors> gm = new ArrayList<GeneralMotors>();
	gm.add(new GeneralMotors(1.8, CarBrands.Chevrolet, 190, "Forward", "Cruze"));
	gm.add(new GeneralMotors(2.0, CarBrands.Chevrolet, 210, "Forward", "Malibu"));
	gm.add(new GeneralMotors(1.4, CarBrands.Opel, 160, "Rear", "Astra A"));
	gm.add(new GeneralMotors(2.2, CarBrands.Opel, 220, "Rear", "Omega"));

	Iterator<GeneralMotors> it = gm.iterator();
	System.out.println("Do you want to calculate the fuel consumption of General Motors sedans? yes/no");

	switch (sc.nextLine()) {

	case "yes":
	    gm.iterator();
	    while (it.hasNext()) {
		try {
		    System.out.println(gm.get(count));
		    System.out.println("Enter car speed for calculate fuel consumption for " + (count + 1) + " car");
		    speed = Double.parseDouble(sc.next());
		    System.out.println(
			    "Fuel Consumption is " + gm.get(count).calculateFuelConsumption(speed) + " l/100km");
		    count++;
		    it.next();
		} catch (NumberFormatException e) {
		    System.err.println("Input data is not a number");
		}
	    }
	    break;

	case "no":
	    gm.iterator();
	    while (it.hasNext()) {
		System.out.println(gm.get(count));
		count++;
		it.next();
	    }
	    break;

	default:
	    System.out.println("Type correct option");
	    break;
	}

	count = 0;

	List<FiatChryslerAutomobiles> fca = new ArrayList<FiatChryslerAutomobiles>();
	fca.add(new FiatChryslerAutomobiles(2.4, CarBrands.Jeep, 210, true, "Cherokee"));
	fca.add(new FiatChryslerAutomobiles(2.0, CarBrands.Jeep, 190, false, "Compass"));
	fca.add(new FiatChryslerAutomobiles(1.6, CarBrands.Chrysler, 180, false, "Sebring"));
	fca.add(new FiatChryslerAutomobiles(2.8, CarBrands.Chrysler, 230, true, "Aspen"));

	Iterator<FiatChryslerAutomobiles> it1 = fca.iterator();
	System.out.println("Do you want to calculate the fuel consumption of Fiat Chrysler Automobiles jeeps? yes/no");

	switch (sc.nextLine()) {

	case "yes":
	    fca.iterator();
	    while (it1.hasNext()) {
		try {
		    System.out.println(fca.get(count));
		    System.out.println("Enter car speed for calculate fuel consumption for " + (count + 1) + " car");
		    speed = Double.parseDouble(sc.next());
		    System.out.println(
			    "Fuel Consumption is " + fca.get(count).calculateFuelConsumption(speed) + " l/100km");
		    count++;
		    it1.next();
		} catch (NumberFormatException e) {
		    System.err.println("Input data is not a number");
		}
	    }
	    break;

	case "no":
	    fca.iterator();
	    while (it1.hasNext()) {
		System.out.println(fca.get(count));
		count++;
		it1.next();
	    }
	    break;

	default:
	    System.out.println("Type correct option");
	    break;
	}
	sc.close();
    }
}
