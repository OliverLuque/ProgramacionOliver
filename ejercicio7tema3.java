public class ejercicio7tema3{
	public static void main (String[] args){
		String linea;
		System.out.print("Por favor introduzca la base imponible de su factura   ");
		linea=System.console().readLine();
		int primerNumero;
		primerNumero=Integer.parseInt(linea);
		double total;
		total=(primerNumero*1.21);
		System.out.print("El total de su factura es    ");
		System.out.print(total);
	}
}
