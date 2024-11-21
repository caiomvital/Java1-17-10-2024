package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Menu;
import model.Pedido;
import model.Produto;

public class Main {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	Menu.exibirMenu();
	Menu.exibirMenu();
	Menu.exibirMenu();
	Menu.exibirMenu();

	
	int valor = 2 + 2;
	String x = Integer.toString(valor);
	
	
	
	//	Random r = new Random();
//	
//	int sorteado = r.nextInt(3);
//	List<Integer> numeros = new ArrayList<>();
//	
//	for(int i = 1; i <= 3; i++) {
//		numeros.add(i);
//	}
//	
//	System.out.println("Número sorteado: " + numeros.get(sorteado));
	
	List<Produto> produtosBase = new ArrayList<>();
	produtosBase.add(new Produto("Leite Ninho Lata 400g", 18.99));
	produtosBase.add(new Produto("Coca Cola Lata 350ml", 2.99));
	produtosBase.add(new Produto("Margarina Becel 500g", 4.99));
	produtosBase.add(new Produto("Iogurte Batavo 6un", 12.36));
	produtosBase.add(new Produto("Iogurte Betânia 6un", 15.49));
	List<Produto> produtos = new ArrayList<>();
	//Produto pr = new Produto("Leite Ninho Lata 800g", 38.99);
	// System.out.println(pr);
	
	Pedido p = new Pedido(produtosBase);
	
	p.listarProdutos();
	
	Produto produto = p.localizarProduto();
	
	if(produto != null) {
		System.out.println(produto);
	} else {
		System.out.println("Produto não encontrado.");
	}
}
}
