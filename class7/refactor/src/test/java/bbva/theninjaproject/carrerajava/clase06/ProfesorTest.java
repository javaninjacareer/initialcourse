package bbva.theninjaproject.carrerajava.clase06;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProfesorTest {

	@Test
	public void testProfeJoven() {
		Profesor chechoJovenYVigoroso = new Profesor("Diego", "Alfonso Oderigo", 36);
		assertEquals("Joven", chechoJovenYVigoroso.getSeniority());
	}
	
	@Test
	public void testProfeJovato() {
		Profesor javachaConCanas = new Profesor("Javier", "Da Silva", 60);
		assertEquals("Jovato", javachaConCanas.getSeniority());
	}
	
	@Test
	public void testValoracionMedia() {
		Profesor martin = new Profesor("Martin", "Banfi", 27);
		martin.agregarValoracion(10);
		martin.agregarValoracion(9);
		martin.agregarValoracion(10);
		assertEquals(10, martin.getValoracionMedia(), 0.5);
	}
}
