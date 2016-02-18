public class Adios {
	
	private static String nombre = "Pleguecito";

	public static int suma(int a, int b) {
	  return a + b;
	}


	public static void main(String[] zz){
		// Esto arregla el bug 2345.
		System.out.println("Hola mundo cruel" + nombre + suma(5,3));

	}

}
