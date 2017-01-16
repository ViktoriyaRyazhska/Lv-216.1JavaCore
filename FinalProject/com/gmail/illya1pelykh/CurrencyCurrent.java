/*
 * @(#)Currency.java 1.0 13/01/2017 
 *
 * This software is in public access and it is the sample of final project for Softserve JavaCore Training Course January 2017
 */
package com.gmail.illya1pelykh;

/**
 * Class CurrencyCurrent to create full info currency object and display the
 * info.
 * 
 * @version 1.0 13 January 2017
 * @author Illya Pelykh
 * 
 */
public final class CurrencyCurrent extends Currency {

	/**
	 * Private variable rate to set/get the currency rate.
	 */
	private double rate;

	/**
	 * Private variable nameFull to set/get the currency full name.
	 */
	private CurrrencyFullName nameFull;

	/**
	 * Public method to get the currency full name.
	 */
	public CurrrencyFullName getNameFull() {
		return nameFull;
	}

	/**
	 * Public method to set the currency full name.
	 */
	public void setNameFull(CurrrencyFullName nameFull) {
		this.nameFull = nameFull;
	}

	/**
	 * Public method to get the currency rate.
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * Public method to set the currency rate.
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * Public constructor of CurrencyCurrent class.
	 */
	public CurrencyCurrent(CurrencyShortName nameShort, CurrrencyFullName nameFull) {
		super(nameShort);
		setNameFull(nameFull);
		setRate(getRates(nameShort, CurrencyShortName.UAH));

	}

	/**
	 * Public method printCurrencyInfo display currency info.
	 */
	@Override
	public void printCurrencyInfo() {
		System.out.printf("%-5s%-5d%-25s%-11.2f\n", getNameShort(), 1, getNameFull(),
				getRates(getNameShort(), CurrencyShortName.UAH));

	}

}
