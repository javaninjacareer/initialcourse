package bbva.theninjaproject.carrerajava.clase06;

public class Alumno extends Persona {
	private int promedio;

	public Alumno(String nombre, String apellido, int edad, int promedio) {
		super(nombre, apellido, edad);
		this.promedio = promedio;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString(){
		return "** ALUMNO **\n Nombre: " + this.getNombre() + " " + this.getApellido() + "\n Edad: " + this.getEdad() + "\n Promedio: " + promedio; 
	}
}
