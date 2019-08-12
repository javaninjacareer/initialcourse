package bbva.theninjaproject.carrerajava.clase07.curricula;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import bbva.theninjaproject.carrerajava.clase07.participantes.Alumno;

public class MateriaTest {
	
	Materia quimica;
	Materia matematica;
	Materia literatura;
	Materia fisica;
	
	@Before
	public void test() {
		
		// Se have Override de los constructores
		quimica    = new Materia("Quimina",    Materia.EXAMEN_FINAL,   4);
		matematica = new Materia("Matemática", Aprobable.EXAMEN_FINAL, 7);
		literatura = new Materia("Literatura", Aprobable.ENTREGA_TF);
		fisica     = new Materia("Fisica",     Aprobable.PROMOCIONA);
	}
	
	@Test
	public void testMaterias() {

		assertFalse(quimica.aprobado(2));
		assertTrue(quimica.aprobado(4));
		assertTrue(quimica.aprobado(6));
		
	}

	
	@Test
	public void testAlumnoMateria() {
		
		// Quimica: quimica >= 4
		
		Alumno juanPablo = new Alumno("Juan Pablo", "Firrincho", 27);
		
		juanPablo.agregarNota(quimica, 8);
		juanPablo.agregarNota(quimica, 6);
		juanPablo.agregarNota(quimica, 10);
		
		assertEquals(8, juanPablo.getPromedio(), 0.5);
		
		assertTrue(quimica.aprobado(juanPablo.getPromedioInt()));
		
		// JONATAN: Matematica >= 7
		
		Alumno jonathan = new Alumno("Jonathan", "C.", 31);
		
		jonathan.agregarNota(matematica, 5);
		jonathan.agregarNota(matematica, 6);
		jonathan.agregarNota(matematica, 7);
		
		assertEquals(6, jonathan.getPromedio(), 0.5);
		
		assertFalse(matematica.aprobado(jonathan.getPromedioInt()));
		
		
		// Fabian: Literatura -> Entrego el TF mayor a 20 hojas
		
		Alumno fabian = new Alumno("Fabián", "F.", 58);
		
		fabian.entregarTrabajo(64);
		assertTrue(literatura.aprobado(fabian.isTf_entregado(), fabian.getTf_cant_hojas()));

	}

}
