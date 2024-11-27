package heranca;

public class Principal {
public static void main(String[] args) {
	Cliente c = new Cliente();
	Vendedor v = new Vendedor();
	
	c.nome = "Tadeu";
	c.cpf = "012345";
	c.endereco = "Avenida Mané Pá";
	
	v.nome = "Gervásio";
	v.cpf = "678910";
	v.matricula = "0123";
	v.salario = 2500.99;
	
	
}
}
