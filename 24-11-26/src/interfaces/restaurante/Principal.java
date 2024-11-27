package interfaces.restaurante;

public class Principal {
public static void main(String[] args) {
	Pizza pizza = new Pizza();
	pizza.ingredientes = "Queijo, Molho de Tomate, Ovo, Pepperoni";
	pizza.preparar(pizza.ingredientes);
	pizza.servir();
	
	Hamburguer mac = new Hamburguer();
	mac.ingredientes = "dois hamburgueres, alface, queijo, molho especial, cebola, picles e um pão com gergelim";
	mac.preparar(mac.ingredientes);
	mac.servir();
	
}
}
