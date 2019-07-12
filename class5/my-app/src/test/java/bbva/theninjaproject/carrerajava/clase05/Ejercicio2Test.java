package bbva.theninjaproject.carrerajava.clase05;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class Ejercicio2Test {

	Carrera carrera_backend;
	Carrera carrera_frontend;
	
	@Before
	public void crearCarreras() {
		
		Curso java_inicial  = new Curso("NEXTG_J001",  "Java Inicial");
		Curso java_avanzado = new Curso("NEXTG_J002",  "Java Avanzado");
		Curso apis          = new Curso("NEXTG_API01", "API REST");
		
		Curso devops_git    = new Curso("DEVOP_DV01",  "DevOps - Git");
		Curso devops_cicd   = new Curso("DEVOP_DV02",  "DevOps - CI/CD");
		
		Curso html          = new Curso("FRONT_H001",  "HTML5, CSS3");
		Curso javascritpt   = new Curso("FRONT_JS02",  "Javascritpt");
		
		// Carrera backend		
		this.carrera_backend  = new Carrera("Backend Developer");
		
		this.carrera_backend.addCurso(java_inicial);
		this.carrera_backend.addCurso(java_avanzado);
		this.carrera_backend.addCurso(apis);
		this.carrera_backend.addCurso(devops_cicd);
		this.carrera_backend.addCurso(devops_git);
		
		System.out.println("Carrera Backend:  " + carrera_backend);

		// Carrera Frontend
		this.carrera_frontend = new Carrera("Frontend Developer");
		
		this.carrera_frontend.addCurso(javascritpt);
		this.carrera_frontend.addCurso(html);
		this.carrera_frontend.addCurso(devops_git);
		this.carrera_frontend.addCurso(devops_cicd);
		
		System.out.println("Carrera Frontend: " + carrera_frontend);
	}

	
	@Test
	public void testConsultarCurso() {
	
		String codeCurso = "NEXTG_J001";
		
		assertTrue(  carrera_backend.contiene(codeCurso));
		assertTrue(!carrera_frontend.contiene(codeCurso));
	}

	
	@Test
	public void testElimianrCurso() {
	
		String codeCurso = "DEVOP_DV02";
		
		assertTrue(  carrera_backend.contiene(codeCurso));
		assertTrue( carrera_frontend.contiene(codeCurso));
		
		carrera_backend.eliminar(codeCurso);
		
		assertTrue(! carrera_backend.contiene(codeCurso));
	}
	
	@Test
	public void testAgregarCurso() {
	
		String CODE_CURSO = "FRONT_PL01";
		
		assertTrue(!carrera_frontend.contiene(CODE_CURSO));
		
		// Agregamos el Curso de Polymer
		Curso polymer = new Curso(CODE_CURSO,  "Polymer");
		
		carrera_frontend.addCurso(polymer);
		
		assertTrue(carrera_frontend.contiene(CODE_CURSO));
		
		// Lo reemplazamos por una version mas nueva del curso
		polymer = new Curso(CODE_CURSO,  "Polymer v3");
		
		carrera_frontend.addCurso(polymer);
		
		assertTrue(carrera_frontend.contiene(CODE_CURSO));

		// Vemos la lista
		System.out.println("Carrera Frontend Actualizada: " + carrera_frontend);
	}

}
