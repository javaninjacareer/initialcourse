package bbva.theninjaproject.carrerajava.clase07.participantes;

import java.util.ArrayList;
import java.util.List;

import bbva.theninjaproject.carrerajava.clase07.curricula.Materia;

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

	public int getPromedioInt() {
		return (int) Math.floor(this.getPromedio());
	}
	
	public void agregarNota(Materia materia, int nota) {
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
