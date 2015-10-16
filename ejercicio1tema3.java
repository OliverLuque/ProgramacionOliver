public class ejercicio1tema3 {
	public static void main(String[] args) {
		String linea;
		
		System.out.print("Por favor, introduce el primer número  ");
		linea=System.console().readLine();
		int primerNumero;
		primerNumero=Integer.parseInt(linea);
		
		System.out.print("Introduce el segundo número  ");
		linea=System.console().readLine();
		int segundoNumero;
		segundoNumero=Integer.parseInt(linea);
		int total;
		total=(primerNumero*segundoNumero);
		System.out.print("El primer número introducido es   "  +primerNumero);
		System.out.println("   y el segundo es   "  +segundoNumero);
		System.out.print("El primer número multiplicado por el segundo es  ");
		System.out.print(total);
		}
}
