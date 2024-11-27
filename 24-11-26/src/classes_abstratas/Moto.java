package classes_abstratas;

public class Moto extends Veiculo {

	public Moto(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
		
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Marca da Moto: " + this.marca);
		System.out.println("Modelo da Moto: " + this.modelo);
		System.out.println("Ano da Moto: " + this.ano);
	}

	

}
