package revisao.controller;

import java.util.Scanner;

import revisao.model.Pedido;

public class Aplicacao {

	static String menu = """
			
			1. Adicionar Produto
			2. Listar Produtos
			3. Atualizar Produto
			4. Remover Produto
			5. Sair
			
			""";
	
	public static void iniciarAplicacao() {
		Scanner scan = new Scanner(System.in);
		Pedido pedido = new Pedido();

		while(true) {
			System.out.println(menu);
			int opcao = scan.nextInt();
			switch(opcao) {
			case 1 -> pedido.adicionarProduto();
			case 2 -> pedido.listarProdutos();
			case 3 -> pedido.atualizarProduto();
			case 4 -> pedido.removerProduto();
			
			}
			
			if(opcao > 4) {
				System.out.println("Obrigado pela preferência");
				break;
			
			}
		}
	}
	
}
