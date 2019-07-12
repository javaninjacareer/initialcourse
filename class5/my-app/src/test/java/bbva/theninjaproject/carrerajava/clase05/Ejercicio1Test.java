package bbva.theninjaproject.carrerajava.clase05;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Ejercicio1Test {

	@Test
	public void testAgregarPersonaACurso() {
		Curso javaNinja = new Curso("Java Inicial");
		Persona javacha = new Persona("Javier", "Da Silva");
		javaNinja.inscribirAlumno(javacha);
		
		javaNinja.inscribirAlumno(javacha);
		
		javaNinja.inscribirAlumno(javacha);
		
		javaNinja.inscribirAlumno(javacha);
		
		javaNinja.inscribirAlumno(javacha);
		
		
		assertTrue(javaNinja.estaInscripto(javacha));
		
		int contadorDeJavachas = 0;
		for (Persona alumno : javaNinja.inscriptos) {
			if (alumno.getApellido().equals(javacha.getApellido())) {
				contadorDeJavachas++;
			}
		}
		
		assertEquals(1, contadorDeJavachas);
	}

//	@Test
//	public void testAgregarOtraPersonaACurso() {
//		Curso javaNinja = new Curso("Java Inicial");
//		Persona javacha = new Persona("Javier", "Da Silva");
//		javaNinja.inscribirAlumno(javacha);
//		Persona javachaDeNuevo = new Persona("Javier", "Da Silva");
//		assertTrue(javaNinja.estaInscripto(javachaDeNuevo));
//	}

}
