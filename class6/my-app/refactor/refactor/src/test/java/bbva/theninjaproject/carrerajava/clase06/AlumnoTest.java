package bbva.theninjaproject.carrerajava.clase06;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AlumnoTest {

	@Test
	public void testAlumnoJoven() {
		Alumno jonathan = new Alumno("Alumno", "Joven", 31);
		assertEquals("Joven", jonathan.getSeniority());
	}
	
	@Test
	public void testAlumnoJovato() {
		Alumno fabian = new Alumno("Alumno", "Con Experiencia", 58);
		assertEquals("Jovato", fabian.getSeniority());
	}
	
	@Test
	public void testPromedioCursada() {
		Alumno juanPablo = new Alumno("Alumno", "Calificado", 27);
		juanPablo.agregarNota(8);
		juanPablo.agregarNota(6);
		juanPablo.agregarNota(10);
		assertEquals(8, juanPablo.getPromedio(), 0.5);
	}
}
