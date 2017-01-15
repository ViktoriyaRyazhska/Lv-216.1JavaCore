package Persone;

public class Persone {
	private String name;
	private int birthYear;

	public Persone() {
		super();
	}

	public Persone(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public int age(int year) {
		if (birthYear <= year) {
			return year - birthYear;
		} else {
			System.err.println("error birthYear>=year");
			return 0;
		}

	}

	public void input(String name, int birthYear) {
		this.name = name;
		if(birthYear>=0){
			
		this.birthYear = birthYear;
		}else
		{
			System.err.println("birthYear<0");
		}
	}
	public void changeName(String name){
		this.name=name;
	}

	public String output() {
		return "Persone [name=" + name + ", birthYear=" + birthYear + "]";
	}

}