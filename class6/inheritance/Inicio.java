package bbva.theninjaproject.carrerajava.clase06;

public class Inicio {

	public static void main(String[] args) {
		Alumno alum1 = new Alumno("Martín", "Banfi", 27, 8);
		Profesor prof1 = new Profesor("Diego", "Oderigo", 36, 8);
		System.out.println(alum1.toString());
		System.out.println(prof1.toString());
	}

}
