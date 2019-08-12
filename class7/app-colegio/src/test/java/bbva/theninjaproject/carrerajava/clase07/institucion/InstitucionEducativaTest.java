package bbva.theninjaproject.carrerajava.clase07.institucion;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import bbva.theninjaproject.carrerajava.clase07.participantes.Alumno;
import bbva.theninjaproject.carrerajava.clase07.participantes.Persona;

public class InstitucionEducativaTest {

	@Test
	public void testPertenenciaAlumnoAInstitucion() {
		Alumno alumnoDenis = new Alumno("Sergio", "Denis", 45);
		Persona sergio = alumnoDenis; 
		InstitucionEducativa bbvaCollege = new InstitucionEducativa();
		bbvaCollege.inscribirAlumnoIngresante(alumnoDenis);
		assertTrue(sergio.perteneceA(bbvaCollege));
	}
}
