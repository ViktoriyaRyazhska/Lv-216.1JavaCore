package shop.entity;


public final class Seller extends User {

	public Seller() {
		super();

	}

	public String toString() {
		System.out.println(
				"ID : " + getId() + " | " + "Name : " + getName() + " | " + "Address : " + getAddresses() + "||");
		return "";
	}

}
