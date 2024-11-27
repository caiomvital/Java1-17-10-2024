package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("Digite um valor");
	int valor1 = scan.nextInt();
	
	System.out.println("Digite outro valor");
	int valor2 = scan.nextInt();
	
	
	System.out.println(dividir(valor1, valor2));
	System.out.println("Olá, mundo");

}

public static double dividir(int a, int b) throws ArithmeticException {
	
	
	
	return a / b;
}

}
