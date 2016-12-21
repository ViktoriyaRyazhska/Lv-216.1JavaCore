package HomeWork4;

public class RunDog {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Sharik", Breeds.DALMATIAN, 9);
		Dog dog2 = new Dog("Rex", Breeds.CHIHUAHUA, 3);
		Dog dog3 = new Dog("Rex", Breeds.EURASIER, 5);
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		if (dog1.equals(dog2)) {
			System.out.println("Dog1 and dog2 has the same name");
		}
		
		if (dog1.equals(dog3)) {
			System.out.println("Dog1 and dog3 has the same name");
		}
		
		if (dog2.equals(dog3)) {
			System.out.println("Dog2 and dog3 has the same name");
		}
		
		
		
		if ((dog1.maxThan(dog2)) &&  (dog1.maxThan(dog3))){
			System.out.println("The oldest dog is: " + dog1.getName() + " breed of " + dog1.getBreed());
		}
		
		if ((dog2.maxThan(dog1)) &&  (dog2.maxThan(dog3))){
			System.out.println("The oldest dog is: " + dog2.getName() + " breed of " + dog2.getBreed());
		}
		
		if ((dog3.maxThan(dog1)) &&  (dog3.maxThan(dog2))){
			System.out.println("The oldest dog is: " + dog3.getName() + " breed of " + dog3.getBreed());
		}

	}

}
