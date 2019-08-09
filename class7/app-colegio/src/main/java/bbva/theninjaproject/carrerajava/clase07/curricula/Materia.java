package bbva.theninjaproject.carrerajava.clase07.curricula;

public class Materia {

	String nombre;
	double nota;
	
	
	public Materia(String nombre, int nota) {
		this.nombre = nombre;
		this.nota   = nota;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", nota=" + nota + ", getNombre()=" + getNombre() + ", getNota()="
				+ getNota() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
