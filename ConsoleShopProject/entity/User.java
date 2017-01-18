package shop.entity;


/**
 *
 * @author Igor
 * @version 1.0
 * 
 */
public abstract class User {

	private int id;
	private String name;
	private String address;

	public User() {

	}

	/**
	 * 
	 * @return name
	 */

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return address
	 */
	public String getAddresses() {
		return address;
	}

	/**
	 * 
	 * @param addresses
	 */
	public void setAddresses(String addresses) {
		this.address = addresses;
	}

	/**
	 * 
	 * @return id
	 */

	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

}
