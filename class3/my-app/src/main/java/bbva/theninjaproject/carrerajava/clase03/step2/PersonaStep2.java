package bbva.theninjaproject.carrerajava.clase03.step2;

/**
 * 
 * STEP 2: Ejemplo de constructor básico.
 * 
 * public PersonaStep2(String nombre){
 *   this.nombre = nombre;
 *   return this;
 * }
 * 
 * PersonaStep2 p1 = new PersonaStep2("Mariano");
 *
 */
public class PersonaStep2 {

	public String nombre;
	
	public PersonaStep2(String nombre) {
		this.nombre = nombre;
	}
	
	public String saludo() {
		return "Hola " + this.nombre;
	}
	
	public void saludar() {
		System.out.println(this.saludo());
	}

}
