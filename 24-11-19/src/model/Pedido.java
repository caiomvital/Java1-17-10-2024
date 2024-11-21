package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pedido {

	private List<Produto> produtos = new ArrayList<>();
	
	public Pedido() {}
	
	public Pedido(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void adicionarProduto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o nome do produto: ");
		String nome = scan.nextLine();
		System.out.println("Entre com o preço do produto: ");
		double preco = scan.nextDouble();
		Produto produto = new Produto(nome, preco);
		produtos.add(produto);
	}
	
	public void removerProduto() {} // 1
	public void atualizarProduto() {} // 2
	public Produto localizarProduto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do produto que deseja encontrar: ");
		String nome = scan.nextLine();
		for(Produto produto : produtos) {
		
		if(produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
			return produto;
		}
		
		}
		return null;
		
		
		
		
	} // 3
	
	public void listarProdutos() {
		for(Produto p : produtos) {
			System.out.println("ID do Produto: " + produtos.indexOf(p));
			System.out.println(p);
		}
	} 
	
}
