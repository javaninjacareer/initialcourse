package bbva.theninjaproject.carrerajava.clase07.curricula;

public interface Aprobable {
	
	public static final int NOTA_MINIMA_APRUEBA = 4;
	
	public static final int EXAMEN_FINAL = 0;
	public static final int ENTREGA_TF   = 1;
	public static final int PROMOCIONA   = 2;
	
	public boolean aprovado(int notaAlumno);

}
