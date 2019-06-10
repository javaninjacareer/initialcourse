package bbva.theninjaproject.carrerajava.clase03;

import bbva.theninjaproject.carrerajava.clase03.step1.PersonaStep1;
import bbva.theninjaproject.carrerajava.clase03.step2.PersonaStep2;

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
}
