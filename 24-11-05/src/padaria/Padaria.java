package padaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Padaria {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

CadastroPadaria cp = new CadastroPadaria();

boolean executar = true;

System.out.println("Bem-vindo à Padaria A Massa e o Baguete");

while (executar) {
	System.out.println("Digite 1 para cadastrar um cliente: ");
	System.out.println("Digite 2 para cadastrar uma receita: ");
	int opcao = scan.nextInt();
	scan.nextLine();
	switch (opcao) {
	case 1 -> { cp.adicionarCliente();
	executar = false;
}
	case 2 -> {
		/*Após o sucesso do cadastro, o Sr. Tadeu gostaria de expandir 
		as funcionalidades do sistema. Ele deseja permitir que os clientes 
		possam adicionar receitas à sua conta. Para garantir que 
		as receitas sejam associadas corretamente aos clientes, 
		o CPF deve ser validado a cada vez que um cliente tentar 
		adicionar uma nova receita.*/
		
		
	}
	}
}

cp.listarClientes();		

	}

	
}
