package padaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPadaria {

	List<Cliente> clientes = new ArrayList<>();
	
	public void adicionarCliente() {
		Scanner scan = new Scanner(System.in);

		Cliente cliente = new Cliente();
		System.out.println("Entre com o nome do cliente: ");
		cliente.nome = scan.nextLine();

		System.out.println("Entre com o CPF do cliente: ");
		String cpf = scan.nextLine();

		while (!cpf.matches("\\d{11}")) {
			//"\\d{11}" expressao regular -> regex ou regular expression
			System.out.println("CPF inválido. Tente novamente:");
			cpf = scan.nextLine();
		}


	for(Cliente c : clientes) {
		while(c.cpf.equals(cpf)) {
	System.out.println("CPF já cadastrado. Tente novamente:");
	cpf = scan.nextLine();
	}
	 }

		cliente.cpf = cpf;
		
		clientes.add(cliente);

	}
	
	public void listarClientes() {
		for(Cliente c : clientes) {
			System.out.println(c.nome);
			System.out.println(c.cpf);
		}
	}
	
	public Cliente localizarClientePorCPF(String cpf) {
		for(Cliente cliente : clientes) {
			if(cliente.cpf.equals(cpf)) {
				return cliente;
			} 
		
		}
		
		System.out.println("Cliente não encontrado");
		return null;
	}
}
