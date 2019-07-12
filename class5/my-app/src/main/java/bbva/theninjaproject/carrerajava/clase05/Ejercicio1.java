package bbva.theninjaproject.carrerajava.clase05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * CONSIGNA:
 *     listar los archivos de una carpeta
 *
 */
public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		List l2 = new ArrayList();
		l2.add("Curso java");
		l2.add(Integer.valueOf(22));
		l2.add(Double.valueOf(3.55));		
		l2.add(new Persona("javier", "da silva", LocalDate.parse("1978-04-14")));
		System.out.println(l2);
		
		
		Persona p2 = new Persona("javier", "da silva", LocalDate.parse("1978-04-14"));
		
		System.out.println(l2.contains(p2));
		System.out.println(l2.get(2).equals(3.55));
		
		
		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i));			
		}

		
		List<String> l1 = new ArrayList<String>();
		l1.add("javacha");
		l1.add("quique");		
		System.out.println(l1);
		
			
		
	}
}
