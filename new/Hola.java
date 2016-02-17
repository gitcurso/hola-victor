import java.util.*;

public class Hola {
<<<<<<< db0ef5cb4af97bf163cd876d96cbf5410c26a2f5

public static String nombre;	
=======
	
	private static String nombre = "Amador";
	
>>>>>>> cambiado nombre2
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


	}
	
	public static int suma(){
		
		return 2 + 5;
		
	}
	
	public static int multiplica(){
		
		return 2 * 2;
		
	}
}

