/**
 * Announcements of the cities and their basic properties
 * @author maslovksiy
 *
 */
package ua.com.maslovskiy;

public class Cities {
	
	private String owner;
	private String name;
	private int price;
	private int rent;
	
	public Cities(String owner, String name, int price, int rent) {
		super();
		this.owner = owner;
		this.name = name;
		this.price = price;
		this.rent = rent;
	}


	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRent() {
		return rent;
	}


	public void setRent(int rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Cities [owner=" + owner + ", name=" + name + ", price=" + price + ", rent=" + rent + "]";
	}
}
