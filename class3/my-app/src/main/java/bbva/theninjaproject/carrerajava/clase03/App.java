package bbva.theninjaproject.carrerajava.clase03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import bbva.theninjaproject.carrerajava.clase03.step1.PersonaStep1;
import bbva.theninjaproject.carrerajava.clase03.step2.PersonaStep2;
import bbva.theninjaproject.carrerajava.clase03.step3.PersonaStep3;
import bbva.theninjaproject.carrerajava.clase03.step3.ProgramadorStep3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ejemplo_step1();
        ejemplo_step2();
        ejemplo_step3();
        ejemplo_step4();
    }
    
    
    /**
     * STEP 1: Ejemplo de varias instancias de una misma clase.
     */
    public static void ejemplo_step1()
    {
    	System.out.println( "App.ejemplo_step1()");
    	
        PersonaStep1 p1 = new PersonaStep1();
        p1.nombre = "Mariano";
        
        PersonaStep1 p2 = new PersonaStep1();
        p2.nombre = "Jorge";
        		
        p1.saludar();
        p2.saludar();
    }
    
    /**
     * STEP 2: · Ejemplo de constructor básico.
     */
    public static void ejemplo_step2()
    {
    	System.out.println( "App.ejemplo_step2()");
    	
    	PersonaStep2 p1 = new PersonaStep2("Mariano");
        PersonaStep2 p2 = new PersonaStep2("Jorge");
        		
        p1.saludar();
        p2.saludar();
    }
    
    /**
     * STEP 3: Ejemplo - publico y privado
     *         Ejemplo de dos tipos de constructores
     */
    public static void ejemplo_step3()
    {
    	System.out.println( "App.ejemplo_step3()");
    	
		// Mariano  Nacido en 1990 - Atributo privado "Edad" se calcula
        PersonaStep3 mariano = new PersonaStep3("Mariano", "1990-01-24");

        mariano.saludar();
        
		// Jorge  Nacido en 1982 - Atributo privado "Edad" se calcula		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate jorge_fechaNac = LocalDate.parse("31/03/1982", fmt);
		PersonaStep3 jorge = new PersonaStep3("Jorge", jorge_fechaNac);
		
		jorge.saludar();
			
		// Atributo publico "nombre" se puede modificar directamente:
		mariano.nombre = "Mariano Perez";
		jorge.nombre = "Jorge Garibaldi";
		
		mariano.saludar();
		jorge.saludar();

		
		// Atributo publico "nombre" se puede modificar a través de un metodo:
		mariano.setNombre("Mariano Alberto Perez");
		jorge.setNombre("Jorge Julian Garibaldi");
		
		mariano.saludar();
		jorge.saludar();
		
		
		// Atributo privado "domicilio" solo se puede modificar por un metodo:
		mariano.setDomicilio("Reconquista 122");
		jorge.setDomicilio("Perón 234");
		
		System.out.println("Domicilio de " + mariano.getNombre() + ": " + mariano.getDomicilio());
		System.out.println("Domicilio de " + jorge.getNombre() + ": " + jorge.getDomicilio());
    }
    
    /**
     * STEP 4: demo de "protected" dentro de la herencia se utiliza herencia
     */
    public static void ejemplo_step4()
    {
    	System.out.println( "App.ejemplo_step4()");
    	
    	// El atributo "protected" lo pueden modificar las subclases
    	ProgramadorStep3 carlos = new ProgramadorStep3("Carlos", "1974-02-18");

        carlos.saludar();

    	
    }
}
