package shop.entity;


import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import shop.logic.Keyboard;

public final class Buyer extends User {

	private String email;

	public Buyer() {
		super();

	}

	public static void checkWhithRegEx(Buyer buyerType, String email) throws IOException {
		String trueEmail = email;
		Pattern pattern = Pattern.compile("\\w+\\.*\\w+\\-*\\w+\\@[a-z]+\\.[a-z]+\\.?[a-z]+?");
		Matcher matcher = pattern.matcher(trueEmail);
		if (matcher.matches() == true) {
			buyerType.setEmail(trueEmail);
		} else {
			System.out.println("Email does`t match . Try again");
			System.out.println("Email example : Ivan.Stepanov(Ivan-stepanov or ivanstepanov)@mail.com(com.ua)");
			trueEmail = Keyboard.inputEmail("Insert your email");
			checkWhithRegEx(buyerType, trueEmail);
		}

	}

	public static void forrmatOutput() {
		System.out.println("");
		System.out.println("\tAll information about registreted Buyers");
		System.out.println("ID" + "|" + "\tName" + "\t|" + "\t  Address" + "\t|" + "\temail \t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------------");

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		System.out.println(+getId() + "\t" + getName() + "\t\t" + getAddresses() + "\t\t\t" + email + "" + hashCode());
		return "";
	}

}
