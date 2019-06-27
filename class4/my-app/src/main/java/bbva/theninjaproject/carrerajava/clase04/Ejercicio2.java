package bbva.theninjaproject.carrerajava.clase04;


/**
 * CONSIGNA: 	
 *      declarar un String con el valor "Hola que tal!"
 *      hacer un metodo que muestre invierta esa frase
 *      imprimirla en pantalla
*      
 *       
 * 	EJEMPLO
 *      Hola que tal!    -->    !lat euq aloH
 *
 */
public class Ejercicio2 {
	
	public static void main(String[] args) {		
		String frase = "Hola que tal!";       // este String mide 13 caracteres		
		
		// Imprimo frase original
		System.out.println( frase );
		
		// Imprimo frase luego de pasar por mi método inversor de frases marca Acme
		System.out.println( alRevesadorDeFrases(frase) );
		
	}
	
	
	public static String alRevesadorDeFrases ( String frase ) {
		// COMPLETAR AQUI por favor		
		
		
		return frase ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * ¡¡SOLUCION 1!!   Generando un nuevo String, recorriendo el array "al reves" 
	 * @param frase La frase a invertir
	 * @return Un nuevo String invertido
	 */	
	public static String solucionUno (String frase) {
		String palabraAlReves = "";
		
		char[] letras = frase.toCharArray();
		
		for (int i = letras.length - 1; i >=0; i--) {
			palabraAlReves = palabraAlReves + letras[i];			
		}
		System.out.println("\nSOLUCION 1!!");
				
		return palabraAlReves;
	}
	
	
	
	
	/**
	 * ¡¡SOLUCION 2!!   Intercambio las letras de las posiciones "opuestas" o "espejo" 
	 * @param frase La frase a invertir
	 * @return Un nuevo String invertido
	 */
	public static String solucionDos (String frase) {
		char[] letras = frase.toCharArray();
		
		for (int i = 0; i < letras.length / 2; i++) {
			char temp = letras[i];
			letras[i] = letras[letras.length - i - 1];		
			letras[letras.length - i - 1] = temp;
		}		

		System.out.println("\nSOLUCION 2!!");
				
		return new String(letras);
	}
}
