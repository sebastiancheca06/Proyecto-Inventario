
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void mostar(ArrayList<Libro> li) {
		System.out.println("LIBROS EN EL INVENTARIO");
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
	  public static void buscarcodigo(ArrayList<Libro> li) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("INGRESE EL CODIGO DEL LIBRO QUE DESEA BUSCAR: ");
		int codigoingresado = entrada.nextInt();
		for (int i=0;i<li.size();i++) {
			if (codigoingresado == li.get(i).getCodigo()) {
				System.out.println(li.get(i));	
			}
			
		}
	}
	
       public static void comprarLibro (ArrayList<Libro> li) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("INSERTE EL CODIGO DEL LIBRO QUE DESEA COMPRAR");
		int codigoingresado = entrada.nextInt();
		int cantidad;
		for (int i=0;i<li.size();i++) {
			if (codigoingresado == li.get(i).getCodigo()) {
				cantidad = li.get(i).getCantidadexistente();
				if(cantidad > 1) {
					cantidad -= 1;
					System.out.println("gracias por preferirnos");
					li.get(i).setCantidadexistente(cantidad);
					actualizar(li);
				}else {
					cantidad = 0;
					System.out.println("gracias por preferirnos");
					System.out.println("el libro que ha solicitado se termino");
					li.get(i).setCantidadexistente(cantidad);
					actualizar(li);
				}
			}
		}
	}
		
	public static void actualizar(ArrayList<Libro> li) {
		
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
		
	public static void librosMasCaros (ArrayList<Libro> li) {
		System.out.println("ANALIZANDO LIBROS MAS COSTOSOS");
	}
	
	
		public static void main(String[] args) {
			
			ArrayList<Libro> libros = new ArrayList<Libro>();
			
			Libro l1 = new Libro(1899, 2, "la casa de papel", "Alex Pina", 28.05);
			Libro l2 = new Libro(9632, 1, "Crimen y castigo", "Fedor Dostoievski", 40.50);
			Libro l3 = new Libro(7452, 3, " 100 años de Soledad ","Gabriel García Márquez",60.99);
			Libro l4 = new Libro(2587, 4, " Poesías completas" , "Antonio Machado ",50.95);
			Libro l5 = new Libro(5496, 5, "   Fausto" , "Goethe",80.05);
			
			
			
			libros.add(l1);
			libros.add(l2);
			libros.add(l3); 
			libros.add(l4);
			libros.add(l5); 
			
			
			
			mostar(libros);
			
			
	}
}
