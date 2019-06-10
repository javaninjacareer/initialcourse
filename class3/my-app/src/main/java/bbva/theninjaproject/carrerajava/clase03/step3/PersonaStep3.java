package bbva.theninjaproject.carrerajava.clase03.step3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * Step #3
 * 
 * Ejemplo de modificadores de acceso: fecha nacimiento y edad. 
 * 
 * Explicación sobre la no modificación directa de un atributo (edad), 
 * sino su cálculo en base a otro atributo (fecha de nacimiento).
 *
 */
public class PersonaStep3 {
	
	public String nombre;
	public Date fechaNacimiento;
	private int edad;

	
	public PersonaStep3(String nombre, String fechaNacimiento_yyyyMMdd) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		try {
			this.fechaNacimiento = sdf.parse(fechaNacimiento_yyyyMMdd);
		} catch (ParseException e) {
			System.out.print("Fecha de Nacimiento debe ser formato yyyyMMdd");
			e.printStackTrace();
		}
		
		this.nombre = nombre;
	}
	
	public PersonaStep3(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String saludo() {
		return "Hola " + this.nombre + " del " + this.fechaNacimiento.getYear() + "!";
	}
	
	public void saludar() {
		System.out.println(this.saludo());
	}
}
