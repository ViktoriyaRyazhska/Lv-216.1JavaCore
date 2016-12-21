package task2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DogTest {

	Dog dog  = new Dog();
	
	Dog dog1 = new Dog("Sharic", 10, Breed.BOXER);

	Dog dog2 = new Dog("Pepito", 40, Breed.BULLDOG);

	Dog dog3 = new Dog("Pepito", 21, Breed.CHIHUAHUA);
	
	
	
	@Test
	public void testEquals() {
		assertFalse(dog1.equals(dog2));
		assertTrue(dog2.equals(dog3));
		assertFalse(dog3.equals(dog1));
		
		//
		
		assertEquals(false,dog1.equals(dog2));
		assertEquals(true,dog2.equals(dog3));
		assertEquals(false,dog3.equals(dog1));
		
	}
	
	//?
	@Test
	public void testOldestAge(){
		assertNotNull(dog.oldestDog(dog1, dog2, dog3));
		
		
	}
	
	@Test
	public void testCompareAge(){
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
