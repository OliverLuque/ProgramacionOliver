public class ejercicio3tema3 {
	public static void main(String[] args){
		String linea;
		System.out.print("Por favor, introduce su cantidad de pesetas    ");
		linea=System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );
		double total;
		total=(primerNumero*(1.0/166));
		System.out.print("  El cambio de   "+primerNumero+  "   pesetas son    " +total+   "   euros   ");
	    }
	}

