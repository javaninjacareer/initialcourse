package bbva.theninjaproject.carrerajava.clase05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Curso {
	
	String nombre; 
	String code;
	
	 List<Persona> inscriptos = new ArrayList<Persona>();
//	Set<Persona> inscriptos = new HashSet<Persona>();
	
	public Curso (String nombre) {
		this.nombre = nombre;
	}
	
	public Curso (String code, String nombre) {
		this.code   = code;
		this.nombre = nombre;
	}

	/**
	 * Inscribe un alumno en el curso 
	 * 
	 * @param alumno
	 */
	public void inscribirAlumno(Persona alumno) {
		
		inscriptos.add(alumno);

	}
	
	/**
	 * Retorna si un alumno está inscripto en un curso
	 * 
	 * @param alumno
	 * @return
	 */
	public boolean estaInscripto(Persona alumno) {
		
		Iterator<Persona> itera = inscriptos.iterator();
		while(itera.hasNext()){
			Persona e = itera.next();
			System.out.print(e + " / ");
			
			if (e.getApellido().equals(alumno.getApellido())) {
				
				System.out.print("\n\nCreo que está inscripto ... ");
				
				return true;
			}
		}
		return false;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + getNombre() + 
				      ", code=" + getCode() + 
				 ", incriptos=" + inscriptos.size() + "]";
	}

}
