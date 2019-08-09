package bbva.theninjaproject.carrerajava.clase06;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class Ejercicio1Test {
	
	private Curso introJavaTurnoTarde = new Curso("JAVA01", "Introduccion a Java y POO");
	private Curso introJavaTurnoNoche = new Curso("JAVA01", "Introduccion a Java y POO");
	private Profesor martin = new Profesor("Martin", "Banfi", 27, 10);
	private Profesor checho = new Profesor("Diego", "Alfonso Oderigo", 36, 4);
	
	@Before
	public void setUp() {
		introJavaTurnoTarde.asignarDocente(martin);
		introJavaTurnoNoche.asignarDocente(checho);
	}

	@Test
	public void testObtenerValoracionCurso() {
		assertEquals(10, introJavaTurnoTarde.obtenerValoracion());
		assertEquals(4, introJavaTurnoNoche.obtenerValoracion());
	}
	
	@Test
	public void testObtenerNombreCatedra() {
		assertEquals(
				"Introduccion a Java y POO - Profesor Martin Banfi", 
				introJavaTurnoTarde.getCatedra());
		assertEquals(
				"Introduccion a Java y POO - Profesor Diego Alfonso Oderigo", 
				introJavaTurnoNoche.getCatedra());
	}
}
