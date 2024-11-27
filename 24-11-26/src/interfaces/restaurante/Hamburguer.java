package interfaces.restaurante;

public class Hamburguer extends Prato {

	@Override
	public void preparar(String ingredientes) {
		System.out.println("Selecionando os ingredientes: " + ingredientes);
		System.out.println("Preparando o hambúrguer.");

		
	}

	@Override
	public void servir() {
		System.out.println("Servindo o hamburguer");
		
	}

}
