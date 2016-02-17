import java.util.*;

public class Hola {

public static String nombre;	
	public static void main(String[] zz){
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("casa");
		lista.add("pajaro");
		lista.add("coche");
		
		Integer resultado = suma();		
		System.out.println("Hola mundo " + nombre + " " + resultado.toString());
		System.out.println("Hola mundo " + nombre);


		
		for (String cosa : lista) {
			System.out.println("Hola " + cosa);
		}
		System.out.println("Hola mundo2 " + nombre);
		System.out.println("Hola mundo2 " + nombre);
		System.out.println("Hola mundo2 " + nombre);


	}
	
	public static int suma(){
		
		return 2 + 5;
		
	}
	
	public static int multiplica(){
		
		return 2 * 2;
		
	}
}

