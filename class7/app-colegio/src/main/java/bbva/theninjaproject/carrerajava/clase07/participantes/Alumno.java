package bbva.theninjaproject.carrerajava.clase07.participantes;

import java.util.ArrayList;
import java.util.List;

import bbva.theninjaproject.carrerajava.clase07.curricula.Materia;

public class Alumno extends Persona {
	
	
	private List<Integer> notasDeCursada;
	
	private boolean tf_entregado  = false;
	private int     tf_cant_hojas = 0;
	
	public Alumno(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		notasDeCursada = new ArrayList<Integer>();
	}

	
	public void entregarTrabajo(int tf_cant_hojas) {

		this.tf_entregado  = true;
		this.tf_cant_hojas = tf_cant_hojas;
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


	public boolean isTf_entregado() {
		return tf_entregado;
	}


	public int getTf_cant_hojas() {
		return tf_cant_hojas;
	}
}
