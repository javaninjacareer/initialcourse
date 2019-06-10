package bbva.theninjaproject.carrerajava.clase03;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Persona p1 = new Persona();
        p1.nombre = "Mariano";
        
        Persona p2 = new Persona();
        p2.nombre = "Jorge";
        		
        p1.saludar();
        p2.saludar();
    }
}
