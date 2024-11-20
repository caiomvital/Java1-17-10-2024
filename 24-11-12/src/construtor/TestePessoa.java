package construtor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePessoa {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	List<Pessoa> pessoas = new ArrayList<>();

	
	
//	Pessoa tadeu = new Pessoa("Tadeu");
//	Pessoa creso = new Pessoa("Creso");
//	Pessoa gervasio = new Pessoa("Gervásio");
	
	for(int i = 0; i < 5; i++) {
		Pessoa p = new Pessoa();
		System.out.println("Digite o nome: ");
		String nome = scan.nextLine();
		System.out.println("Digite o cpf: ");
		String cpf = scan.nextLine();
		p.nome = nome;
		p.cpf = cpf;
		pessoas.add(p);
		
	}
	
	
}
}
