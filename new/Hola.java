import java.util.*;

public class Hola {
	
	private static String nombre = "Pato Pajaroto";
	
	public static void main(String[] zz){
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("casa");
		lista.add("pajaro");
		lista.add("coche");
		
		System.out.println("Hola mundo " + nombre);
		
		for (String cosa : lista) {
			System.out.println("Hola " + cosa);
		}
	}
}
