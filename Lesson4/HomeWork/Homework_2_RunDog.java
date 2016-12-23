package Lesson4;

public class Homework_2_RunDog {

	public static void main(String[] args) {

		// 3 instances of type Dog
		Homework_2_Dog dog1 = new Homework_2_Dog("Tyson",
				BreedDog.German_Shepherd_Dog, 25);
		Homework_2_Dog dog2 = new Homework_2_Dog("Rex", BreedDog.Basenji, 8);
		Homework_2_Dog dog3 = new Homework_2_Dog("Tyson",
				BreedDog.Siberian_Husky, 3);

		// check if there is no two dogs with the same name
		if (dog1.checkSameName(dog2) || dog1.checkSameName(dog3)) {
			System.out.println("Yes at least two dogs has the same name "
					+ dog1.getName());

		}
		// display the name and the kind of the oldest dog
		if (dog1.oldestDogName(dog2) && dog1.oldestDogName(dog3)) {
			System.out.println("The oldest dog is " + dog1.getName()
					+ " and he's " + dog1.getBreed());
		} else if (dog2.oldestDogName(dog1) && dog2.oldestDogName(dog3)) {
			System.out.println("The oldest dog is " + dog2.getName()
					+ " and he's " + dog2.getBreed());
		} else if (dog3.oldestDogName(dog1) && dog3.oldestDogName(dog2)) {
			System.out.println("The oldest dog is " + dog3.getName()
					+ " and he's " + dog3.getBreed());

		}
	}
}

