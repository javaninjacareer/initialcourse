import ar.com.bbva.carrerajava.modelo.*;

public class Demo1 {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.apellido = "May";
		persona1.nombre = "Brian";
		persona1.edad = 71;
		
		persona1.saludar();
	}
}

