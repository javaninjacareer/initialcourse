package bbva.theninjaproject.carrerajava.clase07.institucion;

import java.util.List;

import bbva.theninjaproject.carrerajava.clase07.participantes.Alumno;
import bbva.theninjaproject.carrerajava.clase07.participantes.Profesor;

public class InstitucionEducativa {

	private List<Alumno> alumnos;
	private List<Profesor> docentes;
	
	public void contratarProfesor(Profesor profesor) {
		docentes.add(profesor);
	}
	
	public void inscribirAlumnoIngresante(Alumno ingresante) {
		alumnos.add(ingresante);
	}
	
	public boolean esDocenteDeLaInstitucion(Profesor profesor) {
		return docentes.contains(profesor);
	}
	
	public boolean esAlumnoDeLaInstitucion(Alumno alumno) {
		return alumnos.contains(alumno);
	}
}
