package Lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Homework_2_DogTest {

	Homework_2_Dog d1 = new Homework_2_Dog("Tyson", BreedDog.German_Shepherd_Dog, 15);
	Homework_2_Dog d2 = new Homework_2_Dog("Rex", BreedDog.Basenji, 8);
	Homework_2_Dog d3 = new Homework_2_Dog("Tyson", BreedDog.Siberian_Husky, 3);

	@Test
	public void testCheckSameName1() {
		assertEquals(true, d1.checkSameName(d3));
	}

	@Test
	public void testCheckSameName2() {
		assertFalse(d1.checkSameName(d2));
	}

	@Test
	public void testCheckSameName3() {
		assertNotEquals(true, d2.checkSameName(d3));
	}
	
	@Test
	public void testOldestDogName(){
		assertTrue(d1.oldestDogName(d2) && d1.oldestDogName(d3));
	}

}
