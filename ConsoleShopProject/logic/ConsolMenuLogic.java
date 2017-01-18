package shop.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;

import shop.entity.Administrator;
import shop.entity.Buyer;
import shop.entity.Goods;
import shop.entity.Role;
import shop.entity.Seller;
import shop.etitity.goods.Computer;
import shop.etitity.goods.Smartphone;

public class ConsolMenuLogic {


	public static int index = -1;

	public static int productId = 1;

	private boolean isRemeberPassword = false;

	private boolean conditionalExit = true;

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void doAction() {
		System.out.println("Hello");
		try {
			startMenu();
		} catch (IOException e) {
			System.err.println("PROGRAM CRASHED ! ");
		}

	}

	private void startMenu() throws IOException {
		do {
			chooseRole();

		} while (conditionalExit);
	}

	private void chooseRole() throws IOException {
		System.out.println("Select role :: " + "\t" + "1-Administrator   2-Seller  3-Buyer");
		int number = 0;
		try {
			number = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("Incorect input expected integers.");
			System.out.println("No selected role. Choose your access :");
			chooseRole();
		}
		switch (number) {
		case 1:
			System.out.println("\t\tMENU\t" + Role.ADMINISTRATOR);
			getAccessAdmin();
			break;
		case 2:
			System.out.println("\t\tMENU\t" + Role.SELLER);
			fillSellerAndProduct();
			backToMainMenu();
			break;
		case 3:
			System.out.println("\t\tMENU\t" + Role.BUYER);
			Creator.registrateBuyer();
			buyerActions();
			chooseRole();
			break;
		default:
			System.out.println("No selected role. Choose your access :");
			chooseRole();
		}
	}

	public void getAccessAdmin() throws NumberFormatException, IOException {
		String password = "";
		if (isRemeberPassword) {
			System.out.println("Confirm password is not required! Enjoy!!!");
			adminActions();
			return;
		}
		password = Keyboard.inputString("Enter your password");
		if (password.equals(Administrator.PASSWORD)) {
			isRemeberPassword = true;
			System.out.println("Your password is correcr! OK!");
			adminActions();
		} else {
			System.err.println("Your password is incorrect. You have many attempt");
			getAccessAdmin();
		}

	}

	private void adminActions() throws NumberFormatException, IOException {
		System.out.println("");
		System.out.println(
				"   Select actions-->>>>>> " + "\n 1 - View all list of Sellers " + "\n 2 - View all list of Buyers"
						+ "\n 3 - View all list of Goods" + "\n 4 - View all Selers and their appropriate Products"
						+ "\n 5 - Get total amount of money" + "\n 0 - back to Main menu");
		int inputNumber = Keyboard.inputInteger("Press number");
		switch (inputNumber) {
		case 1:
			HoldPlace.viewListSellers();
			HoldPlace.viewSortByIdSellers();
			backToAdminMenu();
			break;
		case 2:
			Buyer.forrmatOutput();
			HoldPlace.viewListBuyers();
			expectedActionAdmin();
			break;
		case 3:
			HoldPlace.viewListGoods();
			backToAdminMenu();
			break;
		case 4:
			HoldPlace.viewListSellersProduct();
			backToAdminMenu();
			break;
		case 5:
			System.out.println("The total sum of goods that are in stock is : " + getTotalSumProducts() + " USD");
			backToAdminMenu();
		case 0:
			chooseRole();
		default:
			break;
		}
	}

	private void buyerActions() throws NumberFormatException, IOException {
		System.out.println("What do you want to do ?");
		System.out.println(" 1-View all goods\n...\n 0 -Back to MAiN MENU ");
		int inputNumber = Keyboard.inputInteger("Enter number");
		switch (inputNumber) {
		case 1:
			HoldPlace.viewListGoods();
			backToBuyerMenu();
			break;
		case 0:
			backToMainMenu();
		default:
			break;
		}

	}

	private void expectedActionAdmin() throws NumberFormatException, IOException {
		if (HoldPlace.buyerList.isEmpty()) {
			System.out.println("Database of Buyers is empty. " + "Hold on when sombody was registrated. Good By!");
			adminActions();
		}
		System.out.println("Your can delete buyer from database or back to Admin menu what do you want to do ?");
		String inputString = "";
		inputString = Keyboard.inputString("Press key : d-delete , b - back to ADMINISTRATOR MENU");
		if (inputString.compareToIgnoreCase("d") == 0) {
			try {
				deleteBuyerById(Keyboard.inputInteger("Enter Buyer`s id whitch will be deleted"));
			} catch (NumberFormatException | IOException e) {
				System.out.println("Nuber format exeption try again");
				expectedActionAdmin();
			}
			System.out.println("Good job!!! This byuer was deleted!!!");
			backToAdminMenu();
		} else if (inputString.compareToIgnoreCase("b") == 0) {
			backToAdminMenu();
		}

	}

	private void deleteBuyerById(int detectedID) throws NumberFormatException, IOException {
		int index = detectedID - 1;
		try {
			HoldPlace.buyerList.remove(index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("This buyer does`not exist in data base");
			deleteBuyerById(Keyboard.inputInteger("Enter correct ID"));

		}

	}

	public double getTotalSumProducts() {
		if (HoldPlace.map.isEmpty()) {
			System.out.println("Map is empty");
		}
		double totalSum = 0;
		for (Entry<Seller, Goods> entries : HoldPlace.map.entrySet()) {
			totalSum += entries.getValue().getCost();
		}
		return totalSum;
	}

	private void fillSellerAndProduct() throws IOException {
		Seller seller = Creator.inputSeller();
		Computer computer = null;
		Smartphone smartphone = null;
		chooseCategoryMessage();
		int inputNumber = Keyboard.inputInteger("Enter nubmer :");
		if (inputNumber == 1) {
			computer = Creator.createCoputerProduct();
			HoldPlace.map.put(seller, computer);
		} else if (inputNumber == 2) {
			smartphone = Creator.createSmartphoneProduct();
			HoldPlace.map.put(seller, smartphone);
		}

	}

	private void backToAdminMenu() throws IOException {
		System.out.println("Do you want to back Admin menu ?");
		String input = Keyboard.inputString("Press key : b - back to ADMINISTRATOR MENU");
		if (input.compareToIgnoreCase("b") == 0) {
			adminActions();
		} else {
			backToAdminMenu();
		}

	}

	private void backToBuyerMenu() throws IOException {
		String input = Keyboard.inputString("Press key : b - back to BUYER MENU");
		if (input.compareToIgnoreCase("b") == 0) {
			buyerActions();
		} else {
			System.out.println("Try again input only b or B");
			backToBuyerMenu();
		}

	}

	private void backToMainMenu() throws IOException {
		System.out.println("Do you want to back Main menu ?");
		String input = Keyboard.inputString("Press key : b - back to MAIN MENU");
		if (input.compareToIgnoreCase("b") == 0) {
			chooseRole();
		} else {
			backToMainMenu();
		}

	}

	private void chooseCategoryMessage() throws NumberFormatException, IOException {
		System.out.println("Add your product.\nSelect category of products what your want to add ");
		System.out.println("\t\tCtegories of Goods");
		System.out.println("1 - Computers" + "\t 2 - Smartphone " + "\t ...etc");

	}

}
