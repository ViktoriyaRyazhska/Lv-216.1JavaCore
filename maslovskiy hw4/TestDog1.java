import static org.junit.Assert.*;

import org.junit.Test;

public class TestDog1 {
	
	Dog d1 = new Dog("bobik",Breed.Borzoi,10);
	Dog d2 = new Dog("sharik",Breed.Boxer,1);
	Dog d3 = new Dog("bobik",Breed.Dvornyaga,5);

	@Test
	public void testEqualsObject() {
		assertEquals(true, d1.equals(d3));
	}

	@Test
	public void testAgeDogs() {
		assertEquals(true,d1.ageDog(d2));
		assertEquals(false, d2.ageDog(d3));
	}

}
