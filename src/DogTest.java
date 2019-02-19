import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	@Test
	public void test() {
		Dog spike = new Dog();
		assertEquals("woof", spike.bark());
	}

}
