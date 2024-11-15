package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteConta {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Conta c1 = new Conta("Tadeu", 500);
	Conta c2 = new Conta("Jessica");
	Conta c3 = new Conta();
	//c1.titular = "Bruninha";
	c1.sacar(500);
	c2.depositar(500);
	
	System.out.println(c1.getTitular());
	System.out.println("Saldo da C1: " + c1.getSaldo()); 
	
	
	
	
	
//	List<Conta> contas = new ArrayList<>();
	
//	for (int i = 0; i < 5; i++) {
//		
//		System.out.println("Informe o nome do titular: ");
//		String nome = scan.nextLine();
//		System.out.println("Informe o valor do depósito inicial: ");
//		double deposito = scan.nextDouble(); scan.nextLine();
//		
//		Conta c = new Conta(nome, deposito);
//		contas.add(c);		
//	}
//	
//	
//for(Conta conta : contas) {
//	System.out.println(conta.titular);
//	System.out.println(conta.saldo);
//}
	
	
//	List<String> nomes = new ArrayList<>();
//	
//	for(int i = 0; i < 5; i++) {
//		System.out.println("Digite o nome #" + (i+1));
//		String nome = scan.nextLine();
//		nomes.add(nome);
//		
//	}
//	
//	System.out.println(nomes);
	

//	
	
}






}
