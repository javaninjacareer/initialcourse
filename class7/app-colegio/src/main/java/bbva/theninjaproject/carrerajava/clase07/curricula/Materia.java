package bbva.theninjaproject.carrerajava.clase07.curricula;

public class Materia implements Aprobable {
	
	private String nombre;
	private int tipoExamen;
	private int nota;
	private int[] parciales = { 0, 0, 0 };
	
	public Materia(String nombre) {
		this.nombre     = nombre;
		this.tipoExamen = EXAMEN_FINAL;
		this.nota       = NOTA_MINIMA_APRUEBA;
	}
	
	public Materia(String nombre, int tipoExamen) {
		this.nombre     = nombre;
		this.tipoExamen = tipoExamen;
		this.nota       = NOTA_MINIMA_APRUEBA;
	}
	
	public Materia(String nombre, int tipoExamen, int nota) {
		this.nombre     = nombre;
		this.tipoExamen = tipoExamen;
		this.nota       = nota;
	}

	public boolean aprovado(int notaAlumno) {
		
		if (this.tipoExamen == Aprobable.EXAMEN_FINAL) {
			return notaAlumno >= this.nota;
		}


		if (this.tipoExamen == Aprobable.PROMOCIONA) {
			return parciales[0] >= Aprobable.NOTA_MINIMA_APRUEBA 
			    && parciales[1] >= Aprobable.NOTA_MINIMA_APRUEBA
			    && parciales[2] >= Aprobable.NOTA_MINIMA_APRUEBA;
		}
		
		return false;
	}
	
	public boolean aprovado(boolean entrego_tf, int cantidad_paginas) {
	
		if (this.tipoExamen == Aprobable.ENTREGA_TF) {
			return entrego_tf  && cantidad_paginas >= CANT_MINIMA_HOJAS_TF;
		}
		
		return false;
	}
	

	public boolean aprovado(int[] parciales) {
		
		if (this.tipoExamen == Aprobable.PROMOCIONA) {
			return parciales[0] >= Aprobable.NOTA_MINIMA_APRUEBA 
			    && parciales[1] >= Aprobable.NOTA_MINIMA_APRUEBA
			    && parciales[2] >= Aprobable.NOTA_MINIMA_APRUEBA;
		}
		
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", nota=" + nota + ", getNombre()=" + getNombre() + ", getNota()="
				+ getNota() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
