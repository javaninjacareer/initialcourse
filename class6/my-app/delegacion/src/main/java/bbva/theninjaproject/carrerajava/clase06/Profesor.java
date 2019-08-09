package bbva.theninjaproject.carrerajava.clase06;

public class Profesor extends Persona {
	private int valoracion;

	public Profesor(String nombre, String apellido, int edad, int valoracion) {
		super(nombre, apellido, edad);
		this.valoracion = valoracion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString(){
		return "** PROFESOR **\n Nombre: " + this.getNombre() + " " + this.getApellido() + "\n Edad: " + this.getEdad() + "\n Valoración: " + valoracion; 
	}
}
