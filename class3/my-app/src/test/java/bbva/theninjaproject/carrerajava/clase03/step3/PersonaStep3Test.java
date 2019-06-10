package bbva.theninjaproject.carrerajava.clase03.step3;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonaStep3Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test  
	public void test_mariano_1990() {
	
		// Mariano  Nacido en 1990
		PersonaStep3 p1 = new PersonaStep3("Mariano", "1990122");
		
		assertEquals(p1.saludo(), "Hola Mariano del 90!");
	}


	@Test
	public void test_jorge_1982() throws ParseException {
	
		// Jorge  Nacido en 1982
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		Date date = sdf.parse(dateInString);
		
		PersonaStep3 p2 = new PersonaStep3("Jorge", date);
		assertEquals(p2.saludo(), "Hola Jorge del 82!");		
	}

}
