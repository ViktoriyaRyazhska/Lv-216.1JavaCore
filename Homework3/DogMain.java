package styechkevych;

public class DogMain {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("vasya", Breed.Affenpinscher, 3);
		Dog dog2 = new Dog("Dog", Breed.Basenji, 5);
		Dog dog3 = new Dog("Lol", Breed.Beagle, 4);
		
		if((dog1.getName().equals(dog2.getName())) || (dog1.getName().equals(dog3.getName()))){
			System.out.println("Two dogs with the same name");
		} else {
			System.out.println("No two dogs with the same name");
		}
		
		if((dog1.getAge()>dog2.getAge()) && (dog1.getAge()>dog3.getAge())){
			System.out.println(dog1.getName() + " " + dog1.getBreed());
		} else if((dog2.getAge()>dog1.getAge()) && (dog2.getAge()>dog3.getAge())){
			System.out.println(dog2.getName() + " " + dog2.getBreed());
		} else if((dog3.getAge()>dog1.getAge()) && (dog3.getAge()>dog3.getAge())){
			System.out.println(dog3.getName() + " " + dog3.getBreed());
		}
		

	}

}
