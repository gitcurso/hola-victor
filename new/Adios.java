public class Adios {
	

	private static String nombre = "Don José";

	public static void main(String[] zz){

		System.out.println("Adios " + nombre);
		System.out.println("Adios mundo " + nombre + suma(2,3));
	}



	public static int suma(int a, int b) {
		
		return a + b;

		int foo;
		String StringThatCouldBeANumberOrNot = "26263Hello"; //will throw exception
		String StringThatCouldBeANumberOrNot2 = "26263"; //will not throw exception
		try {
			  foo = Integer.parseInt(StringThatCouldBeANumberOrNot);
		} catch (NumberFormatException e) {
			  //Will Throw exception!
			  //do something! anything to handle the exception.
		}

		try {
			  foo = Integer.parseInt(StringThatCouldBeANumberOrNot2);
		} catch (NumberFormatException e) {
			  //No problem this time, but still it is good practice to care about exceptions.
			  //Never trust user input :)
			  //Do something! Anything to handle the exception.
		}
	}



}
