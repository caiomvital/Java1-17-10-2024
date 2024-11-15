package cadastro_funcionarios;

public class Pessoa {

	String nome;
	int idade;
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	
	public String exibirDadosString() {
		return "Nome: " + nome +"\n" +
				"Idade: " + idade;
	}
}
