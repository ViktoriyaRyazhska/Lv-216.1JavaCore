package task2;

public class Main {

	public static void main(String[] args) {

		Dog dog1 = new Dog("Sharic", 10, Breed.BOXER);

		Dog dog2 = new Dog("Pepito", 40, Breed.BULLDOG);

		Dog dog3 = new Dog("Barsik", 21, Breed.CHIHUAHUA);
		
		
		System.out.println("Are  the name of dog  one  and two   is same : "+dog1.equals(dog2));
		System.out.println("Are  the name of dog  two  and three is same : "+dog2.equals(dog3));
		System.out.println("Are  the name of dog  three  and one is same : "+dog3.equals(dog1));
		System.out.println();
		System.out.println("The oldest dog is : "+Dog.oldestDog(dog1, dog2, dog3).getName());
		System.out.println("       His age is : " + Dog.oldestDog(dog1, dog2, dog3).getAge());
		System.out.println("        His beerd : " + Dog.oldestDog(dog1, dog2, dog3).getBreed());
		
		
		
	}		

}
