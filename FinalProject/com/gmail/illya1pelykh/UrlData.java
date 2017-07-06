/*
 * @(#)Currency.java 1.0 13/01/2017 
 *
 * This software is in public access and it is the sample of final project for Softserve JavaCore Training Course January 2017
 */
package com.gmail.illya1pelykh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Class UrlData gets access to web data at "http://quote.yahoo.com" currencies
 * rates.
 * 
 * @version 1.0 13 January 2017
 * @author Illya Pelykh
 * 
 */
public class UrlData {

	/**
	 * Public method getRates convert data to double as correlation between two
	 * currencies.
	 * 
	 * @param from
	 *            name of currency (as enum "CurrencyShortName") to convert from
	 * @param to
	 *            name of currency (as enum "CurrencyShortName") to convert to
	 */
	public static double getRates(CurrencyShortName from, CurrencyShortName to) {

		try {
			URL url = new URL("http://quote.yahoo.com/d/quotes.csv?f=l1&s=" + from + to + "=X");

			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			String line = br.readLine();

			if (line != null) {
				return (Double.parseDouble(line));
			}

			br.close();

		} catch (IOException | NumberFormatException e) {
			System.out.println("Don't have access to web site http://quote.yahoo.com");
		}
		return 0;
	}
}
