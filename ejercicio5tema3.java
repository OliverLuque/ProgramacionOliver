public class ejercicio5tema3{
	public static void main(String[] args){
		String linea;
		System.out.print("Por favor introduce el lado mayor del rectángulo  ");
		linea=System.console().readLine();
		int primerNumero;
		primerNumero=Integer.parseInt(linea);
		System.out.print("Introduce el lado menor del rectángulo   ");
		linea=System.console().readLine();
		int segundoNumero;
		segundoNumero=Integer.parseInt(linea);
		int total;
		total=(primerNumero*segundoNumero);
		System.out.print("El área del rectángulo es   ");
		System.out.print(total);
		}
	}
