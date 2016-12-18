import java.sql.Date;

public class Person {
	
	private String name;
	private int birthYear;
	
	public Person() {
	}
	public Person(String name, int birthYear) {
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
	
	
	
	public int age(){
		return 2016 - this.birthYear;
	}
	
	public void input(String name, int birthYear){
		setName(name);
		setBirthYear(birthYear);
	}
	
	public void output(){
		System.out.println("Person [name=" + name + ", \t birthYear=" + birthYear + "]");
	}
	
	public void changeName(String name){
		this.name = name;
	}
	
}
