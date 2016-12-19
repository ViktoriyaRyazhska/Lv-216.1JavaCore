package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	private String name;
	private int birthYear;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int age() {
		System.out.println(name + "'s age is - " + (2016 - birthYear));
		return 2016 - birthYear;
	}
	
	public void input() throws IOException {
		System.out.println("add name:");
		this.name = bufferedReader.readLine();
		System.out.println("add year of birth:");
		this.birthYear = Integer.parseInt(bufferedReader.readLine());
	}
	
	public void output() {
		System.out.println("name: " + name);
		age();
		System.out.println();
	}

	public String changeName() throws IOException {
		System.out.println("change name for - " + name);
		String name = bufferedReader.readLine();
		return this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + "]";
	}
	
	
}
