
package ar.com.bbva.carrerajava.modelo;

public class Persona {

	public String nombre;
	public String apellido;
	public int edad;
	
	public void saludar() {
		System.out.println("Que haces " + nombre + "!!" );
		System.out.println("Estas viejo " + apellido + ", ya tenes " + edad + " pirulos." );
	}
}



