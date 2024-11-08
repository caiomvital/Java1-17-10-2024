package padaria;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	String cpf;
	List<String> receitas = new ArrayList<>();
	
	public String exibirDados() {
		return "Nome: " + nome + "\n" +
			   "CPF: " + cpf;
		}
	
	public void mudarNomeDoCliente(String nome) {
		this.nome = nome;
	}
	
	}
	

