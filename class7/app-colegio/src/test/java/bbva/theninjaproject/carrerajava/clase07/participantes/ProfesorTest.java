package bbva.theninjaproject.carrerajava.clase07.participantes;

import org.junit.Test;

import bbva.theninjaproject.carrerajava.clase07.participantes.Profesor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class ProfesorTest {

	Profesor chechoJovenYVigoroso;
	Profesor javachaConCanas;
	Profesor martin;
	Profesor pablo;
	
	@Before
	public void init() {
		chechoJovenYVigoroso = new Profesor("Diego",  "Alfonso Oderigo", 36);
		javachaConCanas      = new Profesor("Javier", "Da Silva", 60);
		martin               = new Profesor("Martin", "Banfi", 27);
		pablo                = new Profesor("Pabo",   "Inchausti", 44);
	}
	
	@Test
	public void testProfeJoven() {
		assertEquals("Joven", chechoJovenYVigoroso.getSeniority());
	}
	
	@Test
	public void testProfeJovato() {
		assertEquals("Jovato", javachaConCanas.getSeniority());
	}
	
	@Test
	public void testValoracionMedia() {
		martin.agregarValoracion(10);
		martin.agregarValoracion(9);
		martin.agregarValoracion(10);
		assertEquals(10, martin.getValoracionMedia(), 0.5);
	}

	@Test
	public void testFirmaProfe() {
		assertEquals("Prof. Javier Da Silva", javachaConCanas.getFirma());
	}
}
