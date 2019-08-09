package bbva.theninjaproject.carrerajava.clase07.curricula;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MateriaTest {
	
	@Test
	public void testMaterias() {

		Materia quimica    = new Materia("Quimina",    Materia.EXAMEN_FINAL,   4);
		Materia matematica = new Materia("Matemática", Aprobable.EXAMEN_FINAL, 7);
		Materia literatura = new Materia("Literatura", Aprobable.ENTREGA_TF);
		Materia fisica     = new Materia("Fisica",     Aprobable.PROMOCIONA);
		
		
		assertFalse(quimica.aprovado(2));
		assertTrue(quimica.aprovado(4));
		assertTrue(quimica.aprovado(6));
		
	}

}
