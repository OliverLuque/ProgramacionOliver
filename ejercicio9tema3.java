public class ejercicio9tema3{
	public static void main(String[] args){
		String linea;
		System.out.print("Por favor introduce el valor del radio    ");
		linea=System.console().readLine();
		double primerNumero;
		primerNumero=Integer.parseInt(linea);
		System.out.print("Por favor, introduce el valor de la altura    ");
		linea=System.console().readLine();
		double segundoNumero;
		segundoNumero=Integer.parseInt(linea);
		double total;
		total=((0.33*3.14)*Math.pow(primerNumero,2)*segundoNumero);
		System.out.print("El valor del numero V es   " +total);
	}
}
