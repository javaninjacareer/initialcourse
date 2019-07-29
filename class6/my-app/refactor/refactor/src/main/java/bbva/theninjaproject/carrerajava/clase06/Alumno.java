package bbva.theninjaproject.carrerajava.clase06;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
	private List<Integer> notasDeCursada;

	public Alumno(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		notasDeCursada = new ArrayList<Integer>();
	}

	public double getPromedio() {
		if (notasDeCursada.isEmpty()) return 0;
		double acumulador = 0;
		for (Integer nota : notasDeCursada) {
			acumulador += nota;
		}
		return acumulador / notasDeCursada.size();
	}

	public void agregarNota(int nota) {
		notasDeCursada.add(nota);
	}

	@Override
	public String toString(){
		return "** ALUMNO **\n Nombre: " + this.getNombre() + " " + this.getApellido() + "\n Edad: " + this.getEdad() + "\n Promedio: " + getPromedio(); 
	}
	
	public String getSeniority() {
		// return this.edad < 58 ? "Joven" : "Jovato";
		return getEdad() < 58 ? "Joven" : "Jovato";
	}
}
