package revisao.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {

	public List<Produto> produtos;
	
	public Pedido() {
		this.produtos = new ArrayList<>();
	}
	
	public void adicionarProduto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		String nome = scan.nextLine();
		System.out.println("Digite o preço do produto: ");
		double preco = scan.nextDouble();
		Produto p = new Produto(nome, preco);
		produtos.add(p);
		
	}
	
	public void removerProduto() {
		Scanner scan = new Scanner(System.in);

		listarProdutos();
		
		System.out.println("Informe o índice do produto que deseja remover: ");
		int indice = scan.nextInt();
		Produto produtoARemover = new Produto();
		
		for(Produto p : produtos) {
			if(produtos.indexOf(p) == indice -1) {
				produtoARemover = p;
			}
		}
		
		if(produtoARemover.nome != null) {
		produtos.remove(produtoARemover);
		System.out.println("Removido com sucesso");
		
		} else {
			System.out.println("Produto não encontrado");
		}
	}
	
	public void listarProdutos() {
		for(Produto p : produtos) {
			System.out.print(produtos.indexOf(p) + 1 + ". ");
			System.out.println(p.nome + " R$ " + p.preco);
		}
	}
	
	public void atualizarProduto() {
		Scanner scan = new Scanner(System.in);
		listarProdutos();
		
		System.out.println("Informe o índice do produto que deseja atualizar: ");
		int indice = scan.nextInt() - 1; scan.nextLine();
		Produto produtoAAtualizar = new Produto();
		
		for(Produto p : produtos) {
			if(produtos.indexOf(p) == indice) {
				produtoAAtualizar = p;
			}
		}
		
		if(produtoAAtualizar.nome != null) {

			System.out.println("Digite o novo nome do produto: ");
			String novoNome = scan.nextLine();
			System.out.println("Digite o novo preço do produto: ");
			double novoPreco = scan.nextDouble();
			
			produtoAAtualizar.nome = novoNome;
			produtoAAtualizar.preco = novoPreco;
			
			produtos.set(indice, produtoAAtualizar);

		} else {
			System.out.println("Produto não encontrado");
		}
		

	}
}
