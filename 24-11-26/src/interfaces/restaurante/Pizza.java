package interfaces.restaurante;

public class Pizza extends Prato {

	@Override
	public void preparar(String ingredientes) {
		System.out.println("Pegando os ingredientes: " + ingredientes);
		System.out.println("Preparando a pizza.");
	}

	@Override
	public void servir() {
		System.out.println("Servindo em fatias.");
		
	}

	
	
}
