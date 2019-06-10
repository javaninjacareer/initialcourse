package bbva.theninjaproject.carrerajava.clase03.step3;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonaStep3Test {

	PersonaStep3 mariano;
	PersonaStep3 jorge;
	
	@Before
	public void setUp() throws Exception {

		// Mariano  Nacido en 1990
		this.mariano = new PersonaStep3("Mariano", "1990-01-24");

		// Jorge  Nacido en 1982		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate jorge_fechaNac = LocalDate.parse("31/03/1982", fmt);
		jorge = new PersonaStep3("Jorge", jorge_fechaNac);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test  
	public void test_mariano_1990() {
			
		assertEquals(mariano.saludo(), "Hola Mariano del 1990, tu edad es 29");
	}


	@Test
	public void test_jorge_1982() throws ParseException {
	
		assertEquals(jorge.saludo(), "Hola Jorge del 1982, tu edad es 37");		
	}

}
