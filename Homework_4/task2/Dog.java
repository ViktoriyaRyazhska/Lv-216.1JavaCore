package task2;

public class Dog {
	private String name;
	private String breed;
	private int age;
	public static void main(String[] args) {

		Dog dog1 = new Dog("Sharik", "BIG", 25);
		Dog dog2 = new Dog("Garik", "MEDIUM", 23);
		Dog dog3 = new Dog("Tarik", "BIG", 24);
		
		if (dog1.getName() == dog2.getName() || dog1.getName() == dog3.getName() || dog3.getName() == dog2.getName()) {
			System.out.println("equal names");
		} else {
			System.out.println("don't equal names");
		}
		
		
		if (dog1.getAge() > dog2.getAge()) {
			if (dog1.getAge() > dog3.getAge()) {
				System.out.println(dog1.getName());
			} else {
				System.out.println(dog3.getName());
			}
		} else {
			if (dog2.getAge() > dog3.getAge()) {
				System.out.println(dog2.getName());
			} else {
				System.out.println(dog3.getName());
			}
		}

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	enum Breed {
		BIG, MEDIUM, SMALL, HEIGH;
	}

	public  Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;

	}


	
}
