package bbva.theninjaproject.carrerajava.clase07.curricula;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import bbva.theninjaproject.carrerajava.clase07.personal.Profesor;

public class MateriaTest {
	
	@Test
	public void testProfeJoven() {
		Profesor chechoJovenYVigoroso = new Profesor("Diego", "Alfonso Oderigo", 36);
		assertEquals("Joven", chechoJovenYVigoroso.getSeniority());
	}

}
