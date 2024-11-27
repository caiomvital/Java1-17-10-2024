package classes_abstratas;

public class Carro extends Veiculo {

	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
		
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Marca do Carro: " + this.marca);
		System.out.println("Modelo do Carro: " + this.modelo);
		System.out.println("Ano do Carro: " + this.ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println("O carro está acelerando");
	}
	

}
