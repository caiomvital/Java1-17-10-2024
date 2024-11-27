package heranca;

public class Principal {
public static void main(String[] args) {
	
	Gato tadeu = new Gato();
	tadeu.nome = "Tadeu";
	tadeu.peso = 1.5;
	tadeu.emitirSom();
	Cachorro creso = new Cachorro();
	creso.emitirSom();
	
}
}
