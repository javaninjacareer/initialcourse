package bbva.theninjaproject.carrerajava.clase03.step1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PersonaStep1Test {


	@Before
	public void setUp() throws Exception {
		System.out.println("PersonaStep1Test - Incio de los Test Unitarios");
	}


	@After
	public void tearDown() throws Exception {
		System.out.println("PersonaStep1Test - Fin de los Test Unitarios");
	}

	@Test
	public void testSaludar() {
		
		PersonaStep1 p1 = new PersonaStep1();
		p1.nombre = "Mariano";
		
		assertEquals(p1.saludo(), "Hola Mariano");
		
		p1.nombre = "Jorge";
		assertEquals(p1.saludo(), "Hola Jorge");
		
	}

}
