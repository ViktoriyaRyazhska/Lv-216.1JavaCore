/*
 * @(#)Currency.java 1.0 13/01/2017 
 *
 * This software is in public access and it is the sample of final project for Softserve JavaCore Training Course January 2017
 */
package com.gmail.illya1pelykh;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class RunCurrency runs currencies rates converter console application.
 * 
 * @version 1.0 13 January 2017
 * @author Illya Pelykh
 * 
 */
public class RunCurrency {

	/**
	 * Public method calculateUahAmount calculate and output converted to UAH
	 * amount of currencies.
	 * 
	 * @param switcher
	 *            option of the currency to convert to UAH
	 * @param amount
	 *            amount of currency to convert to UAH
	 */
	public static void calculateUahAmount(int switcher, int amount) {
		switch (switcher) {
		case 1:
			System.out.printf("%d USD = %.2f UAH\n", amount,
					amount * (UrlData.getRates(CurrencyShortName.USD, CurrencyShortName.UAH)));
			break;
		case 2:
			System.out.printf("%d EUR = %.2f UAH\n", amount,
					amount * (UrlData.getRates(CurrencyShortName.EUR, CurrencyShortName.UAH)));
			break;
		case 3:
			System.out.printf("%d PLN = %.2f UAH\n", amount,
					amount * (UrlData.getRates(CurrencyShortName.PLN, CurrencyShortName.UAH)));
			break;
		case 4:
			System.out.printf("%d CHF = %.2f UAH\n", amount,
					amount * (UrlData.getRates(CurrencyShortName.CHF, CurrencyShortName.UAH)));
			break;
		case 5:
			System.out.printf("%d GBP = %.2f UAH\n", amount,
					amount * (UrlData.getRates(CurrencyShortName.GBP, CurrencyShortName.UAH)));
			break;
		default:
			System.out.println("Type correct option");
			break;
		}
	}

	public static void main(String[] args) {

		/** 5 objects of main currencies. */
		Currency usd = new CurrencyCurrent(CurrencyShortName.USD, CurrrencyFullName.United_States_dollar);
		Currency eur = new CurrencyCurrent(CurrencyShortName.EUR, CurrrencyFullName.European_euro);
		Currency pln = new CurrencyCurrent(CurrencyShortName.PLN, CurrrencyFullName.Polish_zloty);
		Currency chf = new CurrencyCurrent(CurrencyShortName.CHF, CurrrencyFullName.Swiss_franc);
		Currency gbp = new CurrencyCurrent(CurrencyShortName.GBP, CurrrencyFullName.Pound_sterling);

		/* Print table with the currencies rates. */
		System.out.printf("%-5s%-5s%-25s%-11s\n", "Code", "Per", "Currency", CurrencyShortName.UAH);
		System.out.println("----------------------------------------");
		usd.printCurrencyInfo();
		eur.printCurrencyInfo();
		pln.printCurrencyInfo();
		chf.printCurrencyInfo();
		gbp.printCurrencyInfo();
		System.out.println("----------------------------------------\n");

		Scanner sc = new Scanner(System.in);

		/* To run the converter with selected options. */
		try {
			int switcher = 1;
			while (true) {
				System.out.printf("Select the currency to convert to UAH - press:\n" + "1 to convert from USD\n"
						+ "2 to convert from EUR\n" + "3 to convert from PLN\n" + "4 to convert from CHF\n"
						+ "5 to convert from GBP\n" + "0 to quit converter app\n");
				switcher = sc.nextInt();
				if (switcher == 0)
					System.exit(switcher);
				System.out.println("Type amount to convert:");
				RunCurrency.calculateUahAmount(switcher, sc.nextInt());
				System.out.println();
			}
		} catch (InputMismatchException e) {
			System.out.println("Choose correct option or type correct amount");
		}
		sc.close();
	}

}
