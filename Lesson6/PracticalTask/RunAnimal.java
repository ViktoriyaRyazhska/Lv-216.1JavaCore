package lesson6;

public class RunAnimal {

	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		
		animal[0] = new Dog("Barsik");
		animal[1] = new Dog("Bobik");
		animal[2] = new Cat("Murzik");
		animal[3] = new Cat("Marsik");
		
		for(int i=0; i <animal.length; i++){
			animal[i].voice();
			animal[i].feed();
		}

	}

}
