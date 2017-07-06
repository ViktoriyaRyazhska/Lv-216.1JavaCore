package lesson3;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Person {
	/*
	 * Homework
	 * Console Application project in Java.
	 * Add class Person to the project.
	 */
	
	//two private fields: name and birthYear (the birthday year)
	private String name;
	private int birthYear;
	
	//properties for access to these fields
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
	
	//default constructor and constructor with 2 parameters
	public Person(){}
	
	public Person(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;		
	}
	
	//methods:
	//age - to calculate the age of person
	public void age(){
		Calendar c = new GregorianCalendar();
		System.out.println("age = " + (c.get(Calendar.YEAR) - this.birthYear) + "]");	
	}
	
	//input - to input information about person
	public void input(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;	
	}
	
	//output - to output information about person
	public void output(){
		System.out.print("Person [name " + name + ", birthYear = " + birthYear + ", ");
	}
	
	//changeName - to change the name of person
	public void changeName(String name){
		this.name = name;		
		
	}
	

}
