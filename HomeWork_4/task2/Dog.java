package task2;

public class Dog {

	private String name;
	private int age;
	private Breed breed;

	public Dog() {

	}

	public Dog(String name, int age, Breed breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public boolean compareAge(Dog dog){
		if(this.getAge()>dog.getAge()){
			return true;
			
		}else{
			return false;
		}
	}

	//?
	public static Dog oldestDog(Dog dog1, Dog dog2, Dog dog3) {

		int age1 = dog1.getAge();
		int age2 = dog2.getAge();
		int age3 = dog3.getAge();

		int maxAge = 0;
		Dog dog = null;

		if (age1 > age2) {
			maxAge = age1;
		} else {
			maxAge = age2;
		}
		if (age3 > maxAge) {
			maxAge = age3;
		};
		
		if (maxAge == dog1.getAge()) {
			dog = dog1;
		} else if (maxAge == dog2.getAge()) {
			dog = dog2;
		} else if (maxAge == dog3.getAge()) {
			dog = dog3;
		}
		return dog;
	}

	// find same names , compare by name
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
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Breed getBreed() {
		return breed;
	}

	

	@Override
	public String toString() {
		return "Dog [name= " + name + ", age=" + age + ", breed=" + breed + "]";
	}

}
