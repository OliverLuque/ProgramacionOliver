public class ejercicio2tema3 {
	public static void main(String[] args){
		String linea;
		System.out.print("Por favor, introduce su cantidad de euros    ");
		linea=System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );
		int total;
		total=(primerNumero*166);
		System.out.print("  El cambio de   "+primerNumero+  "   euros son    " +total+   "   pesetas   ");
	    }
	}
