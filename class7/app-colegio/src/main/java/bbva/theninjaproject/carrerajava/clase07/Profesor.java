package bbva.theninjaproject.carrerajava.clase07;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
	private List<Integer> valoraciones;

	public Profesor(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		valoraciones = new ArrayList<Integer>();
	}

	public double getValoracionMedia() {
		if (valoraciones.isEmpty()) return 0;
		double acumulador = 0;
		for (Integer valoracion : valoraciones) {
			acumulador += valoracion;
		}
		return acumulador / valoraciones.size();
	}

	public void agregarValoracion(int valoracion) {
		valoraciones.add(valoracion);
	}

	@Override
	public String toString(){
		return "** PROFESOR **\n Nombre: " + this.getNombre() + " " + this.getApellido() + "\n Edad: " + this.getEdad() + "\n Valoración: " + getValoracionMedia(); 
	}
	
	public String getSeniority() {
		// return this.edad < 58 ? "Joven" : "Jovato";
		return getEdad() < 58 ? "Joven" : "Jovato";
	}
}
