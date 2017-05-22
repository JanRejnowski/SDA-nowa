package pl.sdacademy.main;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pl.sdacademy.model.Cat;

public class TestCoffe {

	 @Test
	    public void myFirstTest() {
		// given
		Cat cat = new Cat("Kotek");

		// when
		String name = cat.getName();

		// then
		assertTrue(name.equals("Kotek"));
	    }

	    @Test
	    public void myFirstTest2() {
		// given
		Cat cat = new Cat("Kotek");

		// when
		String name = cat.getName();

		// then
		assertTrue(name.equals("Piesek"));
	    }
}
