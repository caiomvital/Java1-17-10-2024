package cadastro_funcionarios;

public class Funcionario extends Pessoa {

	double salario;
	
	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Salário: R$ " + this.salario);
	}
	
	
	
}
