package Lesson4;

enum BreedDog {
	Basenji, German_Shepherd_Dog, Siberian_Husky
}

public class Homework_2_Dog {
	// fields name, breed, age
	private String name;
	private BreedDog breed;
	private int age;

	// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BreedDog getBreed() {
		return breed;
	}

	public void setBreed(BreedDog breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// constructor with three parameters
	public Homework_2_Dog(String name, BreedDog breed, int age) {
		setName(name);
		setBreed(breed);
		setAge(age);
	}

	// method to check if there is no two dogs with the same name
	public boolean checkSameName(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Homework_2_Dog other = (Homework_2_Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// to define to display the name and the kind of the oldest dog
	public boolean oldestDogName(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Homework_2_Dog other = (Homework_2_Dog) obj;
		if (age > other.age) {
			return true;
		}
		return false;
	}

}
