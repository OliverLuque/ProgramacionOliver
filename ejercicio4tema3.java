public class ejercicio4tema3 {
	public static void main(String[] args){
		System.out.print("Por favor, introduce el primer número  ");
		String linea;
		linea=System.console().readLine();
		int primerNumero;
		primerNumero=Integer.parseInt(linea);
		System.out.print("Introduce el segundo número  ");
		linea=System.console().readLine();
		int segundoNumero;
		segundoNumero=Integer.parseInt(linea);
		int total1;
		total1=(primerNumero+segundoNumero);
		System.out.print("La suma del primer número mas el segundo es   ");
		System.out.println (total1);
		int total2;
		total2=(primerNumero-segundoNumero);
		System.out.print("La resta del primer número menos el segundo es   ");
		System.out.println (total2);
		int total3;
		total3=(primerNumero*segundoNumero);
		System.out.print("La multiplicación del primer numero por el segundo es  ");
		System.out.println(total3);
		double total4;
		total4=((double)primerNumero/segundoNumero);
		System.out.print("La división entre los dos número es   ");
		System.out.print(total4);
	}
}
