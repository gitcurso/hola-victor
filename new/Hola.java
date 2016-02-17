import java.util.*;

public class Adios {     

public static String nombre;	
	public static void main(String[] zz){
		ArrayList<String> lista = new ArrayList<String>();     

		lista.add("casa");
		lista.add("pajaro loco");
		lista.add("coche");
		
		Integer resultado = suma();		
		System.out.println("Adios mundo " + nombre + " " + resultado.toString());     
		System.out.println("Adios mundo " + nombre);     

		for (String cosa : lista) {
			System.out.println("Adios " + cosa);
		}
                System.out.println("Adios mundo2 " + nombre);

	}
	
	public static int suma(){
		
		return 2 + 5;
		
	}
	
	public static int multiplica(){
		
		return 2 * 2;
		
	}

	public static void kk() {
		System.out.println("kk");
	}
}

