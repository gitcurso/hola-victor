public class Hola {
	
 
	private static String nombre = "Don Pepito";

	
	public static void main(String[] zz){

		Integer resultado = suma();		
		System.out.println("Hola mundo " + nombre + " " + resultado.toString());
		System.out.println("Hola mundo " + nombre);
		System.out.println("Hola mundo2 " + nombre);

	}
	
	public static int suma(){
		
		return 2 + 5;
		
	}
	
	public static int multiplica(){
		
		return 2 * 2;
		
	}

}
