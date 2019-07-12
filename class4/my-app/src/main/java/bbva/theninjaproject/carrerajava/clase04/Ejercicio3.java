package bbva.theninjaproject.carrerajava.clase04;

import java.io.File;



/**
 * 
 * CONSIGNA:
 *     listar los archivos de una carpeta
 *
 */
public class Ejercicio3 {
	
	public static void main(String[] args) {
		File ruta = null;
		String[] listaArchivos;
		

		// Creo un nuevo objeto File apuntando a la carpeta /tmp
		ruta = new File("/tmp");

		// Obtengo un array de nombres de archivos
		listaArchivos = ruta.list();

		
		// for tradicional - accedo al array por indice
		for (int i = 0; i < listaArchivos.length; i++) {
			System.out.println(i + " --> " + listaArchivos[i]);
		}
		
		
		
		/*
		// for each name - accedo a cada item del array
		for(String archivo : listaArchivos) {         
		   System.out.println(archivo);
		}  
		*/ 			
		
		
	}
}
