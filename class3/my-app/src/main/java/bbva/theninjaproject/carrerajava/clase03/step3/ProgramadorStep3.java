package bbva.theninjaproject.carrerajava.clase03.step3;

public class ProgramadorStep3 extends PersonaStep3 {

	public ProgramadorStep3(String nombre, String fechaNacimiento_yyyyMMdd) {
		super(nombre, fechaNacimiento_yyyyMMdd);
		
		super.profesion = "Programador";
	}

	
	public String saludo() {
		return super.saludo() + " vos sos " + super.profesion;
	}

}
