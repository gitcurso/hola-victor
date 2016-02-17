public class presentacion {
	
	private static String nombre = "A";
	private static String nombre2 = "A2";
	private static int edat = 17;
	private static int hola = "hola";

	
	public static void main(String[] zz){

		System.out.println(hola + "mundo " + nombre + "tienes" + edat + "años");
		Map<String, Object> mp = null;
		Iterator it = mp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}
	}
}
