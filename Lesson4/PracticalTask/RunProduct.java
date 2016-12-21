package Lesson4;

import java.util.Scanner;

public class RunProduct {

	public static void main(String[] args) {
		// local variables
		String name;
		double price;
		int quantity;

		// create four instances of type Product
		Scanner sc = new Scanner(System.in);

		System.out.println("Type name, price and quantity of 1-st product");
		Product p1 = new Product(sc.next(), sc.nextDouble(), sc.nextInt());
		p1.outputCreation();

		System.out.println("Type name, price and quantity of 2-nd product");
		Product p2 = new Product(sc.next(), sc.nextDouble(), sc.nextInt());
		p2.outputCreation();

		System.out.println("Type name, price and quantity of 3-rd product");
		Product p3 = new Product(sc.next(), sc.nextDouble(), sc.nextInt());
		p3.outputCreation();

		System.out.println("Type name, price and quantity of 4-th product");
		Product p4 = new Product(sc.next(), sc.nextDouble(), sc.nextInt());
		p4.outputCreation();

		// display the name and quantity of the most expensive item
		if (p1.getPrice() > p2.getPrice() && p1.getPrice() > p3.getPrice()
				&& p1.getPrice() > p4.getPrice()) {
			p1.outputPrice();
		}

		if (p2.getPrice() > p1.getPrice() && p2.getPrice() > p3.getPrice()
				&& p2.getPrice() > p4.getPrice()) {
			p2.outputPrice();
		}

		if (p3.getPrice() > p1.getPrice() && p3.getPrice() > p2.getPrice()
				&& p3.getPrice() > p4.getPrice()) {
			p3.outputPrice();
		}

		else {
			p4.outputPrice();
		}
		// display the name of the items, which has the biggest quantity
		if (p1.getQuantity() >= p2.getQuantity()
				&& p1.getQuantity() >= p3.getQuantity()
				&& p1.getQuantity() >= p4.getQuantity()) {
			p1.outputQuantity();

		}
		if (p2.getQuantity() >= p1.getQuantity()
				&& p2.getQuantity() >= p3.getQuantity()
				&& p2.getQuantity() >= p4.getQuantity()) {
			p2.outputQuantity();

		}
		if (p3.getQuantity() >= p1.getQuantity()
				&& p3.getQuantity() >= p2.getQuantity()
				&& p3.getQuantity() >= p4.getQuantity()) {
			p3.outputQuantity();

		}
		if (p4.getQuantity() >= p1.getQuantity()
				&& p4.getQuantity() >= p2.getQuantity()
				&& p4.getQuantity() >= p3.getQuantity()) {
			p4.outputQuantity();
		}
	}
}
