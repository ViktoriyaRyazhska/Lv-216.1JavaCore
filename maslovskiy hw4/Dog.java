import java.util.Scanner;

public class Dog {
	
	private String name;
	private Breed breed;
	private int age;
	Scanner scn = new Scanner(System.in);
	
	public enum Breed{
		Taksa;
		
		Breed breed;
		
	}

	public Dog() {
		input(scn);
	}

	private void input(Scanner scn) {
		System.out.println("Input name ");
		name = scn.nextLine();
		System.out.println("Input age");
		age = Integer.parseInt(scn.nextLine());
		breed = Breed.Taksa;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return Breed.Taksa;
	}

	public void setBreed(String breed) {
		Breed a = Breed.Taksa;
		this.breed = a;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name = " + name + ", breed = " + breed + ", age = " + age + "]";
	}

}
