public class Adios {
	
<<<<<<< HEAD
	private static String NOMBRE = "Name";
	
=======
	private static String nombre = "THIS IS MY NAME";
	private static String nombre1 = "Pepe";
	private static String nombre2 = "Name";
	private static String nombre3 = "David";

	public static int suma(int a, int b) {
	  return a + b;
	}

>>>>>>> 53ae942ce8cb13b49382bcdda4b4066bffd13169
	public static void main(String[] zz){
<<<<<<< HEAD
		System.out.println("Adios mundo " + NOMBRE);
=======

	print();	
	}

	public static void print(){
		System.out.println("Adios a todos " + nombre);	
		System.out.println("Adios mundo " + nombre + suma(2,3));

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
>>>>>>> 99b26449e2752cbb5ecb2f7beda08e37909c31b7
	}
}
