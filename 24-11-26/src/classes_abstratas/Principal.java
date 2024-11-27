package classes_abstratas;

public class Principal {
public static void main(String[] args) {
	Carro carro = new Carro("Honda", "Civic", 2008);
	Moto moto = new Moto("Honda", "XRE", 2022);
	
	carro.exibirDados();
	System.out.println();
	moto.exibirDados();
	carro.acelerar(); // override do método
	moto.acelerar(); // sem override
	
}
}
