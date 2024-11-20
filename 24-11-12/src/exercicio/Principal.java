package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	
	ContaCorrente cc = new ContaCorrente("Tadeu", 1000);
	ContaPoupanca cp = new ContaPoupanca("Creso", 500);
//	cc.titular = "Tadeu"; // tentativa de acesso direto
	cp.setTitular("Creso");
	cp.depositar(500);
	System.out.println(cc.getSaldo());
	
	List<ContaCorrente> contas = new ArrayList<>();
	
	String menu = """
			1. criar conta
			2. depositar
			3. sacar
			""";
	Scanner scan = new Scanner(System.in);

	int opcao = scan.nextInt(); scan.nextLine();
	
	switch(opcao) {
	case 1 -> {
		System.out.println("Digite o nome do titular");
		String nome = scan.nextLine();
		System.out.println("Digite o saldo inicial: ");
		double saldoInicial = scan.nextDouble(); scan.nextLine();
		ContaCorrente conta = new ContaCorrente(nome, saldoInicial);
		contas.add(conta);
	}
	case 2 -> {
		System.out.println("Diga o valor que quer depositar");
		double valor = scan.nextDouble(); scan.nextLine();
		contas.get(0).depositar(valor);
	}
	}
	
}
}
