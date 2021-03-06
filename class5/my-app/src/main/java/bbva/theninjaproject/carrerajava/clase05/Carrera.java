package bbva.theninjaproject.carrerajava.clase05;

import java.util.HashMap;
import java.util.Map;

public class Carrera {

	String nombre;
	
	Map<String, Curso> cursos = new HashMap<String, Curso>();

	public Carrera(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addCurso(Curso curso) {
		this.cursos.put(curso.code, curso);
	}

	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre
				    + ", cursos=" + cursos + "]";
	}

	/**
	 *
	 * @param codeCurso
	 * @return True si contiene el curso
	 */
	public boolean contiene(String codeCurso) {
		
		// return this.cursos.get(codeCurso) != null;
		
		return this.cursos.containsKey(codeCurso);
	}
	
	
	
	/**
	 *
	 * @param codeCurso
	 * @return elimina un curso de la carrera
	 */
	public void eliminar(String codeCurso) {
		this.cursos.remove(codeCurso);
	}
	
	
	/**
	 * 
	 * @return la cantidad de la colección
	 */
	public int cantidad() {
		return this.cursos.size();
	}
	
}
