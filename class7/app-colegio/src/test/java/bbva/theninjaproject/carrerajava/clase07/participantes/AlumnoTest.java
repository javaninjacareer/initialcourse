package bbva.theninjaproject.carrerajava.clase07.participantes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bbva.theninjaproject.carrerajava.clase07.curricula.Aprobable;
import bbva.theninjaproject.carrerajava.clase07.curricula.Materia;

public class AlumnoTest {

	Alumno jonathan;
	Alumno fabian;
	Alumno juanPablo;
	
	@Before
	public void init() {
		jonathan = new Alumno("Jonathan", "C.", 31);
		fabian = new Alumno("Fabián", "F.", 58);
		juanPablo = new Alumno("Juan Pablo", "Firrincho", 27);
	}
	
	@Test
	public void testAlumnoJoven() {
		assertEquals("Joven", jonathan.getSeniority());
	}
	
	@Test
	public void testAlumnoJovato() {
		assertEquals("Jovato", fabian.getSeniority());
	}
	
	@Test
	public void testPromedioCursada() {
		
		Materia matematica = new Materia("Matemática", Aprobable.EXAMEN_FINAL, 7);
		
		juanPablo.agregarNota(matematica, 8);
		juanPablo.agregarNota(matematica, 6);
		juanPablo.agregarNota(matematica, 10);
		assertEquals(8, juanPablo.getPromedio(), 0.5);
	}
	
	@Test
	public void testFirmaAlumno() {
		assertEquals("Jonathan C.", jonathan.getFirma());
		assertEquals("Fabián F.", fabian.getFirma());
	}
}
