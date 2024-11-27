package classes_abstratas;

public abstract class Veiculo {
	
	String marca;
	String modelo;
	int ano;
	
	public Veiculo(String marca, 
			String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		
	}
	
	
	public void acelerar() {
		System.out.println("O veículo está acelerando...");
	}
	
	public abstract void exibirDados();
	
}
