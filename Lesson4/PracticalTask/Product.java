package Lesson4;

class Product {
	/*
	 * Homework Console Application project in Java. Add class Product to the
	 * project.
	 */

	// fields name, price and quantity
	private String name;
	private double price;
	private int quantity;

	// properties for access to these fields
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

	// constructor with 3 parameters
	public Product(String name, double price, int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	// output methods
	public void outputCreation() {
		System.out.println("Product [name " + getName() + ", price = "
				+ getPrice() + ", quantity = " + getQuantity() + "]"
				+ " created");
		System.out.println();
	}
	
	public void outputPrice(){
		System.out.println("Product [name " + getName()
				+ ", quantity = " + getQuantity() + "]"
				+ " has the biggest price " + getPrice());
	}
	
	public void outputQuantity(){
		System.out.println("Product [name " + getName() + "]"
				+ " has the biggest quantity " + getQuantity());
	}

}

package Lesson4;

class Product {
	/*
	 * Homework Console Application project in Java. Add class Product to the
	 * project.
	 */

	// fields name, price and quantity
	private String name;
	private double price;
	private int quantity;

	// properties for access to these fields
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

	// constructor with 3 parameters
	public Product(String name, double price, int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	// output methods
	public void outputCreation() {
		System.out.println("Product [name " + getName() + ", price = "
				+ getPrice() + ", quantity = " + getQuantity() + "]"
				+ " created");
		System.out.println();
	}
	
	public void outputPrice(){
		System.out.println("Product [name " + getName()
				+ ", quantity = " + getQuantity() + "]"
				+ " has the biggest price " + getPrice());
	}
	
	public void outputQuantity(){
		System.out.println("Product [name " + getName() + "]"
				+ " has the biggest quantity " + getQuantity());
	}

}

