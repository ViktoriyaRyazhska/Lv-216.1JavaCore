import java.util.Scanner;

public class Person { // create public class
	private String name; // private filed name
	private int birthYear; // private filed birthYear
	Scanner sc = new Scanner(System.in);

	public String getName() {
		return this.name;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Person() // default constructor
	{

	}

	public Person(String name, int birthYear) // constructor z parameter
	{
		this.name = name;
		this.birthYear = birthYear;
	}

	public int age() // method Age
	{
		return 2016 - birthYear;
	}

	public void input() // method input
	{
		System.out.println("Введіть ім*я та рік народження для персони");
		name = sc.nextLine();
		birthYear = Integer.parseInt(sc.nextLine());
		// setName(sc.nextLine());
		// setBirthYear(Integer.parseInt(sc.nextLine()));
		return;
	}

	public void output() // method output
	{
		System.out.println("Ім*я персони => " + this.name + ", рік народження - " + this.birthYear + "; вік - "
				+ this.age() + ".");
	}

	public void changeName(String name) // method changeName
	{
		this.name = name;
	}
}
