package pl.sdacademy.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pl.sdacademy.model.Laptop;

public class IListTest {

	IList<Laptop> pustaListaLaptopow;
	IList<Laptop> niePustaListaLaptopow;
	boolean result;
	Laptop laptopMarka;
	Laptop laptopAdama;
	
	@Before
	public void setUp() {
		pustaListaLaptopow = new List<>();
		result = false;
		laptopMarka = new Laptop("Marka");
		laptopAdama = new Laptop("Adama");
		niePustaListaLaptopow = new List<>();
		niePustaListaLaptopow.add(laptopMarka);
		niePustaListaLaptopow.add(laptopAdama);
	}
	
	@Test
	public void shouldAddElementIfListIsEmpty() {
		Laptop laptopMarka = new Laptop("Marka");
		pustaListaLaptopow.add(laptopMarka);

		Laptop pierwszyElementZListy = pustaListaLaptopow.get(0);
		if (pierwszyElementZListy.equals(laptopMarka)) {
			result = true;
		}

		assertTrue(result);

	}
	
	@Test
	public void shouldGetFirstElementOfNonEmptyList() {
		if (niePustaListaLaptopow.getFirst().equals(laptopMarka)) {
			result = true;
		}
		assertTrue(result);

	}
	
	@Test
	public void shouldGetLastElementOfNonEmptyList() {
		if (niePustaListaLaptopow.getLast().equals(laptopAdama)) {
			result = true;
		}
		assertTrue(result);
	}
	
	@Test
	public void shouldReturnNullIfThereAreNoElements() {
		if (pustaListaLaptopow.isEmpty()) {
			result = true;
		}
		assertTrue(result);
	}
	
	@Test
	public void shouldGetSpecificElementFromTheList() {

		assertTrue(laptopMarka.equals(niePustaListaLaptopow.get(0)));
	}
	
	@Test
	public void shouldRemoveElementFromNonEmptyList() {

		niePustaListaLaptopow.remove(0);
		assertTrue(niePustaListaLaptopow.get(0).equals(laptopAdama));
	}
	
	@Test
	public void shouldThrowExceptioIfGetCalledOnEmptyList() {
		try {
			pustaListaLaptopow.get(0);
		} catch (Exception e) {
			result = true;
		}
		assertTrue(result);
	}
	
	@Test
	public void shouldThrowExceptionIfRemoveCalledOnEmptyList() {
		try {
			pustaListaLaptopow.remove(0);
		} catch (Exception e) {
			result = true;
		}
		assertTrue(result);
	}

}
