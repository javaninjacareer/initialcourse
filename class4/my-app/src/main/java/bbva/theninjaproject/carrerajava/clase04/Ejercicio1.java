package bbva.theninjaproject.carrerajava.clase04;


/**
 * CONSIGNA: 	
 *      declarar un array de enteros, de 11 posiciones
 *      llenarlo de nros tal que:
 *          - la primer posicion del array contenga el nro de posicion ultima
 *          - la segunda posicion del array contenga el nro de posicion ante ultima
 *          - .....
 *          - la ultima posicion del array contenga el nro de posicion primera
 *       
 *      imprimirlo en pantalla
 *      
 *       
 * 	EJEMPLO
 *      arr[0] = 10
 *      arr[1] = 9
 *      ...
 *      arr[10] = 0
 *
 */
public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		// COMPLETAR AQUI por favor
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * ¡¡SOLUCION!!
	 */
	public static void solucion() {
		int nros[] = new int[11];
		for (int i = 0; i < nros.length; i++) {
			nros[i] = nros.length - i - 1;			
		}
		for (int i = 0; i < nros.length; i++) {
			System.out.println("valor de arr[" + i + "] ---> " + nros[i]);
			
			// System.out.format("valor de arr[%02d] ---> %d \n", i, nros[i]);
		}		
		return ;
	}
}
