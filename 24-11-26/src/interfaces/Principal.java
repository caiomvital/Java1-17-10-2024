package interfaces;

public class Principal {
public static void main(String[] args) {
	VendedorInterno tadeu = new VendedorInterno();
	tadeu.trabalhar();
	tadeu.setMatricula("123456");
	System.out.println("Matricula: " + tadeu.getMatricula());
}
}
