package bbva.theninjaproject.carrerajava.clase07.curricula;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MateriaTest {
	
	Materia quimica;
	Materia matematica;
	Materia literatura;
	Materia fisica;
	
	@Before
	public void test() {
		
		quimica    = new Materia("Quimina",    Materia.EXAMEN_FINAL,   4);
		matematica = new Materia("Matemática", Aprobable.EXAMEN_FINAL, 7);
		literatura = new Materia("Literatura", Aprobable.ENTREGA_TF);
		fisica     = new Materia("Fisica",     Aprobable.PROMOCIONA);
	}
	
	@Test
	public void testMaterias() {

		assertFalse(quimica.aprovado(2));
		assertTrue(quimica.aprovado(4));
		assertTrue(quimica.aprovado(6));
		
	}

}
