package shop.logic;

import java.io.IOException;

import shop.entity.Buyer;
import shop.entity.Seller;
import shop.etitity.goods.Computer;
import shop.etitity.goods.Smartphone;

public class Creator {

	private static int autoSetIdSeller = 0;
	private static int autoSetIdBuyer = 0;
	public static int productId = 1;

	public static void registrateBuyer() throws IOException {
		System.out.println("!--Create new Buyer--!");
		Buyer buyer = new Buyer();
		buyer.setId(++autoSetIdBuyer);
		buyer.setName(Keyboard.inputString(("Enter name")));
		buyer.setAddresses(Keyboard.inputString("Enter your address"));
		Buyer.checkWhithRegEx(buyer, Keyboard.inputEmail("Enter email"));
		HoldPlace.buyerList.add(buyer);
	}

	public static Seller inputSeller() throws IOException {
		System.out.println("!--Create new Seller and one His Product -- !");
		Seller seller = new Seller();
		seller.setId(++autoSetIdSeller);
		seller.setName(Keyboard.inputString("Enter name"));
		seller.setAddresses(Keyboard.inputString("Enter your address"));
		return seller;
	}

	public static Smartphone createSmartphoneProduct() throws NumberFormatException, IOException {
		Smartphone smartphone = new Smartphone();
		System.out.println("\t Adding new product : " +smartphone.getClass().getSimpleName());
		smartphone.setId(productId++);
		smartphone.setTitle(Keyboard.inputString("Enter title"));
		smartphone.setCameraMPixel(Keyboard.inputDouble("Enter MPx of camera (like as 3.2 or 12.5)"));
		smartphone.setDiagonal(Keyboard.inputDouble("Enter width of display (diagonal in \' exemple 4.5 or 5)"));
		smartphone.setPrice(Keyboard.inputDouble("Enter prise per 1 item"));
		smartphone.setQuantity(Keyboard.inputInteger("Enter quantity"));
		System.out.println("!!!!Information for Sellse!!!");
		System.out.println("Your product just add whith this ID : " + smartphone.getId());
		return smartphone;
	}

	public static Computer createCoputerProduct() throws NumberFormatException, IOException {
		Computer computer = new Computer();
		System.out.println("\t Adding new product : " + computer.getClass().getSimpleName());
		computer.setId(productId++);
		computer.setTitle(Keyboard.inputString(("Enter title")));
		computer.setLaptop(Keyboard.inputBoolean("Is this computer is laptop or not enter only \"true\" or \"false\""));
		computer.setHardDiskMemory(Keyboard.inputDouble("Enter HardDisk memory GB "));
		computer.setOperationalMemory(Keyboard.inputDouble("Enter ORM memory GB"));
		computer.setPrice(Keyboard.inputDouble("Set price of 1 item"));
		computer.setQuantity(Keyboard.inputInteger("Enter quantity"));
		System.out.println("!!!!Information!!!");
		System.out.println("Your product just add whith this ID : " + computer.getId());
		return computer;

	}
}
