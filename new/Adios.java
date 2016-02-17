public class Adios {
	
	private static String NOMBRE = "Name";
	
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
