package cadastro_funcionarios;

public class TesteFuncionario {
public static void main(String[] args) {
	
	Funcionario tadeu = new Funcionario("Tadeu", 30, 3600.99);
	Funcionario creso = new Funcionario("Creso", 21, 1400);
	Funcionario herodoto = new Funcionario("Herodoto", 75, 49000);
	tadeu.exibirDados();
	String infoDeTadeu = tadeu.exibirDadosString();
	System.out.println(infoDeTadeu);
	creso.exibirDados();
	herodoto.exibirDados();
	
}
}
