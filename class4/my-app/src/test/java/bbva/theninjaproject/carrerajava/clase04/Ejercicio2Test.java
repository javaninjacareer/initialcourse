package bbva.theninjaproject.carrerajava.clase04;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Ejercicio2Test extends TestCase
{

	
    
    public void testEjercicio2AlRevesadorDeFrasesInvierteBienUnaFrase()
    {
    	String frase = "Hola que tal!";
        assertEquals("!lat euq aloH", Ejercicio2.alRevesadorDeFrases(frase) );
    }    
    

    
    
    /**
     * Probando Ejercicio2 SolucionUno
     */
    public void testEjercicio2SolucionUnoInvierteBienUnaFrase()
    {
    	String frase = "Hola que tal!";
        assertEquals("!lat euq aloH", Ejercicio2.solucionUno(frase) );
    }
    

    
    
}
