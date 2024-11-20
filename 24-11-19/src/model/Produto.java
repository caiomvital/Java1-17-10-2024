package model;

//classe de modelo
public class Produto {

	private String nome;
	private double preco;
	
	//metodo construtor que exige nome e preco ao criar um objeto Produto
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	@Override
	public String toString() {
		String dados = "Nome do Produto: " + this.nome +
				"\nPreço do Produto: R$ " + this.preco;
		
		return dados;
	}
	
	
}
