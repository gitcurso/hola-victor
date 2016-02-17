import java.util.*;

public class Hola {
	
	private static String  s1 = "s1";
	private static String  s2 = "s2";
	
	private static concatenateS () {
		System.out.println(s1+s2);
	}
	private static final String NOMBRE = "Antonio";
	
    private static int otherData;
	
	public static void main(String[] zz){
                       otherData=45;
		System.out.println("Hello world " + NOMBRE + " " + otherData);
	}
	
	private static repeatS (int n) {
		for (int i=0; i < n; i++) System.out.println(s1);
	}
}

