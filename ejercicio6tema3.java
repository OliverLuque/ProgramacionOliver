public class ejercicio6tema3{
	public static void main (String[] args){
		String linea;
		System.out.print("Por favor introduce la base del triángulo    ");
		linea=System.console().readLine();
		int primerNumero;
		primerNumero=Integer.parseInt(linea);
		System.out.print("Por favor, introduce la altura del triángulo    ");
		linea=System.console().readLine();
		int segundoNumero;
		segundoNumero=Integer.parseInt(linea);
		int total;
		total=((primerNumero*segundoNumero)/2);
		System.out.print("El área del triángulo es   ");
		System.out.print(total);
		}
	}
