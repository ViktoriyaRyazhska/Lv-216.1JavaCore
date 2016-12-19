package ua.bilas;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Person person = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person("oleg", 1987);
		
		person.input();
		person2.input();
		person3.input();
		person4.input();
		person5.changeName();
		
		person.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
	}
}
