package bbva.theninjaproject.carrerajava.clase03.step3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * 
 * Step #3
 * 
 * Ejemplo de modificadores de acceso: fecha nacimiento y edad. 
 * 
 * Explicación sobre la no modificación directa de un atributo (edad), 
 * sino su cálculo en base a otro atributo (fecha de nacimiento).
 * 
 *
 */
public class PersonaStep3 {
	
	public String nombre;
	public LocalDate fechaNacimiento;
	private int edad;

	
	public PersonaStep3(String nombre, String fechaNacimiento_yyyyMMdd) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		this.fechaNacimiento = LocalDate.parse(fechaNacimiento_yyyyMMdd, fmt);
		this.nombre = nombre;
	}
	
	public PersonaStep3(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int getEdad() {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento, ahora);
		return periodo.getYears();
	}
	
	public String saludo() {
		return "Hola " + this.nombre 
		     + " del " + this.fechaNacimiento.getYear() 
		     + ", tu edad es " + this.getEdad();
	}
	
	public void saludar() {
		System.out.println(this.saludo());
	}
}
