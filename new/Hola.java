public class Hola {
	
	private static String[] NOMBRE = {"Pato Pajaroto", "otro"};
	
	public static void main(String[] zz){
		
		int n = (int)System.currentTimeMillis() % 2;

		System.out.println("Hola mundo " + NOMBRE[n]);
	}
	
}
