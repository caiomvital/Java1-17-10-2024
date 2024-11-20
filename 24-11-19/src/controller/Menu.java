package controller;

public class Menu {

	private final static String MENU = """
			1. Iniciar Pedido
			2. Finalizar Pedido
			3. Alterar Pedido
			""";
	
	public static void exibirMenu() {
		System.out.println(MENU);
	}
}
