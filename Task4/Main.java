package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		MyLogic logic = new MyLogic();
		
		logic.dayOfTheWeek();
		logic.numOfOdds();
		
		System.out.println("add coutry:");
		String country = bufferedReader.readLine();
		
		switch (country.toLowerCase()) {
		case "ukraine":
		case "poland":
		case "russia":
			System.out.println(country + " is in " + WorldPart.EUROPE);
			break;
		case "usa":
		case "canada":
			System.out.println(country + " is in " + WorldPart.NORTH_AMERICA);
		case "china":
		case "india":
		case "japan":
			System.out.println(country + " is in " + WorldPart.ASIA);
		default:
			System.out.println(country + " is in the other part of the World.");
			break;
		}
		
		
		Product product = new Product();
		Product product2 = new Product("Bolt", 2.5, 100);
		Product product3 = new Product("gajka", 1.5, 170);
		Product product4 = new Product();
		
		product.setName("tsvyah");
		product.setPrice(1.9);
		product.setQuantity(200);
		
		product4.setName("anker");
		product4.setPrice(3.4);
		product4.setQuantity(90);
		
		
		Product.maxPriceProdukt(product, product2, product3, product4);
		Product.maxQuantityProdukt(product, product2, product3, product4);
		
		
	}
}
