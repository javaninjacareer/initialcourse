package bbva.theninjaproject.carrerajava.clase03.step2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bbva.theninjaproject.carrerajava.clase03.step1.PersonaStep1;

public class PersonaStep2Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testSaludar() {
		
		PersonaStep2 p1 = new PersonaStep2("Mariano");
		PersonaStep2 p2 = new PersonaStep2("Jorge");
		
		assertEquals(p1.saludo(), "Hola Mariano");
		assertEquals(p2.saludo(), "Hola Jorge");
		
	}

}
