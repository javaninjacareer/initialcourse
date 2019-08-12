package bbva.theninjaproject.carrerajava.clase07.institucion;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import bbva.theninjaproject.carrerajava.clase07.participantes.Alumno;
import bbva.theninjaproject.carrerajava.clase07.participantes.Persona;
import bbva.theninjaproject.carrerajava.clase07.participantes.Profesor;

public class InstitucionEducativaTest {

	@Test
	public void testPertenenciaAlumnoAInstitucion() {
		Alumno alumnoDenis = new Alumno("Sergio", "Denis", 45);
		Persona sergio = alumnoDenis; 
		InstitucionEducativa bbvaCollege = new InstitucionEducativa();
		bbvaCollege.inscribirAlumnoIngresante(alumnoDenis);
		assertTrue(sergio.perteneceA(bbvaCollege));
	}
	
	@Test
	public void testPertenenciaDocenteAInstitucion() {
		Profesor profeRicky = new Profesor("Ricardo", "Montaner", 45);
		Persona ricky = profeRicky; 
		InstitucionEducativa bbvaCollege = new InstitucionEducativa();
		bbvaCollege.contratarProfesor(profeRicky);
		assertTrue(ricky.perteneceA(bbvaCollege));
	}
}
