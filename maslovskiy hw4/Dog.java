import java.util.Scanner;

public class Dog {
	
	private String name;
	private Breed breed;
	private int age;
	Scanner scn = new Scanner(System.in);
	
	public Dog() {
		input(scn);
	}
	
	public Dog(String name, Breed breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public boolean ageDogs(Dog d){
		if(this.age>d.age){
			return true;
		}
		return false;
		
	}

	private void input(Scanner scn) {
		System.out.println("Input name ");
		name = scn.nextLine();
		System.out.println("Input age");
		age = Integer.parseInt(scn.nextLine());
		System.out.println("Input breed (boxer/borzoi/dvornyaga) in lowercase");
		breed = Breed.valueOf(scn.nextLine());
		String breed1 = breed.toString();
		
		switch(breed1.toLowerCase()){
			case "boxer": breed = Breed.boxer;
		break;
			case "borzoi":breed = Breed.borzoi;
		break;
			case "dvornyaga":breed = Breed.dvornyaga;
		default:
			System.out.println("Incorrect breed");
		}
		

		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void  setBreed(Breed breed) {
		this.breed = breed;
		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public boolean ageDog(Dog dog){
		if (this.age > dog.age){
			return true;
		}
		else {
			return false;
		}
	}


}
