public class Hola {

	private static String nombre = "Pato lalalalala";


	
	public static void main(String[] zz){

		Integer resultado = suma();		
		System.out.println("Hola mundo " + nombre + " " + resultado.toString());
		System.out.println("Hola mundo " + nombre);


	}
	
	public static int suma(){
		
		return 2 + 5;
		
	}
	
	public static int multiplica(){
		
		return 2 * 2;
		
	}

}
