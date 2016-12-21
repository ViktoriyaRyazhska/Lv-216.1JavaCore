import static org.junit.Assert.*;

import org.junit.Test;

import HomeWork4.Breeds;
import HomeWork4.Dog;


public class TestDog {

	@Test
	public void testEqualsObject() {
		Dog dog1 = new Dog("Sharik", Breeds.DALMATIAN, 9);
		Dog dog2 = new Dog("Rex", Breeds.CHIHUAHUA, 3);
		Dog dog3 = new Dog("Rex", Breeds.EURASIER, 5);
		
		assertEquals(false, dog1.equals(dog3));
		assertEquals(true, dog2.equals(dog3));
	}
	
	
	@Test
	public void testMaxThan() {
		Dog dog1 = new Dog("Sharik", Breeds.DALMATIAN, 9);
		Dog dog2 = new Dog("Rex", Breeds.CHIHUAHUA, 3);
		Dog dog3 = new Dog("Rex", Breeds.EURASIER, 5);
		
		assertEquals(true, dog1.maxThan(dog2));
		assertEquals(false, dog2.maxThan(dog3));
	}

	
}
