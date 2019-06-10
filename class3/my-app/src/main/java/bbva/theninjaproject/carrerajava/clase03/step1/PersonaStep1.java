package bbva.theninjaproject.carrerajava.clase03.step1;

/**
 * Step 01:
 * Ejemplo de varias instancias de una misma clase:
 * 
 * 
 * Persona p1 = new Persona();
 * p1.nombre = "Mariano";
 * p1.saludar();
 * 
 * Persona p2 = new Persona();
 * p2.nombre = "Jorge";
 * p2.saludar();
 *
 */
public class PersonaStep1 {
	
	public String nombre;
	
	public void saludar() {
		System.out.println("Hola " + this.nombre);
	}

}
