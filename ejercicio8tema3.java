public class ejercicio8tema3{
	public static void main (String[] args){
		String linea;
		System.out.print("Por favor introduzca las horas trabajadas   ");
		linea=System.console().readLine();
		int primerNumero;
		primerNumero=Integer.parseInt(linea);
		int total;
		total=(primerNumero*12);
		System.out.print("El total de su salario es    ");
		System.out.print(total);
	}
}
