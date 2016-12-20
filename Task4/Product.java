package ua.bilas;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	public static void maxPriceProdukt(Product product, Product product2, Product product3, Product product4) {
		if ((product.getPrice() > product2.getPrice()) && (product.getPrice() > product3.getPrice()) && (product.getPrice() > product4.getPrice())) {
			System.out.println("most expensive produkt name: " + product.getName());
			System.out.println("most expensive produkt quantity: " + product.getQuantity());
		} else {
			if ((product2.getPrice() > product.getPrice()) && (product2.getPrice() > product3.getPrice()) && product2.getPrice() > product4.getPrice()) {
				System.out.println("most expensive produkt name: " + product2.getName());
				System.out.println("most expensive produkt quantity: " + product2.getQuantity());
			} else {
				if ((product3.getPrice() > product.getPrice()) && (product3.getPrice() > product2.getPrice()) && (product3.getPrice() > product4.getPrice())) {
					System.out.println("most expensive produkt name: " + product3.getName());
					System.out.println("most expensive produkt quantity: " + product3.getQuantity());
				} else {
					System.out.println("most expensive produkt name: " + product4.getName());
					System.out.println("most expensive produkt quantity: " + product4.getQuantity());
				}
			}
		}
	}
	
	public static void maxQuantityProdukt(Product product, Product product2, Product product3, Product product4) {
		if ((product.getQuantity() > product2.getQuantity()) && (product.getQuantity() > product3.getQuantity()) && (product.getQuantity() > product4.getQuantity())) {
			System.out.println("bigest quantity item is " + product.getName());
		} else {

			if ((product2.getQuantity() > product.getQuantity()) && (product2.getQuantity() > product3.getQuantity()) && (product2.getQuantity() > product4.getQuantity())) {
				System.out.println("bigest quantity item is " + product2.getName());
			} else {

				if ((product3.getQuantity() > product.getQuantity()) && (product3.getQuantity() > product2.getQuantity()) && (product3.getQuantity() > product4.getQuantity())) {
					System.out.println("bigest quantity item is " + product3.getName());
				} else {
					System.out.println("bigest quantity item is " + product4.getName());
				}
			}
		}
	}
}
