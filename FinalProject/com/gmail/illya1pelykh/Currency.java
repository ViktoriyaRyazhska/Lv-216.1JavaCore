/*
 * @(#)Currency.java 1.0 13/01/2017 
 *
 * This software is in public access and it is the sample of final project for Softserve JavaCore Training Course January 2017
 */
package com.gmail.illya1pelykh;

/**
 * Class Currency to create currency object.
 * 
 * @version 1.0 13 January 2017
 * @author Illya Pelykh
 * 
 */

public abstract class Currency extends UrlData{
	/**
	 * Private variable nameShort to set/get the currency short name.
	 */
	private CurrencyShortName nameShort;

	/**
	 * Public method to get the currency short name.
	 */
	public CurrencyShortName getNameShort() {
		return nameShort;
	}

	/**
	 * Public method to set the currency short name.
	 */
	public void setNameShort(CurrencyShortName name) {
		this.nameShort = name;
	}

	/**
	 * Public constructor of Currency class.
	 */
	public Currency(CurrencyShortName name) {
		setNameShort(name);
	}
	
	/**
	 * Public method printCurrencyInfo display currency info.
	 */
	public abstract void printCurrencyInfo();

}
